package com.inspiry.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.inspiry.demo.IUserService;

/**
 * Created by nicole on 17-3-28.
 */
@Service
public class UserServiceImpl implements IUserService {
    public int show(int age) {
        System.out.println("call remote server success!");
        return age;
    }
}
