package com.example.serviceborrow.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    // 手动将RestTemplate声明为一个Bean，然后添加@LoadBalanced注解，这样Eureka就会对服务的调用进行自动发现，并提供负载均衡：
    @Bean
    @LoadBalanced
    RestTemplate template() {
        return new RestTemplate();
    }
}
