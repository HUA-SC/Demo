package com.sc.demo.demo_标准定义的数据校验注解使用;

import lombok.Data;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;
import java.lang.reflect.Field;

/**
 * @author sc
 * @create 2018-04-17-11:38
 **/
@Data
public class AnnotationTest {

    @URL
    private String money;
}
