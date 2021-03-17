package com.cb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
