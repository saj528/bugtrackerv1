package com.alexjoiner.bugtracker.exceptions;

public class TicketNotFoundException extends RuntimeException{
    public TicketNotFoundException(String message) {
        super(message);
    }
}
