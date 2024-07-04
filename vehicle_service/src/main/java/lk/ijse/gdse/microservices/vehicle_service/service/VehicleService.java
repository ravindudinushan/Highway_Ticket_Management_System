package lk.ijse.gdse.microservices.vehicle_service.service;


import lk.ijse.gdse.microservices.vehicle_service.dto.VehicleDTO;
import java.util.List;

public interface VehicleService {
    List<VehicleDTO> getAllVehicles();
    void registerVehicle(VehicleDTO vehicleDTO);
    void updateVehicle(VehicleDTO vehicleDTO);
}
