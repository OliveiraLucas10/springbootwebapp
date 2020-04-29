package com.oliveiralucaspro.repositories;

import com.oliveiralucaspro.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
