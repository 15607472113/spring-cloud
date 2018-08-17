package testcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-hello")//对应到的server端的spring.application.name
public interface HelloRemote {	
	
    @RequestMapping(value = "/home")
    public Integer findran();  
}
