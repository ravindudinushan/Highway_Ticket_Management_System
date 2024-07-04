package lk.ijse.gdse.microservices.ticket_service.service;

import lk.ijse.gdse.microservices.ticket_service.dto.PaymentDTO;
import lk.ijse.gdse.microservices.ticket_service.dto.TicketDTO;

import java.util.List;

public interface TicketService {
    List<TicketDTO> getTickets();
    void addTicket(TicketDTO ticketDTO);
    void updateTicket(PaymentDTO paymentDTO);
}
