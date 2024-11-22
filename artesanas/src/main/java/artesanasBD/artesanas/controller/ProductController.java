package artesanasBD.artesanas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import artesanasBD.artesanas.model.Product;
import artesanasBD.artesanas.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{idProduct}")
    public ResponseEntity<?> findByIdProduct(@PathVariable Long idProduct){
        Product product = productService.getByIdProduct(idProduct);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Product product){
        productService.save(product);
        return new ResponseEntity<String>("Saved", HttpStatus.OK);
    }

    @PutMapping("/{idProduct}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Long idProduct){
        Product auxProduct = productService.getByIdProduct(idProduct);
        product.setIdProduct(auxProduct.getIdProduct());
        return new ResponseEntity<String>("Updated", HttpStatus.OK);
    }

    @DeleteMapping("/{idProduct}")
    public ResponseEntity<?> delete(@PathVariable Long idProduct){
        productService.delete(idProduct);
        return new ResponseEntity<String>("Delete", HttpStatus.OK);
    }
}
