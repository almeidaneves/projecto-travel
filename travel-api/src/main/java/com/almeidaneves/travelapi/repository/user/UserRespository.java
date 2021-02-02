package com.almeidaneves.travelapi.repository.user;

import com.almeidaneves.travelapi.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface que implementa a User Repository com metodo CRUD do JPA
 *
 * @author TestesAlmeidaneves
 * @since 02/02/2021
 * */
@Repository
public interface UserRespository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
}
