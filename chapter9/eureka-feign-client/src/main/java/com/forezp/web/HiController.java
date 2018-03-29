package com.forezp.web;

import com.forezp.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/6/21.
 */
@RestController
public class HiController {
	/**
	 * http://localhost:8765/hi?name=333
	 */
    @Autowired
    HiService hiService;
    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "forezp",required = false)String name){
        return hiService.sayHi(name);
    }
    
    @GetMapping("/getUrl")
    public String getUrl(@RequestParam( defaultValue = "baidu",required = false)String name){
        return hiService.sayHi(name);
    }

    @GetMapping("/feignapi/hi")
    public String hiyou(){
        return "hi you!";
    }

}
