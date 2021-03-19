package com.alexjoiner.bugtracker.service;

import com.alexjoiner.bugtracker.model.Ticket;
import com.alexjoiner.bugtracker.repo.TicketRepo;
import com.alexjoiner.bugtracker.exceptions.TicketNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TicketService {

    private final TicketRepo ticketRepo;

    @Autowired
    public TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public Ticket addTicket(Ticket ticket){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        ticket.setCreatedDate(formatter.format(date));
        return ticketRepo.save(ticket);
    }


    public List<Ticket> findAllTickets(){
        return ticketRepo.findAll();
    }

    public Ticket updateTicket(Ticket employee){
        return ticketRepo.save(employee);
    }

    public Ticket findTicketById(Long id){
        return ticketRepo.findTicketById(id).orElseThrow(() -> new TicketNotFoundException("Ticket by id: " + id + " was not found"));
    }


    public void deleteTicket(Long id){
        ticketRepo.deleteTicketById(id);
    }
}
