package testando.indiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testando.indiano.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
