package com.pp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pp.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String>{

}
