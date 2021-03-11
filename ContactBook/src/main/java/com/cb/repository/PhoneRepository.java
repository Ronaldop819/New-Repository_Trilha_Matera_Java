package com.cb.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cb.entity.Phone;


public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
