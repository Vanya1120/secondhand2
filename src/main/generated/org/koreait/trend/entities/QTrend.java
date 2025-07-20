package org.koreait.trend.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTrend is a Querydsl query type for Trend
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrend extends EntityPathBase<Trend> {

    private static final long serialVersionUID = 1811422532L;

    public static final QTrend trend = new QTrend("trend");

    public final org.koreait.global.entities.QBaseEntity _super = new org.koreait.global.entities.QBaseEntity(this);

    public final StringPath category = createString("category");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final StringPath keywords = createString("keywords");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath wordCloud = createString("wordCloud");

    public QTrend(String variable) {
        super(Trend.class, forVariable(variable));
    }

    public QTrend(Path<? extends Trend> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTrend(PathMetadata metadata) {
        super(Trend.class, metadata);
    }

}

