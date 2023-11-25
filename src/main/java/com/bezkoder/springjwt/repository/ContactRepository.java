package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Integer> {

    
}
