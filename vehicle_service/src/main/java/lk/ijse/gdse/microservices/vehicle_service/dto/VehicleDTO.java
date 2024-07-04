package lk.ijse.gdse.microservices.vehicle_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {

    @NotNull
    @NotBlank(message = "registration number can be not null")
    private String registration_number;

    @NotNull
    @NotBlank(message = "vehicle chassis number can be not null")
    private String vehicle_chassis_number;

    @NotNull
    @NotBlank(message = "vehicle type can be not null")
    private String vehicle_type;

    @NotNull
    @NotBlank(message = "vehicle model can be not null")
    private String vehicle_model;

    @NotNull
    @NotBlank(message = "vehicle year can be not null")
    private String vehicle_year;

    @NotNull
    @NotBlank(message = "vehicle color can be not null")
    private String vehicle_color;

    @NotNull
    @NotBlank(message = "vehicle engine can be not null")
    private String vehicle_engine;

    @NotNull
    @NotBlank(message = "vehicle fuel type can be not null")
    private String vehicle_fuel_type;

    @NotNull
    @NotBlank(message = "user NIC can be not null")
    private String userNIC;

}
