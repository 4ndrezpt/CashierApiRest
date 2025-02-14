package com.zain.cashierapi.apirest.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instanciation of products, and mapping
*/
@Entity
@Table(name="empleados")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable=false, length=60)    
    private String name;
    @Column(name="lastName",nullable=false)
    private String lastName;
    @Column(name="typeDocument",nullable=false)
    private String typeDocument;
    @Column(unique=true, nullable=false)    
    private String document;    
    @Column(length=20)
    private String phone;
    @Column(nullable=false) 
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")    
    private java.sql.Date birthdate;

    @Column(unique=true, nullable=false)    
    private String email;

    @Temporal(TemporalType.DATE)    
    @DateTimeFormat(pattern="yyyy-MM-dd")    
    private java.sql.Date began;
    
    public java.sql.Date getBegan() {
        return began;
    }
    public void setBegan(java.sql.Date began) {
        this.began = began;
    }
    @Column(nullable=false, length=30)    
    private String role;

  
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTypeDocument() {
        return typeDocument;
    }
    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public java.sql.Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(java.sql.Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }    

}
