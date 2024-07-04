package lk.ijse.gdse.microservices.ticket_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private int ticket_no;
    private String end_location;
    private double total_amount;
    private String end_date_time;
    private String status;
}
