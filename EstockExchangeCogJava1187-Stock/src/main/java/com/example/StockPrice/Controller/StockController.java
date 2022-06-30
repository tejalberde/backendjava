package com.example.StockPrice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockPrice.Entity.Stock;
import com.example.StockPrice.Service.StockService;

@RestController
@RequestMapping("/estock-ms2")
public class StockController {

	@Autowired
    private StockService stockService;
	

	@PostMapping("/addStock")
	public Stock addStock(@RequestBody Stock stock)
	{
		return stockService.addStock(stock);
	}
	
	@GetMapping("/getStock/{stockid}")
	public Stock getStock(@PathVariable int stockid)
	{
		return stockService.getStock(stockid);
	}
}
