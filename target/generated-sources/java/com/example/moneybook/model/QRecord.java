package com.example.moneybook.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecord is a Querydsl query type for Record
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecord extends EntityPathBase<Record> {

    private static final long serialVersionUID = 1906313228L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecord record = new QRecord("record");

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    public final NumberPath<Integer> billingType = createNumber("billingType", Integer.class);

    public final QCreditCard card;

    public final NumberPath<Integer> categoryId = createNumber("categoryId", Integer.class);

    public final StringPath comments = createString("comments");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> divided = createNumber("divided", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DatePath<java.time.LocalDate> recordAt = createDate("recordAt", java.time.LocalDate.class);

    public final StringPath userId = createString("userId");

    public QRecord(String variable) {
        this(Record.class, forVariable(variable), INITS);
    }

    public QRecord(Path<? extends Record> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRecord(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRecord(PathMetadata metadata, PathInits inits) {
        this(Record.class, metadata, inits);
    }

    public QRecord(Class<? extends Record> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.card = inits.isInitialized("card") ? new QCreditCard(forProperty("card")) : null;
    }

}

