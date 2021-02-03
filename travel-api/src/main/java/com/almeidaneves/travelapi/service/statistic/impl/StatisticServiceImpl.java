package com.almeidaneves.travelapi.service.statistic.impl;

import com.almeidaneves.travelapi.model.statistic.Statistic;
import com.almeidaneves.travelapi.repository.statistic.StatisticRepository;
import com.almeidaneves.travelapi.service.statistic.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class StatisticServiceImpl implements StatisticService {


    private StatisticRepository statisticRepository;

    @Autowired
    public StatisticServiceImpl(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    @Override
    public Statistic save(Statistic statistic) {
        return statisticRepository.save(statistic);
    }

    @Override
    public Statistic verifyIfStatisticsIsSame(BigDecimal sum, BigDecimal avg, BigDecimal max, BigDecimal min, Long count) {
        return statisticRepository.verifyIfStatisticIsSame(sum,
                avg, max, min, count).orElseThrow(
                ()->new IllegalArgumentException("Already exists a " +
                        "statistic in the database whit the same parameters")
        );
    }
}
