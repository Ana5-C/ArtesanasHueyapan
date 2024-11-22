// package artesanasBD.artesanas.model;

// import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.fasterxml.jackson.annotation.JsonManagedReference;

// import jakarta.persistence.*;
// @Entity
// //@Table(name = "cartproducts")
// public class CartProduct {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long idCartProduct;
//     private int quantityProducts;

//     @ManyToOne
//     @JoinColumn(name = "cart_id", referencedColumnName = "idCart")
//     @JsonBackReference(value = "cart-cartProduct")
//     private Cart cart;

//     @ManyToOne
//     @JoinColumn(name = "product_id", referencedColumnName = "idProduct")
//     @JsonManagedReference(value = "product-cartProduct")
//     private Product product;

//     public CartProduct() {
//     }

//     public Long getIdCartProduct() {
//         return idCartProduct;
//     }

//     public void setIdCartProduct(Long idCartProduct) {
//         this.idCartProduct = idCartProduct;
//     }

//     public int getQuantityProducts() {
//         return quantityProducts;
//     }

//     public void setQuantityProducts(int quantityProducts) {
//         this.quantityProducts = quantityProducts;
//     }

//     public Cart getCart() {
//         return cart;
//     }

//     public void setCart(Cart cart) {
//         this.cart = cart;
//     }

//     public Product getProduct() {
//         return product;
//     }

//     public void setProduct(Product product) {
//         this.product = product;
//     }

//     @Override
//     public String toString() {
//         return "CartProduct [idCartProduct=" + idCartProduct + ", quantityProducts=" + quantityProducts + ", cart="
//                 + cart + ", product=" + product + "]";
//     }

    
// }
