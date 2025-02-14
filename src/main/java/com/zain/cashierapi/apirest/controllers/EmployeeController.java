package com.zain.cashierapi.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zain.cashierapi.apirest.repositories.EmployeeRepository;
import com.zain.cashierapi.apirest.models.EmployeeModel;

import java.util.List;


/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instantiation, and mapping for customers
*/
@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

   //traer cliente por su id : GET
    /*
     * params: id int 
     * return:   empleado o exception  
     */
    @GetMapping("/{id}")
    public  EmployeeModel getOneEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Ningún empleado coincide con tu consulta"+": "+id));                      
        //.orElseThrow(()-> new RuntimeException("No encontramos el empleado solicitado "+ id));
    }
    //traer cliente por su id : GET
    /*
     * params: id int 
     * return:   empleado o exception  
     */
    @GetMapping 
    public List<EmployeeModel> findAll(){
        List<EmployeeModel> list = employeeRepository.findAll();
        return list;
    }
    //traer cliente por su id : GET
    /*
     * params: EmployeeModel empleado 
     * return:   empleado o exception  
     */

    @PostMapping
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employee){
        return employeeRepository.save(employee);
    }
     //traer cliente por su id : GET
    /*
     * params: EmployeeModel empleado 
     * return:   Lista de empleados actualizado o exception  
     */
    @PutMapping("/{id}")
    public EmployeeModel updateEmployee(@PathVariable Long id,@RequestBody EmployeeModel employee){
        EmployeeModel founded = employeeRepository.findById(id)
        .orElseThrow(() ->new RuntimeException("No se actualizo el empleado" + id));
            founded.setName(employee.getName());
            founded.setLastName(employee.getLastName());
            founded.setTypeDocument(employee.getTypeDocument());
            founded.setDocument(employee.getDocument());
            founded.setPhone(employee.getPhone());
            founded.setEmail(employee.getEmail());
            founded.setBirthdate(employee.getBirthdate());
            founded.setBegan(employee.getBegan());
            founded.setRole(employee.getRole());

        return employeeRepository.save(employee);
    }
     //traer cliente por su id : GET
    /*
     * params: empleado borrado 
     * return:  String que confirma que fue borrado el empleado  
     * trhow: String que informa que no existia el recurso
     */
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        EmployeeModel employee = employeeRepository.findById(id)
        .orElseThrow(()->new RuntimeException("No existia el empleado en la base de datos"));
        employeeRepository.delete(employee);
        
        return "Empleado borrado de la base de datos"+id;
    }







 /* private String name;
    private String lastName;
    private String typeDocument;
    private String document;
    private String phone;
    private Date birthdate;
    private String email;    
    */
}
