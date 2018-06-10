package com.java.TicketManagement.Dao;

import org.springframework.data.repository.CrudRepository;

import com.java.TicketManagement.entity.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
