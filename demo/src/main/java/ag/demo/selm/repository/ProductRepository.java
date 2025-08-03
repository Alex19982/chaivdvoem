package ag.demo.selm.repository;

import ag.demo.selm.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
