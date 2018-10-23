package com.example.moneybook.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRegularExpenditure is a Querydsl query type for RegularExpenditure
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRegularExpenditure extends EntityPathBase<RegularExpenditure> {

    private static final long serialVersionUID = 690803582L;

    public static final QRegularExpenditure regularExpenditure = new QRegularExpenditure("regularExpenditure");

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    public final NumberPath<Integer> categoryId = createNumber("categoryId", Integer.class);

    public final DateTimePath<java.util.Date> createdTime = createDateTime("createdTime", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> payType = createNumber("payType", Integer.class);

    public final StringPath userId = createString("userId");

    public QRegularExpenditure(String variable) {
        super(RegularExpenditure.class, forVariable(variable));
    }

    public QRegularExpenditure(Path<? extends RegularExpenditure> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegularExpenditure(PathMetadata metadata) {
        super(RegularExpenditure.class, metadata);
    }

}

