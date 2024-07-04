package lk.ijse.gdse.microservices.ticket_service.repo;

import lk.ijse.gdse.microservices.ticket_service.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
    //Ticket findByT(int ticket_no);

}
