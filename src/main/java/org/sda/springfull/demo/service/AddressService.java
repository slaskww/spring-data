package org.sda.springfull.demo.service;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address save(Address address){
        return this.addressRepository.save(address);
    }
}
