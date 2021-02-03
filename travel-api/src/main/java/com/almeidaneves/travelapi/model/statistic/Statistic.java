package com.almeidaneves.travelapi.model.statistic;

import com.almeidaneves.travelapi.exception.GeneralResponse;
import com.almeidaneves.travelapi.exception.TravelGeneral;
import com.almeidaneves.travelapi.exception.TravelResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Statistics")
public class Statistic extends TravelGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "travel_sum")
    private BigDecimal sum;

    @NotBlank
    @Column(name = "travel_avg")
    private BigDecimal avg;

    @NotBlank
    @Column(name = "travel_max")
    private BigDecimal max;

    @NotBlank
    @Column(name = "travel_min")
    private BigDecimal min;

    @NotBlank
    @Column(name = "travel_count")
    private Long count;


}
