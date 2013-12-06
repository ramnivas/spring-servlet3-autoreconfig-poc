package org.cloudfoundry.autoreconfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class AutoReconfigInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println(servletContext.getInitParameter("contextInitializerClasses"));
        servletContext.setInitParameter("contextInitializerClasses", "org.cloudfoundry.autoreconfig.AutoReconfigApplicationContextInitializer");
    }

}
