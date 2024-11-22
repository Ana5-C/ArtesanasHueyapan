// package artesanasBD.artesanas.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import artesanasBD.artesanas.model.CartProduct;
// import artesanasBD.artesanas.repository.CartProductRepository;
// import jakarta.transaction.Transactional;

// @Service
// @Transactional
// public class CartProductService {
//     @Autowired
//     private CartProductRepository cartProductRepository;

//     public List<CartProduct> getAll(){
//         return cartProductRepository.findAll();
//     }

//     public void save(CartProduct cartProduct){
//         cartProductRepository.save(cartProduct);
//     }

//     public CartProduct getByIdCartProduct(Long idCartProduct){
//         return cartProductRepository.findById(idCartProduct).get();
//     }

//     public void delete(Long idCartProduct){
//         cartProductRepository.deleteById(idCartProduct);
//     }
// }
