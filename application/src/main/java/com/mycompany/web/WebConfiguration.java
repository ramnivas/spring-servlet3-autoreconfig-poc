package com.mycompany.web;

import com.mycompany.ApplicationContextInspector;
import com.mycompany.StandardApplicationContextInspector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfiguration {

    @Bean
    ApplicationContextInspector webApplicationContextInspector(ApplicationContext applicationContext) {
        return new StandardApplicationContextInspector(applicationContext);
    }

}
