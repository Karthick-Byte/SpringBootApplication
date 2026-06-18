package com.infy.address.controller;


import com.infy.address.DTO.AddressDTO;
import com.infy.address.DTO.AddressResponseDTO;
import com.infy.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getall")
    public ResponseEntity<List<AddressResponseDTO>> getAllAddress()
    {
        return new ResponseEntity<>(addressService.getAllAddress(), HttpStatus.OK);
    }

    @GetMapping("/get/{addressId}")
    public ResponseEntity<AddressResponseDTO> getAddressById(@PathVariable Integer addressId)
    {
        return new ResponseEntity<>(addressService.fetchById(addressId), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<AddressResponseDTO> createAddress(@RequestBody AddressDTO request) {
        return new ResponseEntity<>(addressService.createAddress(request), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AddressResponseDTO> updateAddress(@PathVariable Integer id, @RequestBody AddressDTO request) {
        return new ResponseEntity<>(addressService.updateAddress(id, request), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<AddressResponseDTO> deleteAddress(@PathVariable Integer addressId) {
        return new ResponseEntity<>(addressService.deleteAddress(addressId), HttpStatus.OK);
    }

}
