package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Images;

public interface ImagesRepository extends JpaRepository<Images, Long> {
}
