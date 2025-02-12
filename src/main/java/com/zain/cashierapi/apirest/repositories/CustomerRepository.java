package com.zain.cashierapi.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zain.cashierapi.apirest.models.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long>{

}
