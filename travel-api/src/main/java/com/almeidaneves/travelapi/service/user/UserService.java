package com.almeidaneves.travelapi.service.user;

import com.almeidaneves.travelapi.model.user.User;

import java.util.Optional;

public interface UserService {
    /**
     * Method that saves an user in the database.
     *
     * @author TesteAlmeidaNeves
     * @since 02/02/2021
     *
     * @param user
     * @return User Object
     */
    public User save(User user);

    /**
     * Method that find an user by email in the database.
     *
     * @author TestesAlmeidaNeves
     * @since 02/02/2021
     *
     * @param email
     * @return Optional<User> object
     */
    public Optional<User> findByEmail(String email);

}
