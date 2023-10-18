package com.bezkoder.springjwt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bezkoder.springjwt.models.House;

public interface HouseRepository extends JpaRepository<House, Integer> {
    
}
