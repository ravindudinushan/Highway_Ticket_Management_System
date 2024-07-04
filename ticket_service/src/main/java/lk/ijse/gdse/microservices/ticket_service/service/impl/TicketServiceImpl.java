package lk.ijse.gdse.microservices.ticket_service.service.impl;

import jakarta.ws.rs.NotFoundException;
import lk.ijse.gdse.microservices.ticket_service.dto.PaymentDTO;
import lk.ijse.gdse.microservices.ticket_service.dto.TicketDTO;
import lk.ijse.gdse.microservices.ticket_service.entity.Ticket;
import lk.ijse.gdse.microservices.ticket_service.repo.TicketRepo;
import lk.ijse.gdse.microservices.ticket_service.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TicketDTO> getTickets() {
        return ticketRepo.findAll().stream().map(ticket -> modelMapper.map(ticket, TicketDTO.class)).toList();
    }

    @Override
    public void addTicket(TicketDTO ticketDTO) {
        if(ticketRepo.existsById(ticketDTO.getTicket_no())){
            throw new RuntimeException("Customer Id "+ticketDTO.getTicket_no()+" All ready exist");
        }
        ticketRepo.save(modelMapper.map(ticketDTO,Ticket.class));
    }

    @Override
    public void updateTicket(PaymentDTO paymentDTO) {

        if(!ticketRepo.existsById(paymentDTO.getTicket_no())){
            throw new RuntimeException("Customer Id "+paymentDTO.getTicket_no()+" does not exist");
        }
        Ticket ticket= ticketRepo.findById(paymentDTO.getTicket_no()).get();
        ticket.setEnd_location(paymentDTO.getEnd_location());
        ticket.setTotal_amount(paymentDTO.getTotal_amount());
        ticket.setEnd_date_time(paymentDTO.getEnd_date_time());
        ticket.setStatus(paymentDTO.getStatus());

        modelMapper.map(ticketRepo.save(ticket),TicketDTO.class);
    }
}
