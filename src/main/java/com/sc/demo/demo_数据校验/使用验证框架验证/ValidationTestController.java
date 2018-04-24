package com.sc.demo.demo_数据校验.使用验证框架验证;


import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author sc
 * @create 2018-04-11-9:19
 **/
@RestController
public class ValidationTestController {
    @PostMapping("/@Validation")
    public String validationTest(@Validated PersonDTO person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "ook";
    }

    @PostMapping("/@Validation/group1")
    public String validationTest1(@Validated({PersonDTO.group1.class}) PersonDTO person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "ook";
    }

    @PostMapping("/@Validation/group2")
    public String validationTest2(@Validated({PersonDTO.group2.class}) PersonDTO person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "error";
        }
        return "ook";
    }
    @PostMapping("/@Validation/both")
    public String validationTest12(@Validated({PersonDTO.group1.class,PersonDTO.group2.class}) PersonDTO person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "ook";
    }
}

