package lk.ijse.gdse.microservices.ticket_service.controller;

import lk.ijse.gdse.microservices.ticket_service.dto.PaymentDTO;
import lk.ijse.gdse.microservices.ticket_service.dto.TicketDTO;
import lk.ijse.gdse.microservices.ticket_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TicketDTO> getTicketsDetails() {
        return ticketService.getTickets();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveTicketDetails(@RequestBody TicketDTO ticketDTO) {
        ticketService.addTicket(ticketDTO);
    }

    @PutMapping(value = "/updateStatus",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTicketDetails(@RequestBody PaymentDTO paymentDTO) {
        System.out.println(paymentDTO);
        ticketService.updateTicket(paymentDTO);
    }
}
