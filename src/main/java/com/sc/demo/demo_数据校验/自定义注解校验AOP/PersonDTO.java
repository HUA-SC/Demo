package com.sc.demo.demo_数据校验.自定义注解校验AOP;



import com.sc.demo.demo_数据校验.使用验证框架验证.annotation.LimitValues;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 传入数据的接收DTO
 * 进行校验、分组校验、自定义注解校验
 * @author sc
 * @create 2018-04-11-8:29
 **/
@Data
public class PersonDTO {
    //将变量分为两组数据进行分组校验： （name、age、sex）和（name、money）
    //@NotBlank、@Min、@Max、@NotNull是定义好的数据校验注解
    //@IsSex是自定义的校验注解
    @NotBlank(groups = {group1.class,group2.class})
    private String name;
    @Min(0)
    @Max(120)
    @NotNull(message = "{person.age.null}",groups = {group1.class})
    private Integer age;
    @LimitValues(values = "male,female",groups = {group1.class})
    private String sex;
    @NotNull(message = "{person.money.null}",groups = {group2.class})
    private Float money;

    public interface group1{}           //（name、age、sex）所属校验组
    public interface group2{}           //（name、money）所属校验组
}
