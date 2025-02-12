package com.zain.cashierapi.apirest.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zain.cashierapi.apirest.repositories.CustomerRepository;
import com.zain.cashierapi.apirest.models.CustomerModel;
import com.zain.cashierapi.apirest.models.ProductModel;

import java.util.List;


/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instantiation, and mapping for customers
*/
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    
    //traer cliente por su id : GET
    /*
     * params: id long 
     * return:   cliente o exception  
     */
    @GetMapping("/{id}")
    public CustomerModel getOneCustomerById(@PathVariable Long id){
        return customerRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No encontramos el cliente solicitado"));        
    }
    //traer clientes
    /*
     * params: none
     * return:   lista de clientes
     */
    @GetMapping
    public List<CustomerModel> findAll(){
        List<CustomerModel> list =  customerRepository.findAll();
        return list;
    }
    //Enviar nuevo cliente
    /*
     * params: body de parametros para el cliente
     * return:  
     */
    @PostMapping
    public CustomerModel createCustomer(@RequestBody CustomerModel customer) {                
        return customerRepository.save(customer);
    }

    //Actualizar producto : PUT
    /*
     * params: id cliente, body de cliente
     * return:     
     */
 
    @PutMapping("/{id}")
    public CustomerModel updateCustomer(@PathVariable Long id,@RequestBody CustomerModel customer){
        CustomerModel founded = customerRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("No encontramos el cliente solicitado"));        
            
            founded.setName(customer.getName());
            founded.setLastName(customer.getLastName());
            founded.setTypeDocument(customer.getTypeDocument());
            founded.setDocument(customer.getDocument());
            founded.setPhone(customer.getPhone());            
            founded.setBirthdate(customer.getBirthdate());
            founded.setEmail(customer.getEmail());
            founded.setAddress(customer.getAddress());                

        return customerRepository.save(customer);
    }
    //Actualizar producto : PUT
    /*
     * params: id producto
     * return:     String que confirma que el cliente fue borrado de la BBDD
     */
    @DeleteMapping("/{id}")
     public String deleteCustomer(@PathVariable Long id){
        CustomerModel founded = customerRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Ningún producto coincide con tu consulta"+": "+id));
        customerRepository.delete(founded);
        
        return "El producto fue eliminado de la base de datos";
    }

}
