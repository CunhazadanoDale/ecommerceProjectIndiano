package testando.indiano.service;

import jakarta.validation.Valid;
import testando.indiano.model.User;
import testando.indiano.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
    List<AddressDTO> getAddress(User user);
    List<AddressDTO> getAddresses();
    AddressDTO getAddressFromId(Long addressId);
}
