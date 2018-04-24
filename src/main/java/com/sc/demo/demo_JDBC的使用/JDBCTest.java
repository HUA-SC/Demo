package com.sc.demo.demo_JDBC的使用;



import static com.sc.demo.demo_JDBC的使用.JDBCTemplate.find;

/**
 * @author sc
 * @create 2018-04-17-14:49
 **/
public class JDBCTest {



    public static void main(String[] args) {


        try {
            find();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
