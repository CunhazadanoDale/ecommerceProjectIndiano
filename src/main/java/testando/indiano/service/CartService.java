package testando.indiano.service;

import testando.indiano.payload.CartDTO;


public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
