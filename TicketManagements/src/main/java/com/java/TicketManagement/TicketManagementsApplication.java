package com.java.TicketManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.TicketManagement.entity.Ticket;
import com.java.TicketManagement.service.TicketService;

@SpringBootApplication
public class TicketManagementsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TicketManagementsApplication.class, args);
		
		TicketService ticketService=ctx.getBean("ticketService", TicketService.class);
		
		Ticket ticket= new Ticket("hari", "hari@gmail.com", "hyd");
		
		ticketService.create(ticket);
	}
}
