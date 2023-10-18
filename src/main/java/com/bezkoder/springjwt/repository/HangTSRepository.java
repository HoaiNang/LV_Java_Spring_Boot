package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.HangThuySan;

public interface HangTSRepository extends JpaRepository<HangThuySan, Integer>  {
    
}
