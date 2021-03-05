package com.cb.repository;

import org.springframework.stereotype.Repository;

import com.cb.entity.Adress;

@Repository
public class AdressRepository extends JpaRepository<Adress, Long>{

}
