package lk.ijse.gdse.microservices.vehicle_service.controller;

import lk.ijse.gdse.microservices.vehicle_service.dto.VehicleDTO;
import lk.ijse.gdse.microservices.vehicle_service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    @Autowired
    private  VehicleService vehicleService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VehicleDTO> getVehicleDetails() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void registerVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.registerVehicle(vehicleDTO);
        System.out.println("registerVehicle"    + vehicleDTO);
    }

    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        vehicleService.updateVehicle(vehicleDTO);
    }
}
