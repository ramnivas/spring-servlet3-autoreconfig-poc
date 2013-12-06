package org.cloudfoundry.autoreconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

public final class AutoReconfigurationServletContainerInitializer implements ServletContainerInitializer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        this.logger.info(">>>>> Servlet Context Initialization");

        ctx.setInitParameter(ContextLoader.CONTEXT_INITIALIZER_CLASSES_PARAM,
                AutoReconfigurationApplicationContextInitializer.class.getCanonicalName());
    }

}
