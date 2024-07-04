package lk.ijse.gdse.microservices.ticket_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_no;
    private String vehicle_registration_number;
    private String start_location;
    private String start_date_time;
    private String end_location;
    private double total_amount;
    private String end_date_time;
    private String status;

}
