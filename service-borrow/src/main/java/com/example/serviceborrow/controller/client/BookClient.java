package com.example.serviceborrow.controller.client;

import com.example.commons.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("bookservice")
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid);
}
