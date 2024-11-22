// package artesanasBD.artesanas.controller;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import artesanasBD.artesanas.model.CartProduct;
// import artesanasBD.artesanas.service.CartProductService;

// @RestController
// @RequestMapping("/cartProduct")
// @CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
// public class CartProductController {
//     @Autowired
//     private CartProductService cartProductService;

//     @GetMapping
//     public List<CartProduct> getAll() {
//         return cartProductService.getAll();
//     }

//     @GetMapping("/{idCartProduct}")
//     public ResponseEntity<?> findByIdCartProduct(@PathVariable Long idCartProduct) {
//         CartProduct cartProduct = cartProductService.getByIdCartProduct(idCartProduct);
//         return new ResponseEntity<CartProduct>(cartProduct, HttpStatus.OK);
//     }

//     @PostMapping(value = "/cartproduct", consumes = MediaType.APPLICATION_JSON_VALUE)
//     public ResponseEntity<?> create(@RequestBody CartProduct cartProduct) {
//         cartProductService.save(cartProduct);
//         return new ResponseEntity<String>("Saved", HttpStatus.OK);
//     }

//     @PutMapping("/{idCartProduct}")
//     public ResponseEntity<?> update(@RequestBody CartProduct cartProduct, @PathVariable Long idCartProduct) {
//         CartProduct auxCartProduct = cartProductService.getByIdCartProduct(idCartProduct);
//         cartProduct.setIdCartProduct(auxCartProduct.getIdCartProduct());
//         return new ResponseEntity<String>("Updated", HttpStatus.OK);
//     }

//     @DeleteMapping("/{idCartProduct}")
//     public ResponseEntity<?> delete(@PathVariable Long idCartProduct) {
//         cartProductService.delete(idCartProduct);
//         return new ResponseEntity<String>("Delete", HttpStatus.OK);
//     } 
// }
