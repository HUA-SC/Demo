package com.sc.demo.demo_标准定义的数据校验注解使用;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author sc
 * @create 2018-04-17-11:38
 **/
@RestController
public class AnnotationTestController {
    @PostMapping("/test")
    public String test(@Valid  AnnotationTest test, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "success!";
    }

}
