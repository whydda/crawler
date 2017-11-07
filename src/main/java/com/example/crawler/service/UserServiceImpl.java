package com.example.crawler.service;

import com.example.crawler.repositories.UserRepository;
import com.example.crawler.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by whydda on 2017-11-07.
 * File Ko Name :
 */
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(UserVo userVo) {
        userRepository.save(userVo);
    }
}
