package org.cloudfoundry.autoreconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
final class AutoReconfigurationApplicationContextInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        this.logger.info(">>>>> Initializing Application Context {}", applicationContext.hashCode());

        applicationContext.addBeanFactoryPostProcessor(new AutoReconfigurationBeanFactoryPostProcessor());
    }

}
