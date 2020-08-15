package com.rishabh.datasheet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishabh.datasheet.dto.ObjectDTO;

public interface ObjectRepository extends JpaRepository<ObjectDTO, Long> {
}
