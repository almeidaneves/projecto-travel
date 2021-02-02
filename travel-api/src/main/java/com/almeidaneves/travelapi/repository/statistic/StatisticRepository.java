package com.almeidaneves.travelapi.repository.statistic;

import com.almeidaneves.travelapi.model.statistic.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Interface que implementa a Statistic Repository com métodos CRUD de JPA
 */
@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long> {
}
