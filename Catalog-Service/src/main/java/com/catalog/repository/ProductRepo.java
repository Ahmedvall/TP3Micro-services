package com.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.catalog.entities.Product;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product, Long> {

}
