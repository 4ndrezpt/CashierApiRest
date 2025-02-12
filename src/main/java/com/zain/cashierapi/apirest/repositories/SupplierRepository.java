package com.zain.cashierapi.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zain.cashierapi.apirest.models.SupplierModel;

public interface SupplierRepository extends JpaRepository<SupplierModel, Integer>{

}
