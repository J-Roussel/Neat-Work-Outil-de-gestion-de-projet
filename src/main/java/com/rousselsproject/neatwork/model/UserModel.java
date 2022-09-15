package com.rousselsproject.neatwork.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user_model")
public class UserModel implements Serializable {
    //Attributes
    @Id
    @Column(name = "id_user", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;

    @Column(name = "last_name_user", nullable = false, length = 150)
    private String lastNameUser;

    @Column(name = "first_name_user", nullable = true, length = 30)
    private String firstNameUser;

    @Column(name = "sexe_user", nullable = false)
    private char sexeUser;

    @Column(name = "cin_user", nullable = false, unique = true, length = 14)
    private String cinUser;

    @Column(name = "mail_user", nullable = false, unique = true, length = 75)
    public String mailUser;

    @Column(name = "contact_user", nullable = false, length = 14, unique = true)
    private String contactUser;

    @Column(name = "address_user", nullable = false, length = 100)
    private String addressUser;

    @Column(name = "post_user", nullable = false, length = 80)
    private String postUser;

    //manyToOne : relation entre la entre entité UserModel et TypeUserModel
    @ManyToOne
    @JoinTable(name = "typeUser_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "type_user_id"))
    private TypeUserModel typeUserModel;

}
