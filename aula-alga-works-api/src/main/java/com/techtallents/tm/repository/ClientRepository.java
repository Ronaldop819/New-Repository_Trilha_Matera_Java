package com.techtallents.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtallents.tm.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
