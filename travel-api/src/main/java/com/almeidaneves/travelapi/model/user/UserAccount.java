package com.almeidaneves.travelapi.model.user;

import com.almeidaneves.travelapi.exception.TravelGeneral;
import com.almeidaneves.travelapi.exception.TravelResponse;
import com.almeidaneves.travelapi.model.accout.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_accounts")
public class UserAccount extends TravelGeneral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;
}
