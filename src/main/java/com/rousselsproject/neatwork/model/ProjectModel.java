package com.rousselsproject.neatwork.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "project_model")
public class ProjectModel {
    //Attributes
    @Id
    @Column(name = "id_project", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPoject;
    @Column(name = "name_project", nullable = false)
    private String nameProject;
    @Column(name = "descri_project", nullable = true)
    private String descriProject;
    @Column(name = "project_start_date", nullable = false)
    private Date projectStartDate;
    @Column(name = "project_deadline", nullable = false)
    private Date projectDeadline;

    //manyToOne : relation entre la entre entité statusModel et projectModel
    @ManyToOne
    @JoinTable(name = "status_project",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "status_id"))
    private StatusModel statusModel;

}
