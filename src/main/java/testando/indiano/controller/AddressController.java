package testando.indiano.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testando.indiano.model.User;
import testando.indiano.payload.AddressDTO;
import testando.indiano.service.AddressService;
import testando.indiano.util.AuthUtil;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private AuthUtil authUtil;

    @PostMapping("/addresses")
    public ResponseEntity<AddressDTO> createAddress(@Valid @RequestBody AddressDTO addressDTO) {
        User user = authUtil.loggedInUser();
        AddressDTO savedAddressDTO = addressService.createAddress(addressDTO, user);

        return new ResponseEntity<>(savedAddressDTO, HttpStatus.CREATED);
    }

    @GetMapping("/addresses-from-user")
    public ResponseEntity<List<AddressDTO>> getAddressFromUser() {
        User user = authUtil.loggedInUser();
        List<AddressDTO> addressDTO = addressService.getAddress(user);

        return new ResponseEntity<>(addressDTO, HttpStatus.OK);
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressDTO>> getAddresses() {
        List<AddressDTO> addressDTOS = addressService.getAddresses();

        return new ResponseEntity<>(addressDTOS, HttpStatus.OK);
    }

    @GetMapping("/address/{addressId}")
    public ResponseEntity<List<AddressDTO>> getAddressFromId(@PathVariable Long addressId) {

        AddressDTO addressDTO = addressService.getAddressFromId(addressId);

        return new ResponseEntity<>(addressDTO, HttpStatus.OK);

    }
}
