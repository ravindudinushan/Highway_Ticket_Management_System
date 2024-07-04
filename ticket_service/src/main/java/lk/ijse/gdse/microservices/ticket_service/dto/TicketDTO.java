package lk.ijse.gdse.microservices.ticket_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private int ticket_no;

    @NotNull
    @NotBlank(message = "vehicle registration number number can be not null")
    private String vehicle_registration_number;

    @NotNull
    @NotBlank(message = "start location number can be not null")
    private String start_location;

    @NotNull
    @NotBlank(message = "start date time number can be not null")
    private String start_date_time;

    @Null
    private String end_location;
    @Null
    private double total_amount;
    @Null
    private String end_date_time;

    @NotBlank(message = "status number can be not null")
    private String status;
}
