package com.cb.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cb.entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long> {

}
