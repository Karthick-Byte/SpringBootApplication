package com.infy.user.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddressResponseDTO {
    private Integer addressId;
    private String street;
    private String city;
}
