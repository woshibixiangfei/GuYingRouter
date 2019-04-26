package cn.teacherbe.GuYingRouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class GuYingRouterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuYingRouterApplication.class, args);
	}

}
