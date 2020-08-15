package com.rishabh.CompanyData.dao;

import com.rishabh.CompanyData.dto.StockDTO;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<StockDTO, Long> {

    List<StockDTO> findByCompanyCode(String companyCode);
}
