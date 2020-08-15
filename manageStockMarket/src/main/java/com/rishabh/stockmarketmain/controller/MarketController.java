package com.rishabh.stockmarketmain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rishabh.stockmarketmain.model.Market;
import com.rishabh.stockmarketmain.service.MarketService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stockexchange")
public class MarketController {
    @Autowired
    MarketService stockExchangeService;

    @GetMapping("/all")
    public List<Market> getAllStockExchanges() {
        return stockExchangeService.retrieveAllMarkets();
    }

    @PostMapping("/add")
    public Map<String, String> addNewStockExchange(@RequestBody Market stockExchange) {
        Map<String, String> resultMap = new HashMap<>();
        stockExchangeService.addNewMarkets(stockExchange);
        resultMap.put("addStockExchangeStatus", "successful");
        return resultMap;
    }

}