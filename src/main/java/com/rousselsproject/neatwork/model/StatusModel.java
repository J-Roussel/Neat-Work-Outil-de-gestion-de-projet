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
@Table(name = "status_model")
public class StatusModel {

    //Attributes
    @Id
    @Column(name = "id_status", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStatus;
    @Column(name = "status", nullable = false, length = 100)
    private String status;
}
