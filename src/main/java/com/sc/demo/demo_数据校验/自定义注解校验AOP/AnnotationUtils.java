package com.sc.demo.demo_数据校验.自定义注解校验AOP;

import com.sc.demo.demo_数据校验.自定义注解校验AOP.annotation.CheckValid;
import org.aspectj.lang.JoinPoint;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


/**
 * @author sc
 * @create 2018-04-11-15:26
 **/
public class AnnotationUtils {
    public static <T> boolean hasAnnotations(Annotation[][] anno, T t) {
        for (int i = 0; i < anno.length; i++) {
            Annotation[] annotations = anno[i];
            for (int j = 0; j < annotations.length; j++) {
                Annotation annotation = annotations[j];
                if (annotation.annotationType() == t) {
                    return true;
                }
            }

        }
        return false;
    }

    public static <T> List<Param> getParam(Annotation[][] annos, Method method, Object[] args, T t) {
        Class<?>[] paramTypes = method.getParameterTypes();

        List<Param> params = new ArrayList<Param>();
        for (int i = 0; i < annos.length; i++) {
            Annotation[] annotations = annos[i];
            for (int j = 0; j < annotations.length; j++) {
                Annotation annotation = annotations[j];
                if (annotation.annotationType() == t) {
                    Param param = new Param(paramTypes[i].getSimpleName(),
                            paramTypes[i].getName(),//名称
                            paramTypes[i],//参数类型
                            args[i],//参数值
                            annos[i][j]);//筛选出的注解
                    params.add(param);
                }
            }

        }
        return params;
    }

}
