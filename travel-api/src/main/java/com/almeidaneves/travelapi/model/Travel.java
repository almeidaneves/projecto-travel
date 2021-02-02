package com.almeidaneves.travelapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TRAVEL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Travel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String orderNumber;

    @NotBlank
    private LocalDateTime startDate;
    
    @NotBlank
    private LocalDateTime endDate;

}
