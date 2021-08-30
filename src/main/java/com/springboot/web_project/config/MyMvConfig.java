package com.springboot.web_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by WXHang on HANG at 2021/8/30 12:27
 * Desc：
 */
@Configuration
public class MyMvConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLoclaResolver();
    }
}
