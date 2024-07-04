package lk.ijse.gdse.microservices.user_service.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotNull
    @NotBlank(message = "user NIC number can be not null")
    private String user_NIC;

    @NotNull
    @NotBlank(message = "user name can be not null")
    private String user_name;

    @NotNull
    @NotBlank(message = "user address  can be not null")
    private String address;

    @NotNull
    @NotBlank(message = "user contact can be not null")
    private String contact;
}
