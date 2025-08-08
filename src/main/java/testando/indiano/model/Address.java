package testando.indiano.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 2, message = "Street name must be atleast 2 characters")
    private String street;

    @NotBlank
    @Size(min = 1, message = "Number must be atleast 1 character")
    private String number;

    @NotBlank
    @Size(min = 2, message = "City name must be atleast 2 characters")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State name must be atleast 2 characters")
    private String state;

    @NotBlank
    @Size(min = 3, message = "Country name must be atleast 3 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = "Pincode must be atleast 2 characters")
    private String pincode;

    @ToString.Exclude
    @ManyToMany (mappedBy = "addresses")
    private List<User> users = new ArrayList();

    public Address(String street, String number, String city, String state, String country, String pincode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}
