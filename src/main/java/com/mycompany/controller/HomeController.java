package com.mycompany.controller;

import java.util.Map;

import org.cloudfoundry.autoreconfig.AutoReconfigBFPP;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String beans() {
	    Map<String,AutoReconfigBFPP> beansMap = applicationContext.getBeansOfType(AutoReconfigBFPP.class);
	    
	    if (beansMap.isEmpty()) {
	        return "fail"; 
	    } else {
	        return "success";
	    }
	}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
