package testcloud;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class HelloSystemApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(HelloSystemApplication.class, args);
    }  
    
	//提供一个随机数
	@RequestMapping(value = "/home")
	public Integer random() {
		Random r=new Random();
    	Integer ran=r.nextInt();
		return ran;
	}
	
	//输出一个hello
	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello";
	}
}