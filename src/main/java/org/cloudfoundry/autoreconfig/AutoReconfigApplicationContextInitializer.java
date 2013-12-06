package org.cloudfoundry.autoreconfig;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@Configuration
public class AutoReconfigApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableWebApplicationContext> {

    @Override
    public void initialize(ConfigurableWebApplicationContext appContext) {
        // We will do something like the following line
        //((DefaultListableBeanFactory)appContext).registerSingleton("__auto_reconfig_bfpp", new AutoReconfigBFPP());
        
        System.out.println("AutoReconfigApplicationContextInitializer: " + appContext.getClass());
    }
}
