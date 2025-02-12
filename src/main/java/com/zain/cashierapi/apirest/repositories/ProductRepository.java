package com.zain.cashierapi.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zain.cashierapi.apirest.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    //Declarar los servicios de lso repositorios
    
}
