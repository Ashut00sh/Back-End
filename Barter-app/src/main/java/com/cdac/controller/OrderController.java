package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Order;
import com.cdac.repository.OrderRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {
	@Autowired
	public OrderRepository orderrepository;
	
	//get all orders
	@GetMapping("/orders")
	public List<Order> getAllOrders(){
		return orderrepository.findAll();
	}
	//create order rest api
	@PostMapping(name="/orders")
	public Order createOrder(@RequestBody Order or) {
		return orderrepository.save(or);
	}
	
}
