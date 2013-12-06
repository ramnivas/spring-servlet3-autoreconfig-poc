package com.mycompany.services;

import com.mycompany.ApplicationContextInspector;
import com.mycompany.StandardApplicationContextInspector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    @Bean
    ApplicationContextInspector servicesApplicationContextInspector(ApplicationContext applicationContext) {
        return new StandardApplicationContextInspector(applicationContext);
    }

}
