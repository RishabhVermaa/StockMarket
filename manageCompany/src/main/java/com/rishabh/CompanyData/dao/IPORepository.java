package com.rishabh.CompanyData.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishabh.CompanyData.dto.IPOdto;

import java.util.List;

public interface IPORepository extends JpaRepository<IPOdto, Long> {
    List<IPOdto> findAllByOrderByOpenDate();
}
