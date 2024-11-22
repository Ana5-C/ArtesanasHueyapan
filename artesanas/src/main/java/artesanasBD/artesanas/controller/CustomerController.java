/* package artesanasBD.artesanas.controller;

import java.util.*;
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

import artesanasBD.artesanas.model.Customer;
import artesanasBD.artesanas.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{idCustomer}")
    public ResponseEntity<?> findByIdCustomer(@PathVariable Long idCustomer){
        Customer customer = customerService.getByIdCustomer(idCustomer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Customer customer){
        customerService.save(customer);
        return new ResponseEntity<String>("Saved", HttpStatus.OK);
    }

    @PutMapping("/{idCustomer}")
    public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Long idCustomer){
        Customer auxCustomer = customerService.getByIdCustomer(idCustomer);
        customer.setIdCustomer(auxCustomer.getIdCustomer());
        customerService.save(customer);
        return new ResponseEntity<String>("Updated", HttpStatus.OK);
    }

    @DeleteMapping("/{idCustomer}")
    public ResponseEntity<?> delete(@PathVariable Long idCustomer){
        customerService.delete(idCustomer);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
 */