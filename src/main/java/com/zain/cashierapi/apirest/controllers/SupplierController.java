package com.zain.cashierapi.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zain.cashierapi.apirest.repositories.SupplierRepository;

import com.zain.cashierapi.apirest.models.SupplierModel;

//import java.util.Date;
import java.util.List;



@RestController 
@RequestMapping("api/suppliers")
public class SupplierController {
    @Autowired 
    private SupplierRepository supplierRepository;

    /*
     * 
    */
    @GetMapping("/{id}")
    public SupplierModel getOntSupplierById(@PathVariable Long id){
        SupplierModel supplier =  supplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
        return supplier;
    }
    /*
     * 
     */
    @GetMapping
    public List<SupplierModel> findAllSuppliers(){
        List<SupplierModel> list = supplierRepository.findAll();
        return list;
    }
    /*
     * 
     */
    @PostMapping
    public SupplierModel createSupplier(@RequestBody SupplierModel supplier){
        return supplierRepository.save(supplier);
    }
        
    @PutMapping("/{id}")
    public SupplierModel updateSupplier(@PathVariable Long id, @RequestBody SupplierModel supplier){
        SupplierModel founded = supplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
            founded.setName(supplier.getName());
            founded.setLastName(supplier.getLastName());            
            founded.setNit(supplier.getNit());
            founded.setEnterprise(supplier.getEnterprise());
            founded.setEmail(supplier.getEmail());
            founded.setPhone(supplier.getPhone());
            founded.setAddress(supplier.getAddress());
            founded.setState(supplier.getState());
            founded.setBegan(supplier.getBegan());            
        return supplierRepository.save(supplier);
    }
    /*
     * 
     */
    @DeleteMapping("/{id}")
    public String deleteSupplier(@PathVariable Long id){
        SupplierModel founded = supplierRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No encontramos el proveedor"+id));
        supplierRepository.delete(founded);
        return "El proveedor fue eliminado de la base de datos";
    }

}
