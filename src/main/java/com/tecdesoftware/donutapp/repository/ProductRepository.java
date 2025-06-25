package com.tecdesoftware.donutapp.repository;

import com.tecdesoftware.donutapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
