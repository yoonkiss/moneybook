package com.example.moneybook.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommonCode is a Querydsl query type for CommonCode
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommonCode extends EntityPathBase<CommonCode> {

    private static final long serialVersionUID = 770811059L;

    public static final QCommonCode commonCode = new QCommonCode("commonCode");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> parent_id = createNumber("parent_id", Integer.class);

    public final NumberPath<Integer> sorting = createNumber("sorting", Integer.class);

    public final DateTimePath<java.util.Date> updateAt = createDateTime("updateAt", java.util.Date.class);

    public QCommonCode(String variable) {
        super(CommonCode.class, forVariable(variable));
    }

    public QCommonCode(Path<? extends CommonCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommonCode(PathMetadata metadata) {
        super(CommonCode.class, metadata);
    }

}

