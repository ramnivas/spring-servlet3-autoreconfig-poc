package com.mycompany.web;

import com.mycompany.ApplicationContextInspector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
final class ApplicationContextInspectorController {

    private final ApplicationContextInspector servicesApplicationContextInspector;

    private final ApplicationContextInspector webApplicationContextInspector;

    @Autowired
    ApplicationContextInspectorController(ApplicationContextInspector servicesApplicationContextInspector,
                                          ApplicationContextInspector webApplicationContextInspector) {
        this.servicesApplicationContextInspector = servicesApplicationContextInspector;
        this.webApplicationContextInspector = webApplicationContextInspector;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/services")
    @ResponseBody
    Map<String, String> service() {
        return this.servicesApplicationContextInspector.beans();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/web")
    @ResponseBody
    Map<String, String> web() {
        return this.webApplicationContextInspector.beans();
    }

}
