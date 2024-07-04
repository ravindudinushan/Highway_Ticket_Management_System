package lk.ijse.gdse.microservices.user_service.repo;

import lk.ijse.gdse.microservices.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
