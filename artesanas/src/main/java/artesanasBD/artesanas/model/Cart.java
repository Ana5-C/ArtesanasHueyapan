/* package artesanasBD.artesanas.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCart;
    private String dateCreated;

    @OneToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "idCustomer")
    @JsonManagedReference
    private Customer customer;

    /*@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference(value = "cart-cartProduct")
    private List<CartProduct> cartProducts;*/

    // @ManyToMany(cascade = CascadeType.ALL)
    // @JoinTable(
    //     name = "productsCart",
    //     joinColumns = @JoinColumn(name = "idCart", referencedColumnName = "idCart"),
    //     inverseJoinColumns = @JoinColumn(name ="idProduct", referencedColumnName ="idProduct") 
    // )
    // private List<Product> products;

    /*public Cart(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Cart(){}

    public Long getIdCart() {
        return idCart;
    }

    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // public List<Product> getProducts() {
    //     return products;
    // }

    // public void setProducts(List<Product> products) {
    //     this.products = products;
    // }

    @Override
    public String toString() {
        return "Cart [idCart=" + idCart + ", dateCreated=" + dateCreated + ", customer=" + customer +  "]";
    }

   
}*/