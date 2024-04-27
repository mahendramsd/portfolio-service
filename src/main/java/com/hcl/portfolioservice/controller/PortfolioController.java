package com.hcl.portfolioservice.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/portfolio")
@RestController
public class PortfolioController {

    @GetMapping
    public void getPortfolios(){
        // TODO: 4/27/24 list of portfolios
    }

    @GetMapping("/{portfolioId}")
    public void getPortfolioById(@PathParam("portfolioId") String portfolioId){
        // TODO: 4/27/24 get portfolio by id
    }
}
