package testcloud;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;   //由spring来生成实现类...

    @Autowired
    DiscoveryClient discoverClient;
   
    @RequestMapping("/ran")
    public Integer index() {
    	System.out.println("当前eureka中注册的所有服务名:");
    	List<String> list=discoverClient.getServices();
    	for(String serviceName : list){
    		System.out.println(serviceName);
    	}
        int a= helloRemote.findran();
        System.out.println(a);
        return a;
    }
}