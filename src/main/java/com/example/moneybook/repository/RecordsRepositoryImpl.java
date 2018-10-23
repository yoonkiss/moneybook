package com.example.moneybook.repository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.moneybook.dto.RecordFilter;
import com.example.moneybook.dto.RecordResponse;
import com.example.moneybook.model.QRecord;
import com.example.moneybook.model.Record;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.JPQLQuery;

@Repository
public class RecordsRepositoryImpl extends QueryDslRepositorySupport implements RecordsRepositoryCustom {
    public RecordsRepositoryImpl() {
        super(Record.class);
    }

    @Value("${search.sort.defaultDirection}")
    private String defaultDirection;

    @Value("${search.sort.defaultOffset}")
    private int defaultOffset;

    @Value("${search.sort.defaultLimit}")
    private int defaultLimit;

    @Override
    public Page<RecordResponse> search(RecordFilter filter) {
        Pageable pageable = filter.getPageable();
        QRecord record = QRecord.record;

        JPQLQuery<Record> query = from(record);

        if (filter.getRecordAt() != null) {
            LocalDate date = LocalDate.parse(filter.getRecordAt());
            query.where(record.recordAt.eq(date));
        } else {
            if (filter.getRecordAtFrom() != null) {
                LocalDate from = LocalDate.parse(filter.getRecordAtFrom());

                if (filter.getRecordAtTo() != null) {

                    LocalDate to = LocalDate.parse(filter.getRecordAtTo());
                    query.where(record.recordAt.between(from, to));
                } else {
                    query.where(record.recordAt.after(from.minusDays(1)));
                }
            } else {
                if (filter.getRecordAtTo() != null) {
                    LocalDate to = LocalDate.parse(filter.getRecordAtTo());
                    query.where(record.recordAt.before(to.plusDays(1)));
                }
            }
        }

        if (pageable != null) {
            Sort sort = new Sort(Direction.fromString(defaultDirection), "recordAt");

            filter.setPageable(new PageRequest(defaultOffset, defaultLimit, sort));

        } else if (pageable.getSort() == null) {
            Sort sort = new Sort(Direction.fromString(defaultDirection), "recordAt");
            filter.setPageable(new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), sort));
        }

        QueryResults<Record> records = getQuerydsl().applyPagination(pageable, query).fetchResults();

        List<RecordResponse> recordDtos = records.getResults().stream()
                .map(RecordsRepositoryImpl::createRecordResponseoFromTuple).collect(Collectors.toList());

        return new PageImpl<RecordResponse>(recordDtos, filter.getPageable(), records.getTotal());
    }

    private Date toDate(LocalDate localDate) {
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return date;
    }

    public static RecordResponse createRecordResponseoFromTuple(Record record) {
        return new RecordResponse(record);
    }
}
