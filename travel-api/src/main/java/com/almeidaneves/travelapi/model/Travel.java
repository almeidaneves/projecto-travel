package com.almeidaneves.travelapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
    @Column(name="orderNumber")
    @Size(max = 60)
    private String orderNumber;

    @NotBlank
    @Column(name="startDate")
    @Size(max = 60)
    private LocalDateTime startDate;
    
    @NotBlank
    @Column(name="startDate")
    @Size(max = 60)
    private LocalDateTime endDate;

}
