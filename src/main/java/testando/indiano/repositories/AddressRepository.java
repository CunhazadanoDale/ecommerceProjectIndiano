package testando.indiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testando.indiano.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
