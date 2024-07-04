package lk.ijse.gdse.microservices.payment_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private int ticket_no;

    @NotNull
    @NotBlank(message = "end location number can be not null")
    private String end_location;

    @NotNull
    @NotBlank(message = "total amount number can be not null")
    private double total_amount;

    @NotNull
    @NotBlank(message = "end date time can be not null")
    private String end_date_time;

    @NotNull
    @NotBlank(message = "update status  can be not null")
    private String status;
}
