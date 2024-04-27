package com.hcl.portfolioservice.controller;

import com.hcl.portfolioservice.model.CustomerPortfolioDto;
import com.hcl.portfolioservice.model.PortfolioDto;
import com.hcl.portfolioservice.service.PortfolioService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/portfolio")
@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping
    public ResponseEntity<List<CustomerPortfolioDto>> getPortfolios(@RequestParam String customerId){
        return ResponseEntity.ok(portfolioService.getPortfolios(customerId));
    }

    @GetMapping("/{portfolioId}")
    public ResponseEntity<PortfolioDto> getPortfolioById(@PathParam("portfolioId") String portfolioId){
        return ResponseEntity.ok(portfolioService.getPortfolio(portfolioId));
    }
}
