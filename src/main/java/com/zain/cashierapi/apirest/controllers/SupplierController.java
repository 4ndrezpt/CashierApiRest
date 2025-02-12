package com.zain.cashierapi.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zain.cashierapi.apirest.repositories.SupplierRepository;
import com.zain.cashierapi.apirest.models.SupplierModel;

//import java.util.Date;
import java.util.List;



@RestController 
@RequestMapping("/suppliers")
public class SupplierController {
    @Autowired 
    private SupplierRepository SupplierRepository;

    /*
     * 
    */
    @GetMapping("/{id}")
    public SupplierModel getOntSupplierById(@PathVariable Integer id){
        SupplierModel supplier =  SupplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
        return supplier;
    }
    /*
     * 
     */
    @GetMapping
    public List<SupplierModel> findAllSuppliers(){
        List<SupplierModel> list = SupplierRepository.findAll();
        return list;
    }
    /*
     * 
     */
    @PostMapping
    public SupplierModel createSupplier(SupplierModel supplier){
        return SupplierRepository.save(supplier);
    }
    @PutMapping("/{id}")
    public SupplierModel updateSupplier(@PathVariable Integer id,@RequestBody SupplierModel supplier){
        SupplierModel founded = SupplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
            founded.setName(supplier.getName());
            founded.setLastName(supplier.getLastName());
            founded.setNit(supplier.getNit());
            founded.setEnterprise(supplier.getEnterprise());
            founded.setEmail(supplier.getEmail());
            founded.setPhone(supplier.getPhone());
            founded.setAddress(supplier.getAddress());
            founded.setState(supplier.getState());
        return SupplierRepository.save(supplier);
    }
    /*
     * 
     */
    @DeleteMapping("/{id}")
    public String deleteSupplier(@PathVariable Integer id){
        SupplierModel founded = SupplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
        SupplierRepository.delete(founded);
        return "El proveedor fue eliminado de la base de datos";
    }

}
