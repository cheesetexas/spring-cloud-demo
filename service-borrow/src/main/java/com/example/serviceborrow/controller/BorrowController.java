package com.example.serviceborrow.controller;

import com.example.serviceborrow.entity.UserBorrowDetail;
import com.example.serviceborrow.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowController {

    @Autowired
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail getUserBorrows(@PathVariable("uid") int uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }
}
