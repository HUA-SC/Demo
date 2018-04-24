package com.sc.demo;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.jpa.impl.JPAQueryFactory;
import com.mysema.query.jpa.impl.JPAUpdateClause;
import com.mysema.query.sql.HSQLDBTemplates;
import com.mysema.query.sql.SQLQuery;
import com.mysema.query.sql.SQLTemplates;
import com.mysema.query.support.Expressions;
import com.mysema.query.types.Expression;
import com.mysema.query.types.expr.CaseBuilder;
import com.sc.demo.demo_QueryDsl_JPA.QCompany;
import com.sc.demo.demo_QueryDsl_JPA.QCustomer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemopWrapperApplicationTests {

	@Resource
	private EntityManager em;




	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void test() throws Exception {

		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

	}


	@Test
	@Transactional
	public void QueryDslTest() {
		QCustomer qCustomer = QCustomer.customer;
		QCompany qCompany = QCompany.company;


		JPAQuery query = new JPAQuery(em);

		double c =  query
				.from(qCompany)
				.uniqueResult(qCompany.id.max());



		System.out.println(c);
	}

}
