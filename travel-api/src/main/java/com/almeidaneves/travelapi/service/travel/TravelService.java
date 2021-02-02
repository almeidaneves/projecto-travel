package com.almeidaneves.travelapi.service.travel;

import com.almeidaneves.travelapi.model.travel.Travel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TravelService {

    /**
     * Method that save an object Travel
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @param travel
     * @return <code>Travel</code> object
     */
    public Travel save(Travel travel);

    /**
     * Method that remove an object Travel
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @param travelId
     */
    public void deleteId(Long travelId);

    /**
     * Method that find an Travel object by an id
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @param Id
     * @return <code>Travel</code> object
     */
    public Travel findById(Long Id);

    /**
     * Method that find one or more trips by orderNumber
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @param orderNumber
     * @return <code>Optional<Travel></Travel></code> object.
     */
    public Optional<Travel> findByOrderNumber(String orderNumber);

    /**
     * Method that finf all travels.
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @return <code>List<Travel></code> object
     */
    public List<Travel> findAll();

    /**
     * Method tha find all travels in a period of time.
     *
     * @author TestAlmeidaNeves
     * @since 02/02/2021
     *
     * @param startDate - the start of the search
     * @param endDate
     * @param pageable
     * @return <code>Page<Travel></code> object
     */
    public Page<Travel> findBetweenDates(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable);

}
