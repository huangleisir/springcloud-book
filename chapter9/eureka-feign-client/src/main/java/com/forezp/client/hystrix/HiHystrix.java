package com.forezp.client.hystrix;

import com.forezp.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/6/21.
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
           return "hi,"+name+",sorry,error!";
    }

	@Override
	public String getUrl(String name) {
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
