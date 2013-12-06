package com.mycompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

public final class StandardApplicationContextInspector implements ApplicationContextInspector {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ApplicationContext applicationContext;

    public StandardApplicationContextInspector(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Map<String, String> beans() {
        this.logger.info(">>>>> Application Context {}", this.applicationContext.hashCode());

        Map<String, String> beans = new HashMap<>();
        for (Map.Entry<String, ?> entry : this.applicationContext.getBeansOfType(Object.class).entrySet()) {
            beans.put(entry.getKey(), entry.getValue().getClass().getCanonicalName());
        }

        return beans;
    }
}
