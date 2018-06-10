package com.java.TicketManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.TicketManagement.Dao.TicketDao;
import com.java.TicketManagement.entity.Ticket;

@Service
public class TicketService {
	@Autowired
	private TicketDao ticketDao;

	public Ticket create(Ticket ticket) {
		
		return ticketDao.save(ticket);
	}

	public Iterable<Ticket> getAllTickets(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.findAll();
	}

}
