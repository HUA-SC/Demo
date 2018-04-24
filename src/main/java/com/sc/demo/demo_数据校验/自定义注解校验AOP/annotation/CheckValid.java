package com.sc.demo.demo_数据校验.自定义注解校验AOP.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckValid {
    Class<?>[] value() default {};
}
