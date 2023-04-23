package com.resturant.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resturant.management.model.Resturant;

public interface ResturantRepository extends JpaRepository<Resturant, Integer> {

}
