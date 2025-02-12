package com.zain.cashierapi.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zain.cashierapi.apirest.repositories.ProductRepository;
import com.zain.cashierapi.apirest.models.ProductModel;
import java.util.List;

/*
 * author: Andres Zapata. medstrings6@gmail.com
 * class for instanciation of products, and mapping
*/
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    //traer producto por su id : GET
    /*
     * params:
     * return:     
     */
    @GetMapping("/{id}")
    public ProductModel getOneProductById(@PathVariable Long id){
         return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Ningún producto coincide con tu consulta"+": "+id));                
    }
    //traer todos los productos : GET
    /*
     * params:
     * return:     
     */
    @GetMapping
    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }
    //Nuevo producto : POST
    /*
     * params:
     * return:     
     */
    @PostMapping
    public ProductModel createProduct(@RequestBody ProductModel product){
        return productRepository.save(product);
    }

    //Actualizar producto : PUT
    /*
     * params: id producto, body de producto
     * return:     
     */
    @PutMapping("/{id}")
    public ProductModel updateProduct(@PathVariable Long id, @RequestBody ProductModel product){
        ProductModel founded =  productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Ningún producto coincide con tu consulta"+": "+id));  
            founded.setName(product.getName());
            founded.setProducer(product.getProducer());
            founded.setPackaging(product.getPackaging());
            founded.setCode(product.getPackaging());
            founded.setPrice(product.getPrice());
            founded.setQuantity(product.getQuantity());
            founded.setDistributor(product.getDistributor());
            founded.setPricePurchased(product.getPricePurchased());
        return productRepository.save(founded);
    }

    //Borrar producto : DELETE
    /*
     * params: id producto
     * return:     String que confirma que el recurso fue borrado de la BBDD
     */
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        ProductModel founded =  productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Ningún producto coincide con tu consulta"+": "+id));
        productRepository.delete(founded);
        
        return "El producto fue eliminado de la base de datos";
    }
}
