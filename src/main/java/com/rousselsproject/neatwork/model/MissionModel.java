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
@Table(name = "mission_model")
public class MissionModel {

    //Attributes
    @Id
    @Column(name = "id_mission", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMission;
    @Column(name = "mission_title", nullable = false)
    private String missionTitle;
    @Column(name = "descir_mission", nullable = true)
    private String descriMission;

    //manyToOne : relation entre la entre entité projectModel et missionModel
    @ManyToOne
    @JoinTable(name = "project_mission",
            joinColumns = @JoinColumn(name = "mission_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private  ProjectModel projectModel;
}
