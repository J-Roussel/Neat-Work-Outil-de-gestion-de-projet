package com.rousselsproject.neatwork.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "type_user_model")
public class TypeUserModel {

    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTypeUser;
    @Column(name = "type_user", nullable = false)
    private String typeUser;


}
