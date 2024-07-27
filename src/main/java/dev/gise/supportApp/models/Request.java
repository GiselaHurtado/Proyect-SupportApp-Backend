package dev.gise.supportApp.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_request")
    private Long id;

    @Column(name = "date_request")
    private LocalDate dateRequest;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title_request")
    private String titleRequest;

    @Column(name = "request_content")
    private String requestContent;

    public Request() {
    
    }

    public Request(Long id, LocalDate dateRequest, String firstName, String lastName, String titleRequest, String requestContent) {
        this.id = id;
        this.dateRequest = dateRequest;
        this.firstName = firstName;
        this.lastName = lastName;
        this.titleRequest = titleRequest;
        this.requestContent = requestContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(LocalDate dateRequest) {
        this.dateRequest = dateRequest;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitleRequest() {
        return titleRequest;
    }

    public void setTitleRequest(String titleRequest) {
        this.titleRequest = titleRequest;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;

        
    }
}
