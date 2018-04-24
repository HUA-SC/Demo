package com.sc.demo.demo_数据校验.使用验证框架验证.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * isAge注解的检验规则约束
 *
 * @author sc
 * @create 2018-04-11-8:59
 **/
public class LimitValuesClass implements ConstraintValidator<LimitValues,Object>{

    private String[] values;


    @Override
    public void initialize(LimitValues constraintAnnotation) {
        this.values = constraintAnnotation.values().split(",");
    }
    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(o)){
                return true;
            }
        }
        return false;
    }
}
