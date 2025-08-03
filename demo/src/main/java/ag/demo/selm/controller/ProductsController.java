package ag.demo.selm.controller;

import ag.demo.selm.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("catalog/product")
public class ProductsController {
    private final ProductService productService;
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String getProductsList(Model model){
        model.addAttribute("products",this.productService.findAllProducts());
        return "catalogue/products/list";
    }
}
