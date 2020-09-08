package com.project.but.but.service.Login;

import com.project.but.but.entity.User;
import com.project.but.but.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository UserRepository;

    public List<User> selectAll(){
        return (List<User>) UserRepository.findAll();
    }
}
