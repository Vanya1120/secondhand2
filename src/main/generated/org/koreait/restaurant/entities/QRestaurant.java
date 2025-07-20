package org.koreait.restaurant.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRestaurant is a Querydsl query type for Restaurant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRestaurant extends EntityPathBase<Restaurant> {

    private static final long serialVersionUID = -2109479044L;

    public static final QRestaurant restaurant = new QRestaurant("restaurant");

    public final StringPath address = createString("address");

    public final StringPath category = createString("category");

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lon = createNumber("lon", Double.class);

    public final StringPath name = createString("name");

    public final StringPath roadAddress = createString("roadAddress");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath zipcode = createString("zipcode");

    public final StringPath zonecode = createString("zonecode");

    public QRestaurant(String variable) {
        super(Restaurant.class, forVariable(variable));
    }

    public QRestaurant(Path<? extends Restaurant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRestaurant(PathMetadata metadata) {
        super(Restaurant.class, metadata);
    }

}

