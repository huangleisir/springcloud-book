package com.forezp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by forezp on 2017/6/9.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    
    
    @GetMapping("/")
    public String index(@RequestParam String name) {
        return "welcome to ek-client  "+port;
    }
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
    
    @GetMapping("/getUrl")
    public String getUrl(@RequestParam(required=false) String name) {
        if("baidu".equals(name)) {
        	return "https://www.baidu.com";
        }else if("qq".equals(name)) {
        	return "https://www.qq.com";
        }else if("163".equals(name)) {
        	return "https://www.163.com";
        }
        
        
        return "https://www.baidu.com";
    }

}
