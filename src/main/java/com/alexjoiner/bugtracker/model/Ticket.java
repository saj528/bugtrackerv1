package com.alexjoiner.bugtracker.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String ticketTitle;
    private String ticketDescription;
    private String assignedDeveloper;
    private String submitter;
    private String project;
    private String priority;
    private String ticketStatus;
    private String ticketType;
    @Column(nullable = false,updatable = false)
    private Date created;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    public void setAssignedDeveloper(String assignedDeveloper) {
        this.assignedDeveloper = assignedDeveloper;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketTitle='" + ticketTitle + '\'' +
                ", ticketDescription='" + ticketDescription + '\'' +
                ", assignedDeveloper='" + assignedDeveloper + '\'' +
                ", submitter='" + submitter + '\'' +
                ", project='" + project + '\'' +
                ", priority='" + priority + '\'' +
                ", ticketStatus='" + ticketStatus + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", created=" + created +
                '}';
    }
}
