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
@Table(name = "task_model")
public class TaskModel {
    //Attributes
    @Id
    @Column(name = "id_task", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTask;

    @Column(name = "task", nullable = false, length = 150)
    private String task;

    //manyToOne : relation entre la entre entité taskModel et UserModel
    @ManyToOne
    @JoinTable(name = "user_task",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private UserModel userModel;

    //manyToOne : relation entre la entre entité missionModel et taskModel
    @ManyToOne
    @JoinTable(name = "mission_task",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id"))
    private MissionModel missionModel;

}
