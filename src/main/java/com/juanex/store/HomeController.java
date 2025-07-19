package com.juanex.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        String viewName = getViewName();
        System.out.println("AppName:" + appName);
        return viewName;
    }

    @Value("${spring.application.name}")
    private String appName;

    private String getViewName(){
        return  "index.html";
    }
}
