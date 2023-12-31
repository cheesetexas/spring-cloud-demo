package com.example.serviceborrow.service;

import com.example.commons.entity.*;
import com.example.serviceborrow.controller.client.BookClient;
import com.example.serviceborrow.controller.client.UserClient;
import com.example.serviceborrow.dao.BorrowMapper;
import com.example.serviceborrow.entity.UserBorrowDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    BorrowMapper borrowMapper;

    @Autowired
    UserClient userClient;

    @Autowired
    BookClient bookClient;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrows = borrowMapper.getBorrowsByUid(uid);
        /*
        RestTemplate写法：
        //这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取User信息
        //注册eureka后，这里不用再写IP，直接写服务名称userservice
        RestTemplate template = new RestTemplate();
        User user = template.getForObject("http://userservice/user/" + uid, User.class);
        //获取每一本书的详细信息
        //注册eureka后，这里不用再写IP，直接写服务名称bookservice
        List<Book> bookList = borrows
                .stream()
                .map(b -> template.getForObject("http://bookservice/book/"+b.getBid(), Book.class))
                .collect(Collectors.toList());
         */

        User user = userClient.getUserById(uid);
        //这里不用再写IP，直接写服务名称bookservice'
        List<Book> bookList = borrows
                .stream()
                .map(b -> bookClient.getBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
