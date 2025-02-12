package com.zain.cashierapi.apirest.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instanciation of products, and mapping
*/
@Entity
@Table(name="empleados")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;
    @Column(nullable=false, length=60)    
    private String name;
    @Column(name="lastName",nullable=false, length=60)
    private String lastName;
    @Column(name="typeDocument",nullable=false, length=10)
    private String typeDocument;
    @Column(unique=true, nullable=false, length=20)    
    private String document;    
    @Column(length=20)
    private String phone;
    @Column(nullable=false)    
    private java.sql.Date birthdate;
    @Column(unique=true, nullable=false)    
    private String email;
    @CreationTimestamp
    private Date began;
    @Column(nullable=false, length=10)    
    private String role;

    public Date getBegan() {
        return began;
    }
    public void setBegan(Date began) {
        this.began = began;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
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
