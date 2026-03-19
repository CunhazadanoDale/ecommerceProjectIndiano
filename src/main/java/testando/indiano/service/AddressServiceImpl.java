package testando.indiano.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testando.indiano.model.Address;
import testando.indiano.model.User;
import testando.indiano.payload.AddressDTO;
import testando.indiano.repositories.AddressRepository;
import testando.indiano.util.AuthUtil;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressDTO createAddress(AddressDTO addressDTO, User user) {

        Address address = modelMapper.map(addressDTO, Address.class);
        List<Address> addressList = user.getAddresses();

        addressList.add(address);
        user.setAddresses(addressList);

        address.setUser(user);
        Address savedAddress = addressRepository.save(address);

        return modelMapper.map(savedAddress, AddressDTO.class);
    }
}
