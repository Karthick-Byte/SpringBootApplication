package com.infy.user.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Integer addressId;
}
