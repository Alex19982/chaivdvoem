package ag.demo.selm.service;

import ag.demo.selm.ProductService;
import ag.demo.selm.entity.Product;
import ag.demo.selm.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultProductService implements ProductService {
    private final ProductRepository productRepository;
    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;}

    @Override
    public List<Product> findAllProducts() {
        return this.productRepository.findAll();
    }
}
