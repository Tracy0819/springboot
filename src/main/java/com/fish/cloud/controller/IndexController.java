package com.fish.cloud.controller;

//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;
import java.util.logging.LogManager;

@Controller
public class IndexController {
  //  public static final Logger logger = Logger.getLogger(IndexController.class);
  //  public static final Logger logger =LogManager.getLogManager();
    @GetMapping("/")
    public String index(Map<String,Object> model){
     //  logger.info("访问INDEXController............");
        model.put("message","1111111");
        model.put("time",new Date());
        return "index";
    }
}
