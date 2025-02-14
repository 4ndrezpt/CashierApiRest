package com.zain.cashierapi.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zain.cashierapi.apirest.models.SupplierModel;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierModel, Long>{

}
