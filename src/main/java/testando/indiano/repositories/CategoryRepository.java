package testando.indiano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testando.indiano.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
}
