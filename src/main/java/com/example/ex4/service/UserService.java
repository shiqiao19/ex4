package com.example.ex4.service;

import com.example.ex4.aspect.MyInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@MyInterceptor
public class UserService {
    public void buyCar() {
        log.debug("buyCar()");
    }

    @MyInterceptor(MyInterceptor.AuthorityType.ADMIN)
    public void addUser() {
        log.debug("addUser()");
    }
}
