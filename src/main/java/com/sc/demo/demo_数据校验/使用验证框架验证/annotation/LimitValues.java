package com.sc.demo.demo_数据校验.使用验证框架验证.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LimitValuesClass.class)
public @interface LimitValues {
    String values();
    String message() default "{person.sex.data.error}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
