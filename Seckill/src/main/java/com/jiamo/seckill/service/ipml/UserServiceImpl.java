package com.jiamo.seckill.service.ipml;

import com.jiamo.seckill.entity.User;
import com.jiamo.seckill.dao.UserMapper;
import com.jiamo.seckill.param.LoginParam;
import com.jiamo.seckill.result.CodeMsg;
import com.jiamo.seckill.result.Result;
import com.jiamo.seckill.service.UserService;
import com.jiamo.seckill.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public Result<User> login(LoginParam loginParam) {

        User user = userMapper.checkPhone(loginParam.getMobile());
        if(user == null){
            return Result.error(CodeMsg.MOBILE_NOT_EXIST);
        }
        String dbPwd= user.getPassword();
        String saltDB = user.getSalt();
        String calcPass = MD5Util.formPassToDBPass(loginParam.getPassword(), saltDB);
        if(!StringUtils.equals(dbPwd , calcPass)){
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        user.setPassword(StringUtils.EMPTY);
        return Result.success(user);
    }
}
