package tech.buildrun.springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.springsecurity.Entities.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {
}
