package com.se.dream_shop.repository;

import com.se.dream_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Long countByBrandAndName(String brand, String name);

    List<Product> findByBrandAndName(String brand, String name);

    List<Product> findByCategory(String category);

    List<Product> findByBrand(String brand);

    List<Product> findByCategoryAndBrand(String category, String brand);

    List<Product> findByName(String name);
    
}
