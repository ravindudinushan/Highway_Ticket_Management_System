package lk.ijse.gdse.microservices.vehicle_service.repo;

import lk.ijse.gdse.microservices.vehicle_service.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,String> {
}
