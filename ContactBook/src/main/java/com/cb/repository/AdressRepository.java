package com.cb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.entity.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long> {

}
