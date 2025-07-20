package org.koreait.survey.diabetes.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDiabetesSurvey is a Querydsl query type for DiabetesSurvey
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDiabetesSurvey extends EntityPathBase<DiabetesSurvey> {

    private static final long serialVersionUID = -1744209488L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDiabetesSurvey diabetesSurvey = new QDiabetesSurvey("diabetesSurvey");

    public final org.koreait.global.entities.QBaseEntity _super = new org.koreait.global.entities.QBaseEntity(this);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final NumberPath<Double> bloodGlucoseLevel = createNumber("bloodGlucoseLevel", Double.class);

    public final NumberPath<Double> bmi = createNumber("bmi", Double.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> deletedAt = _super.deletedAt;

    public final BooleanPath diabetes = createBoolean("diabetes");

    public final EnumPath<org.koreait.global.constants.Gender> gender = createEnum("gender", org.koreait.global.constants.Gender.class);

    public final NumberPath<Double> hbA1c = createNumber("hbA1c", Double.class);

    public final BooleanPath heartDisease = createBoolean("heartDisease");

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final BooleanPath hypertension = createBoolean("hypertension");

    public final org.koreait.member.entities.QMember member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final EnumPath<org.koreait.survey.diabetes.constants.SmokingHistory> smokingHistory = createEnum("smokingHistory", org.koreait.survey.diabetes.constants.SmokingHistory.class);

    public final NumberPath<Double> weight = createNumber("weight", Double.class);

    public QDiabetesSurvey(String variable) {
        this(DiabetesSurvey.class, forVariable(variable), INITS);
    }

    public QDiabetesSurvey(Path<? extends DiabetesSurvey> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDiabetesSurvey(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDiabetesSurvey(PathMetadata metadata, PathInits inits) {
        this(DiabetesSurvey.class, metadata, inits);
    }

    public QDiabetesSurvey(Class<? extends DiabetesSurvey> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new org.koreait.member.entities.QMember(forProperty("member")) : null;
    }

}

