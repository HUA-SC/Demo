package com.sc.demo.demo_Spring_data_jpa的使用;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author sc
 * @create 2018-04-17-16:52
 **/
public interface MemberRepository extends JpaRepository<GsMemberEntity,Long> {

    GsMemberEntity findByName(String name);


    @Query("from GsMemberEntity m where m.name=:name")
    GsMemberEntity findMember(@Param("name") String name);

}