package artesanasBD.artesanas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artesanasBD.artesanas.model.Product;
import artesanasBD.artesanas.repository.ProductRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    /* public List<Product> getByName(String name){
        return productRepository.findByName(name);
    } */

    public void save(Product product){
        productRepository.save(product);
    }

    public Product getByIdProduct(Long idProduct){
        return productRepository.findById(idProduct).get();
    }

    public void delete(Long idProduct){
        productRepository.deleteById(idProduct);
    }
}
