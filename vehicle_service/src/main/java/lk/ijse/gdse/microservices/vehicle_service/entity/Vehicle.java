package lk.ijse.gdse.microservices.vehicle_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {

    @Id
    private String registration_number;
    private String vehicle_chassis_number;
    private String vehicle_type;
    private String vehicle_model;
    private String vehicle_year;
    private String vehicle_color;
    private String vehicle_engine;
    private String vehicle_fuel_type;
    private String userNIC;

}
