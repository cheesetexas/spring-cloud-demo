package com.example.serviceborrow.entity;

import com.example.commons.entity.Book;
import com.example.commons.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
