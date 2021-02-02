package com.almeidaneves.travelapi.model.statistic;

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
public class Statistic implements Serializable {

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
