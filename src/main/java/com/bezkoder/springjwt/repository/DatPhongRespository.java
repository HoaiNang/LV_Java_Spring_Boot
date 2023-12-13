package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.DatPhong;

public interface DatPhongRespository extends JpaRepository<DatPhong, Integer> {
    
}
