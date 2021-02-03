package com.almeidaneves.travelapi.service.statistic.impl;

import com.almeidaneves.travelapi.model.statistic.Statistic;
import com.almeidaneves.travelapi.repository.statistic.StatisticRepository;
import com.almeidaneves.travelapi.service.statistic.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class StatisticServiceImpl implements StatisticService {


    @Autowired
    private StatisticRepository statisticRepository;


   /* public StatisticServiceImpl(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }*/

    @Override
    public Statistic save(Statistic statistic) {
        return statisticRepository.save(statistic);
    }

    @Override
    public Statistic verifyIfStatisticsIsSame(Statistic statistic) {
        return statisticRepository.findBySum(statistic.getSum()).orElseThrow(
                ()->new IllegalArgumentException("Already exists a " +
                        "statistic in the database whit the same parameters")
        );
    }
}
