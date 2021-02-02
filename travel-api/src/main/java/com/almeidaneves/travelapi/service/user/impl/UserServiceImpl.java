package com.almeidaneves.travelapi.service.user.impl;

import com.almeidaneves.travelapi.model.user.User;
import com.almeidaneves.travelapi.repository.user.UserRespository;
import com.almeidaneves.travelapi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;

    /**
     *
     * @see UserService#save(User)
     */
    @Override
    public User save(User user) {
        return userRespository.save(user);
    }

    /**
     * @see UserService#findByEmail(String) 
     */
    @Override
    public Optional<User> findByEmail(String email) {
        return userRespository.findByEmail(email);
    }
}
