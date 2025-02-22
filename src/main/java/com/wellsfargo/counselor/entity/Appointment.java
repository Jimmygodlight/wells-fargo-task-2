package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@SuppressWarnings("unused")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long appointmentId;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @ManyToOne
    private Advisor advisor;

    @ManyToOne
    private Client client;

    @Column
    private String notes;

    // Default constructor required by JPA
    protected Appointment() {
    }

    // Constructor initializing all instance variables (except auto-generated id)
    public Appointment(LocalDateTime appointmentTime, Advisor advisor, Client client, String notes) {
        this.appointmentTime = appointmentTime;
        this.advisor = advisor;
        this.client = client;
        this.notes = notes;
    }

    // Getters and setters (no setter for the id field)
    public long getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
