package testando.indiano.service;

import testando.indiano.payload.CartDTO;

import java.util.List;


public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
    List<CartDTO> getAllCarts();

    CartDTO getCart(String emailId, Long cartId);
}
