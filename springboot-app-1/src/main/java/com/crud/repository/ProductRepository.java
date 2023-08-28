package com.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Optional<Product> findByName(String name);

}