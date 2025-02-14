package com.zain.cashierapi.apirest.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


//TODO: verificar inserción de sqlDate con envio de datos string  yyyy-MM-dd
@Entity
@Table(name="clientes")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long Id;    
    @Column(length = 60)
    
    private String name;
    @Column(name="lastName",length=60)
    private String lastName;
    @Column(name="typeDocument", nullable=false, length=10)
    private String typeDocument;
    @Column (nullable = false, length=30,unique=true)    
    private String document;
    @Column(length = 20)
    private String phone;
        
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.sql.Date birthdate;      
    
    public java.sql.Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(java.sql.Date birthdate) {
        this.birthdate = birthdate;
    }
    @Column(nullable= false,unique=true)        
    private String email;        
    private String address;
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
   
   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
