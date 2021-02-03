package com.almeidaneves.travelapi.repository.travel;

import com.almeidaneves.travelapi.model.travel.Travel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Interface que implementa a Travel Repository com metodo CRUD do JPA
 *
 * @author TestesAlmeidaneves
 * @since 02/02/2021
 * */
@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {

    Optional<Travel> findByOrderNumber(String orderNumber);

    Page<Travel> findAllByStartDateGreaterThanEqualAndStartDateLessThanEqual
            (LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);
}
