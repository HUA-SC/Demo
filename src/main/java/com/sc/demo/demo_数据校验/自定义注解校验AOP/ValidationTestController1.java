package com.sc.demo.demo_数据校验.自定义注解校验AOP;


import com.sc.demo.demo_数据校验.使用验证框架验证.PersonDTO;
import com.sc.demo.demo_数据校验.自定义注解校验AOP.annotation.CheckValid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author sc
 * @create 2018-04-11-9:19
 **/
@RestController
public class ValidationTestController1 {
    @PostMapping("/@CheckValid")
    public String validationTest(@CheckValid PersonDTO person){
        
        return "ook";
    }

    @PostMapping("/@CheckValid/group1")
    public String validationTest1(@CheckValid({PersonDTO.group1.class}) PersonDTO person){
        
        return "ook";
    }

    @PostMapping("/@CheckValid/group2")
    public String validationTest2(@CheckValid({PersonDTO.group2.class}) PersonDTO person){
        
        return "ook";
    }
    @PostMapping("/@CheckValid/both")
    public String validationTest12(@CheckValid({PersonDTO.group1.class,PersonDTO.group2.class}) PersonDTO person){
        return "ook";
    }
}

