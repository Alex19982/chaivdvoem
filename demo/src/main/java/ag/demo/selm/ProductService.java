package ag.demo.selm;

import ag.demo.selm.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
}
