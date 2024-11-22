/* package artesanasBD.artesanas.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import artesanasBD.artesanas.model.Cart;
import artesanasBD.artesanas.repository.CartRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAll(){
        return cartRepository.findAll();
    }

    public void save(Cart cart){
        cartRepository.save(cart);
    }

    public Cart getByIdCart(Long idCart){
        return cartRepository.findById(idCart).get();
    }

    public void delete(Long idCart){
        cartRepository.deleteById(idCart);
    }
}

 */