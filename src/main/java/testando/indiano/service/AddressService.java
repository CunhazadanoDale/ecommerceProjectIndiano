package testando.indiano.service;

import testando.indiano.model.User;
import testando.indiano.payload.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
}
