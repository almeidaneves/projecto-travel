package com.almeidaneves.travelapi.repository.statistic;

import com.almeidaneves.travelapi.model.statistic.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Interface que implementa a Statistic Repository com métodos CRUD de JPA
 */
@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long> {

    Optional<Statistic> findBySum(BigDecimal statistic);
}
