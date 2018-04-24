package com.sc.demo.demo_Spring_data_jpa的使用;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QGsMemberEntity is a Querydsl query type for GsMemberEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGsMemberEntity extends EntityPathBase<GsMemberEntity> {

    private static final long serialVersionUID = 94779744L;

    public static final QGsMemberEntity gsMemberEntity = new QGsMemberEntity("gsMemberEntity");

    public final StringPath createTime = createString("createTime");

    public final StringPath hh = createString("hh");

    public final NumberPath<Integer> memberId = createNumber("memberId", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public QGsMemberEntity(String variable) {
        super(GsMemberEntity.class, forVariable(variable));
    }

    public QGsMemberEntity(Path<? extends GsMemberEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGsMemberEntity(PathMetadata<?> metadata) {
        super(GsMemberEntity.class, metadata);
    }

}

