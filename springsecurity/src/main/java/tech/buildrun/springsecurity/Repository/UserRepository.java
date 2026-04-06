package tech.buildrun.springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.springsecurity.Entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
