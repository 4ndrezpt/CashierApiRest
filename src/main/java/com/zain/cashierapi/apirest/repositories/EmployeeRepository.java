package com.zain.cashierapi.apirest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zain.cashierapi.apirest.models.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer >{

}
