package com.almeidaneves.travelapi.model.accout;

import com.almeidaneves.travelapi.enumeration.AccountTypeEnum;
import com.almeidaneves.travelapi.exception.TravelGeneral;
import com.almeidaneves.travelapi.exception.TravelResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Account extends TravelGeneral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "account_number")
    private String accountNumber;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountTypeEnum accountType;

    private Account(Long id){
        this.id = id;
    }

}
