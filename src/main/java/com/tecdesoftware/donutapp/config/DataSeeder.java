package com.tecdesoftware.donutapp.config;

import com.tecdesoftware.donutapp.model.Category;
import com.tecdesoftware.donutapp.model.Product;
import com.tecdesoftware.donutapp.repository.CategoryRepository;
import com.tecdesoftware.donutapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(CategoryRepository categoryRepo, ProductRepository productRepo) {
        return args -> {
            // Crear categorías
            List<Category> categories = List.of(
                    new Category("Burgers"),
                    new Category("Donuts"),
                    new Category("Pancakes"),
                    new Category("Pizzas"),
                    new Category("Smoothies")
            );
            categoryRepo.saveAll(categories);

            // Guardar productos
            productRepo.saveAll(List.of(
                    new Product("The Classic", "Grill House", 40, categoryRepo.findByName("Burgers")),
                    new Product("The Special", "Flame Burger", 50, categoryRepo.findByName("Burgers")),
                    new Product("Double Flavor", "Stacked Buns", 90, categoryRepo.findByName("Burgers")),
                    new Product("The Gourmet", "Prime Bites", 100, categoryRepo.findByName("Burgers")),
                    new Product("Supreme Delight", "Grill House", 38, categoryRepo.findByName("Burgers")),
                    new Product("Roger Classic", "Flame Burger", 48, categoryRepo.findByName("Burgers")),
                    new Product("Alan Classic", "Stacked Buns", 88, categoryRepo.findByName("Burgers")),

                    new Product("Gaxiola Favorit", "Kukis", 36, categoryRepo.findByName("Donuts")),
                    new Product("WichoPie", "Colom", 40, categoryRepo.findByName("Donuts")),
                    new Product("Jagger", "Pollo Brujo", 700, categoryRepo.findByName("Donuts")),
                    new Product("Bacardi", "Mixe", 95, categoryRepo.findByName("Donuts")),
                    new Product("katita", "kitis y algo mas", 100, categoryRepo.findByName("Donuts")),
                    new Product("kitilibum", "kitis y algo mas", 401, categoryRepo.findByName("Donuts")),
                    new Product("dononon", "seth roguen", 700, categoryRepo.findByName("Donuts")),

                    new Product("FroggyMugged", "Cantaritos", 20, categoryRepo.findByName("Pancakes")),
                    new Product("All classic", "Colom", 120, categoryRepo.findByName("Pancakes")),
                    new Product("Absolut", "Donde", 15, categoryRepo.findByName("Pancakes")),
                    new Product("Piketito", "Mixe", 90, categoryRepo.findByName("Pancakes")),
                    new Product("Normales", "Kukis", 70, categoryRepo.findByName("Pancakes")),
                    new Product("Roblox", "Vans", 37, categoryRepo.findByName("Pancakes")),
                    new Product("Rockk", "HXDERBEZ", 10, categoryRepo.findByName("Pancakes")),

                    new Product("Anchovies", "Pizza Hut", 36, categoryRepo.findByName("Pizzas")),
                    new Product("Shrimp", "Messinas", 54, categoryRepo.findByName("Pizzas")),
                    new Product("Mushroom", "Costco", 84, categoryRepo.findByName("Pizzas")),
                    new Product("Pepperoni", "Domino's", 95, categoryRepo.findByName("Pizzas")),
                    new Product("Peppers", "Pizza y corre", 36, categoryRepo.findByName("Pizzas")),
                    new Product("Salami", "Sanetis", 84, categoryRepo.findByName("Pizzas")),
                    new Product("Pineapple", "Superpizza", 54, categoryRepo.findByName("Pizzas")),

                    new Product("Cherry", "Starbucks", 36, categoryRepo.findByName("Smoothies")),
                    new Product("Coconut", "Bombuté", 54, categoryRepo.findByName("Smoothies")),
                    new Product("Lemon", "Bova Tea", 84, categoryRepo.findByName("Smoothies")),
                    new Product("Apple", "TaBoo", 95, categoryRepo.findByName("Smoothies")),
                    new Product("Melon", "POP Tea", 36, categoryRepo.findByName("Smoothies")),
                    new Product("Orange", "Gong Cha", 54, categoryRepo.findByName("Smoothies")),
                    new Product("Banana", "Tapioca Flavors", 84, categoryRepo.findByName("Smoothies"))
            ));
        };
    }
}
