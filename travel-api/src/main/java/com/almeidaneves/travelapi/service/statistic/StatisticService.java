package com.almeidaneves.travelapi.service.statistic;

import com.almeidaneves.travelapi.model.statistic.Statistic;

import java.math.BigDecimal;

public interface StatisticService {

    /**
     * Method that save a statistic
     * @author TestAlmeidaNeves
     * @since 03/02/2021
     * @param statistic
     * @return <code>Statistic</code> object
     */
    public Statistic save(Statistic statistic);

    /**
     * Method that verifies if the statistics already exists in the database
     *
     * @author TestAlmeidaNeves
     * @param sum
     * @param avg
     * @param max
     * @param min
     * @param count
     * @return <code>Statistic</code> object
     */
    public Statistic verifyIfStatisticsIsSame(BigDecimal sum, BigDecimal avg, BigDecimal max, BigDecimal min, Long count);
}
