package org.sda.springfull.demo.rest;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public List<Address> findAll(){
        return this.addressService.findAll();
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    public Address findById(@PathVariable Long id){
        return this.addressService.getById(id);
    }
}
