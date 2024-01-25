package SpringSecurityDemo.SpringSecurityDemo.Controller;

import SpringSecurityDemo.SpringSecurityDemo.Model.Product;
import SpringSecurityDemo.SpringSecurityDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    //add, remove , display all CUDE opertion
    @Autowired
    private ProductService productService;
    @GetMapping("/displayProduct")
    public String displayProduct (Model model){
        List<Product> temp= productService.displayProduct();
        model.addAttribute("productList", temp);
        return "displayProduct";
    }
}
