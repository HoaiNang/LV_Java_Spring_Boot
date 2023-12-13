package com.bezkoder.springjwt.repository;


import jakarta.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.entity.LuuAnh;

import java.util.List;


@Repository
public interface LuuAnhRepository extends JpaRepository<LuuAnh, Long> {

}
