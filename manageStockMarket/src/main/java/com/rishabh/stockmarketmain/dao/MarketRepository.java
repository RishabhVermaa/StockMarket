package com.rishabh.stockmarketmain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishabh.stockmarketmain.dto.MarketDTO;

public interface MarketRepository extends JpaRepository<MarketDTO, Long> {
}
