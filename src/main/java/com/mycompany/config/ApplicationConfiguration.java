package com.mycompany.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages="com.mycompany.controller")
@EnableWebMvc
class ApplicationConfiguration {
}
