package com.sc.demo.demo_Spring_data_jpa的使用;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author sc
 * @create 2018-04-17-16:51
 **/
@Entity
@Table(name = "gs_member", schema = "gs_tmp_test", catalog = "")
public class GsMemberEntity {
    private Integer memberId;
    private String name;
    private String password;
    private String createTime;
    private String hh;

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GsMemberEntity that = (GsMemberEntity) o;
        return Objects.equals(memberId, that.memberId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(memberId, name, password, createTime);
    }
}
