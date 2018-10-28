package com.example.moneybook.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.moneybook.dto.RecordFilter;
import com.example.moneybook.dto.RecordRequest;
import com.example.moneybook.dto.RecordResponse;
import com.example.moneybook.exception.ErrorCode;
import com.example.moneybook.exception.MoneyBookException;
import com.example.moneybook.model.CreditCard;
import com.example.moneybook.model.Record;
import com.example.moneybook.repository.CreditCardRepository;
import com.example.moneybook.repository.RecordsRepository;

@Service
public class RecordService {
    @Autowired
    private CreditCardRepository cardRepo;
    @Autowired
    private RecordsRepository recordsRepo;

    @Transactional
    public Record addRecord(RecordRequest request) {
        Record record = new Record();
        record.setType(request.getType());
        record.setAmount(request.getAmount());
        record.setAccount(request.getAccount());
        record.setComments(request.getComments());
        record.setDescription(request.getDescription());
        record.setDivided(request.getDivided());
        record.setUserId(request.getUserId());

        CreditCard card = cardRepo.findOne(request.getCardId());
        
        record.setCard(card);

        record.setCategoryId(request.getCategoryId());

//        Date recordAt = null;
//        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
//        try {
//            recordAt = formatDate.parse(request.getRecordAt());
//        } catch (ParseException e) {
//            throw new MoneyBookException(ErrorCode.DP_QUERY_ERROR);
//        }
       // record.setRecordAt(request.getRecordAt());

        record.setRecordAt(LocalDate.parse(request.getRecordAt()));
        record.setCreatedAt(new Date());

        Record newRecord = recordsRepo.save(record);
        return newRecord;
    }

    public Page<RecordResponse> getRecords(RecordFilter filter) {
        Page<RecordResponse> records = recordsRepo.search(filter);

        return records;
    }

    @Transactional
    public Record updateRecord(int id, RecordRequest request) {
        Record record = recordsRepo.findOne(id);

        record.setAmount(request.getAmount());
        record.setType(request.getType());
        record.setAccount(request.getAccount());
        record.setComments(request.getComments());
        record.setDescription(request.getDescription());
        record.setDivided(request.getDivided());
        record.setUserId(request.getUserId());

        CreditCard card = cardRepo.findOne(request.getCardId());

        record.setCard(card);

        record.setCategoryId(request.getCategoryId());

//        Date recordAt = null;
//        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.mm.dd");
//        try {
//            recordAt = formatDate.parse(request.getRecordAt());
//        } catch (ParseException e) {
//            throw new MoneyBookException(ErrorCode.DP_QUERY_ERROR);
//        }
//        record.setRecordAt(recordAt);

        Record newRecord = recordsRepo.save(record);
        return newRecord;
    }

    @Transactional
    public void deleteRecord(Integer id) {
        recordsRepo.delete(id);
    }
}
