package com.sc.demo.demo_JDBC在spring中;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sc
 * @create 2018-04-17-16:02
 **/
@RestController
public class JdbcController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/jdbc")
    public String jdbc(){
        return jdbcTemplate.queryForObject("SELECT name FROM gs_api WHERE api_id = 985",String.class);

    }

}
