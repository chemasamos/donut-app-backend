package com.tecdesoftware.donutapp.repository;

import com.tecdesoftware.donutapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
