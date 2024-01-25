package SpringSecurityDemo.SpringSecurityDemo.Service;

import SpringSecurityDemo.SpringSecurityDemo.Model.Product;
import SpringSecurityDemo.SpringSecurityDemo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> displayProduct(){

        return productRepository.findAll();
    }



}
