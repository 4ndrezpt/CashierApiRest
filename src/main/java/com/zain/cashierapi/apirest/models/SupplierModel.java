package com.zain.cashierapi.apirest.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Temporal;
import jakarta.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;


/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instanciation of products, and mapping
*/
@Entity
@Table(name="proveedores")
public class SupplierModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long Id;        
    @Column(nullable = false)
    private String name;
    @Column(name="lastName", nullable=false)
    private String lastName;
    
    @Column(unique=true,nullable=false)
    private String nit;
    @Column(nullable=false)
    private String enterprise;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false,length=20)
    private String phone;  
    @Column(nullable=false)  
    private String address;
    @Column(nullable=false)
    private String state;    

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private java.sql.Date began;      
    
    
    public java.sql.Date getBegan() {
        return began;
    }
    public void setBegan(java.sql.Date began) {
        this.began = began;
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
    
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

}
