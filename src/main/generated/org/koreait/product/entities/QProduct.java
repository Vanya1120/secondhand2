package org.koreait.product.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 619047172L;

    public static final QProduct product = new QProduct("product");

    public final org.koreait.global.entities.QBaseEntity _super = new org.koreait.global.entities.QBaseEntity(this);

    public final StringPath category = createString("category");

    public final NumberPath<Integer> consumerPrice = createNumber("consumerPrice", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final StringPath description = createString("description");

    public final StringPath gid = createString("gid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> salePrice = createNumber("salePrice", Integer.class);

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final EnumPath<org.koreait.product.constants.ProductStatus> status = createEnum("status", org.koreait.product.constants.ProductStatus.class);

    public QProduct(String variable) {
        super(Product.class, forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }

}

