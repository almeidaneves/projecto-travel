package com.almeidaneves.travelapi.repository.travel;

import com.almeidaneves.travelapi.model.travel.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Interface que implementa a Travel Repository com metodo CRUD do JPA
 *
 * @author TestesAlmeidaneves
 * @since 02/02/2021
 * */
@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {

}
