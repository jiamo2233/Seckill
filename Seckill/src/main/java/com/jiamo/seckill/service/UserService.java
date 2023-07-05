package com.jiamo.seckill.service;

import com.jiamo.seckill.entity.User;
import com.jiamo.seckill.param.LoginParam;
import com.jiamo.seckill.result.Result;


public interface UserService {
    Result<User> login(LoginParam loginParam);
}
