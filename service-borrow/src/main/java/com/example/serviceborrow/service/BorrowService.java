package com.example.serviceborrow.service;

import com.example.serviceborrow.entity.UserBorrowDetail;

public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
