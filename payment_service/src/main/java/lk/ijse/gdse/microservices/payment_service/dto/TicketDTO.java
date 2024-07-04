package lk.ijse.gdse.microservices.payment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private int ticket_no;
    private String vehicle_registration_number;
    private String start_location;
    private String start_date_time;
    private String end_location;
    private double total_amount;
    private String end_date_time;
}
