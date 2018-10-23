package com.example.moneybook.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCreditCard is a Querydsl query type for CreditCard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCreditCard extends EntityPathBase<CreditCard> {

    private static final long serialVersionUID = -978011164L;

    public static final QCreditCard creditCard = new QCreditCard("creditCard");

    public final StringPath billingAt = createString("billingAt");

    public final StringPath endAt = createString("endAt");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath startedAt = createString("startedAt");

    public final StringPath userId = createString("userId");

    public QCreditCard(String variable) {
        super(CreditCard.class, forVariable(variable));
    }

    public QCreditCard(Path<? extends CreditCard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCreditCard(PathMetadata metadata) {
        super(CreditCard.class, metadata);
    }

}

