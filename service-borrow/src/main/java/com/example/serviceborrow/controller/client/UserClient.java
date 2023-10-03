package com.example.serviceborrow.controller.client;

import com.example.commons.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("userservice")
public interface UserClient {
    @RequestMapping("/user/{uid}") //路径保证和其他微服务提供的一致即可
    User getUserById(@PathVariable("uid") int uid); //参数和返回值也保持一致
}
