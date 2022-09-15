package com.rousselsproject.neatwork.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Relation ManyToMany : entre l'entité mission et entité user

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name="user_mission_model")
public class Collaborate {

    //Attributes
    @Id
    @Column(name = "id_collaborate", nullable = false)
    private int idCollaborate;

    private String collaborationTitle;

    @ManyToMany
    @JoinTable(name = "MissionCollaborator",
            joinColumns = @JoinColumn(name = "mission_id"),
            inverseJoinColumns = @JoinColumn(name = "collaborator_id"))
    private List<UserModel> collaborator = new ArrayList<>();


}
