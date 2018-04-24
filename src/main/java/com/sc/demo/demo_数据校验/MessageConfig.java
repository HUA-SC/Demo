package com.sc.demo.demo_数据校验;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author sc
 * @create 2018-04-11-10:08
 **/
@Configuration
public class MessageConfig {
    @Bean
    public ResourceBundleMessageSource getSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setDefaultEncoding("utf8");
        source.setBasenames("messages");
        return source;
    }

    @Bean(value = "validator")
    public LocalValidatorFactoryBean getValidator() {
        LocalValidatorFactoryBean factoryBean = new LocalValidatorFactoryBean();
        factoryBean.setProviderClass(org.hibernate.validator.HibernateValidator.class);
        factoryBean.setValidationMessageSource(getSource());
        return factoryBean;
    }
}
