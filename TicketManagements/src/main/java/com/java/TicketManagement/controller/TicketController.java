package com.java.TicketManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.TicketManagement.entity.Ticket;
import com.java.TicketManagement.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@PostMapping(value="/create")
	public Ticket create( @RequestBody Ticket ticket) {
		
		return ticketService.create(ticket);
		
	}
	@GetMapping(value="/getall")
	public Iterable<Ticket> getAllTickets(Ticket ticket) {
		return ticketService.getAllTickets(ticket);
	}

}
