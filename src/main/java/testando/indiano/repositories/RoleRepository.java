package testando.indiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testando.indiano.model.AppRole;
import testando.indiano.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
