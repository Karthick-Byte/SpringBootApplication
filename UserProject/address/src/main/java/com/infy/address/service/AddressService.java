package com.infy.address.service;


import com.infy.address.DTO.AddressDTO;
import com.infy.address.DTO.AddressResponseDTO;
import com.infy.address.entity.Address;
import com.infy.address.kafka.UserEvent;
import com.infy.address.repository.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepo addressRepo;

    public List<AddressResponseDTO> getAllAddress()
    {
        List<Address> addressList = addressRepo.findAll();

        return addressList.stream()
                .map(address -> modelMapper.map(address, AddressResponseDTO.class))
                .collect(Collectors.toList());
    }


    public AddressResponseDTO fetchById(Integer addressId)
    {
        Optional<Address> optAdd = addressRepo.findById(addressId);
        if(optAdd.isEmpty())
        {
            throw new RuntimeException("Address is not found");
        }
        Address add = optAdd.get();
        //Entity to DTO
//        AddressResponseDTO response = new AddressResponseDTO();
//        response.setAddressId(add.getAddressId());
//        response.setStreet(add.getStreet());
//        response.setCity(add.getCity());
//        return response;

        return modelMapper.map(add, AddressResponseDTO.class);
    }

    public AddressResponseDTO createAddress(AddressDTO dto) {
        Address address = modelMapper.map(dto, Address.class);
        Address savedAddress = addressRepo.save(address);
        return modelMapper.map(savedAddress, AddressResponseDTO.class);
    }

    public void createAddressFromEvent(UserEvent event) {
        Address address = new Address();
        address.setAddressId(event.getUserId());
        address.setStreet("Default Street");   // or from event if available
        address.setCity("Default City");
        addressRepo.save(address);
        System.out.println("Address saved for user: " + event.getUserId());
    }


    public AddressResponseDTO updateAddress(Integer addressId, AddressDTO dto) {
        Address existingAddress = addressRepo.findById(addressId)
                .orElseThrow(() -> new RuntimeException("Address not found"));
        modelMapper.map(dto, existingAddress);
        Address updatedAddress = addressRepo.save(existingAddress);
        return modelMapper.map(updatedAddress, AddressResponseDTO.class);
    }


    public AddressResponseDTO deleteAddress(Integer addressId) {
        Address add = addressRepo.findById(addressId)
                .orElseThrow(() -> new RuntimeException("Address not found"));
        AddressResponseDTO response = modelMapper.map(add, AddressResponseDTO.class);
        addressRepo.delete(add);
        return response;
    }

}
