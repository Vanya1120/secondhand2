package org.koreait.trend.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTrendUrl is a Querydsl query type for TrendUrl
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrendUrl extends EntityPathBase<TrendUrl> {

    private static final long serialVersionUID = 2119629195L;

    public static final QTrendUrl trendUrl = new QTrendUrl("trendUrl");

    public final StringPath siteUrl = createString("siteUrl");

    public QTrendUrl(String variable) {
        super(TrendUrl.class, forVariable(variable));
    }

    public QTrendUrl(Path<? extends TrendUrl> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTrendUrl(PathMetadata metadata) {
        super(TrendUrl.class, metadata);
    }

}

