package com.sc.demo.demo_QueryDsl_JPA;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author sc
 * @create 2018-04-19-9:19
 **/
@Entity
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String fn){
        firstName = fn;
    }

    public void setLastName(String ln){
    lastName = ln;
    }
}
