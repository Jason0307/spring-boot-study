package org.zhubao.boot;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.zhubao.boot.filter.LoginFilter;

@SpringBootApplication
public class Application {

    @Bean
    public FilterRegistrationBean someFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(loginFilter());
        registration.addUrlPatterns("/message/*");
        registration.setName("loginFilter");
        return registration;
    }

    @Bean(name = "loginFilter")
    public Filter loginFilter() {
        return new LoginFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
