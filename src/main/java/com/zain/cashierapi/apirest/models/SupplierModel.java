package com.zain.cashierapi.apirest.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instanciation of products, and mapping
*/
@Entity
@Table(name="proveedores")
public class SupplierModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;        
    private String name;
    @Column(name="lastName")
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
    private Boolean state;
    @CreationTimestamp
    private Date began;
    
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
    public Boolean getState() {
        return state;
    }
    public void setState(Boolean state) {
        this.state = state;
    }

}
