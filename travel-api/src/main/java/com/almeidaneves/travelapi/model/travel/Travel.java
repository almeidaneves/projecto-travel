package com.almeidaneves.travelapi.model.travel;

import com.almeidaneves.travelapi.enumeration.TravelTypeEnum;
import com.almeidaneves.travelapi.exception.TravelGeneral;
import com.almeidaneves.travelapi.exception.TravelResponse;
import com.almeidaneves.travelapi.model.accout.Account;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
/**
 * Método para converter uma entity travel para uma DTO Travel.
 *
 * @author Treino
 * @since 01/02/2021
 *
 * @return a <code>TravelDTO</code> Objetc
 *
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "travel")
public class Travel extends TravelGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name="orderNumber")
    @Size(max = 60)
    private String orderNumber;

    @NotBlank
    @Column(name="startDate" )
    @Size(max = 60)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;
    
    @NotBlank
    @Column(name="endDate")
    @Size(max = 60)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDate;

    @NotBlank
    @Column(name = "typeEnum")
    @Enumerated(EnumType.STRING)
    private TravelTypeEnum type;

    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne
    private Account account;

    public Travel(TravelTypeEnum type){
        this.type = type;
    }



}
