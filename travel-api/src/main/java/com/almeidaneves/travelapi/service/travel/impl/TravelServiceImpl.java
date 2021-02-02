package com.almeidaneves.travelapi.service.travel.impl;

import com.almeidaneves.travelapi.model.travel.Travel;
import com.almeidaneves.travelapi.repository.travel.TravelRepository;
import com.almeidaneves.travelapi.service.travel.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelRepository travelRepository;


    @Override
    public Travel save(Travel travel) {
        return null;
    }

    @Override
    public void deleteId(Long travelId) {

    }

    @Override
    public Travel findById(Long Id) {
        return null;
    }

    @Override
    public Optional<Travel> findByOrderNumber(String orderNumber) {
        return Optional.empty();
    }

    @Override
    public List<Travel> findAll() {
        return null;
    }

    @Override
    public Page<Travel> findBetweenDates(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable) {
        return null;
    }
}
