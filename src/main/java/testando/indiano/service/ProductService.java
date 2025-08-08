package testando.indiano.service;

import org.springframework.web.multipart.MultipartFile;
import testando.indiano.payload.ProductDTO;
import testando.indiano.payload.ProductResponse;

import java.io.IOException;

public interface ProductService {

    ProductDTO addProduct(Long categoryID, ProductDTO product);

    ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductResponse searchByCategory(Long categoryID, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductResponse searchProductByKeyword(String keyWord, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
