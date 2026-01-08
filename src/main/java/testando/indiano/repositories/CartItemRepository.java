package testando.indiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testando.indiano.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
