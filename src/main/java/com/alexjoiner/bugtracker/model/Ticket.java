package com.alexjoiner.bugtracker.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Ticket implements Serializable {
    private Long id;
    private String ticketTitle;
    private String ticketDescription;
    private String assignedDeveloper;
    private String submitter;
    private String project;
    private String priority;
    private String ticketStatus;
    private String ticketType;
    private Date created;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    public Long getId() {
        return id;
    }
}
