/* package artesanasBD.artesanas.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artesanasBD.artesanas.model.Customer;
import artesanasBD.artesanas.repository.CustomerRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public Customer getByIdCustomer(Long idCustomer){
        return customerRepository.findById(idCustomer).get();
    }

    public void delete(Long idCustomer){
        customerRepository.deleteById(idCustomer);
    }
}
 */