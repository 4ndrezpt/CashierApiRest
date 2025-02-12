package com.zain.cashierapi.apirest.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="productos")
public class ProductModel {
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String producer;
    @Column(nullable=false)
    private String packaging;    
    @Column(unique=true,nullable=false)
    private String code;  
    @Column(nullable=false)  
    private double price;
    private int quantity;    
    private int distributor;
    @Column(nullable=false)  
    private double pricePurchased;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getPackaging() {
        return packaging;
    }
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getDistributor() {
        return distributor;
    }
    public void setDistributor(int distributor) {
        this.distributor = distributor;
    }
    public double getPricePurchased() {
        return pricePurchased;
    }
    public void setPricePurchased(double pricePurchased) {
        this.pricePurchased = pricePurchased;
    }
    
    
}
