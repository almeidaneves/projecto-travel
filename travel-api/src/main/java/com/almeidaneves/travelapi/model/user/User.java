package com.almeidaneves.travelapi.model.user;

import com.almeidaneves.travelapi.enumeration.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public User(Long id) {
        this.id = id;
    }
    /**
    * Metodo que verifica se o user é admin
     *
     * @author Teste
     * @since 02/02/2021
     *
     * @return boolean
     */
    public boolean isAmin(){
        return RoleEnum.ROLE_ADMIN.toString().equals(this.role.toString());
    }
}
