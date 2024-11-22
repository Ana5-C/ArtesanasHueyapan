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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import artesanasBD.artesanas.model.Cart;
import artesanasBD.artesanas.service.CartService;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAll(){
        return cartService.getAll();
    }

    @GetMapping("/{idCart}")
    public ResponseEntity<?> findByIdCart(@PathVariable Long idCart){
        Cart cart = cartService.getByIdCart(idCart);
        return new ResponseEntity<Cart>(cart, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cart cart){
        cartService.save(cart);
        return new ResponseEntity<String>("Saved", HttpStatus.OK);
    }

    @PutMapping("/{idCart}")
    public ResponseEntity<?> update(@RequestBody Cart cart, @PathVariable Long idCart){
        Cart auxCart = cartService.getByIdCart(idCart);
        cart.setIdCart(auxCart.getIdCart());
        cartService.save(cart);
        return new ResponseEntity<String>("Updated", HttpStatus.OK);
    }

    @DeleteMapping("/{idCart}")
    public ResponseEntity<?> delete(@PathVariable Long idCart){
        cartService.delete(idCart);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}

 */