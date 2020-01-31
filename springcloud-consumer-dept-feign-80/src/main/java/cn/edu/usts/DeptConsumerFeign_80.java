package cn.edu.usts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "cn.edu.usts")
@ComponentScan(basePackages = "cn.edu.usts")
public class DeptConsumerFeign_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_80.class, args);
    }
}
