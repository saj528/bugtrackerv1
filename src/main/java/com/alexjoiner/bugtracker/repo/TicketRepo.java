package com.alexjoiner.bugtracker.repo;

import com.alexjoiner.bugtracker.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepo extends JpaRepository<Ticket, Long> {

    void deleteTicketById(Long id);

    Optional<Ticket> findTicketById(Long id);
}
