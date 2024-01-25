package SpringSecurityDemo.SpringSecurityDemo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="product_id")
    private int productId;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="product_category")
    private String productCategory;

    @Column(name ="product_qty")
    private int productQty;

    @Column(name ="product_price")
    private double productPrice;

}
