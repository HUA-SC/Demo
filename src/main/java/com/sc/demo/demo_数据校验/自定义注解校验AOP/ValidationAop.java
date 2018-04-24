package com.sc.demo.demo_数据校验.自定义注解校验AOP;

import com.sc.demo.demo_数据校验.自定义注解校验AOP.annotation.CheckValid;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import static com.sc.demo.demo_数据校验.自定义注解校验AOP.AnnotationUtils.getParam;
import static com.sc.demo.demo_数据校验.自定义注解校验AOP.AnnotationUtils.hasAnnotations;

/**
 * 自定义aop监控@validated注解，并对数据进行校验
 * ps：若需要使用框架自带的验证，需要将该类屏蔽掉
 * @author sc
 * @create 2018-04-11-10:26
 **/
@Aspect
@Component
@Order(1)
public class ValidationAop {



    @Pointcut("execution( * com.sc.demo.demo_数据校验.自定义注解校验AOP.ValidationTestController1.*(..))")
    public void pointcut(){}



    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        Object result = null;

        Object target = joinPoint.getTarget();
        Method method = getInvoke(joinPoint.getSignature());
        Annotation[][] annotations = method.getParameterAnnotations();
        Object[] args = joinPoint.getArgs();
        Boolean flag = hasAnnotations(annotations,CheckValid.class);
        if (flag){
            List<Param> params = getParam(annotations,method,args,CheckValid.class);
            for (Param param : params) {

            }
        }else{
            try {
                result = joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();        //TODO
            }
        }


        return result;

    }

    protected Method getInvoke(Signature signature){
        if(!(signature instanceof MethodSignature)){
            return null;
        }
        return ((MethodSignature) signature).getMethod();
    }



}
