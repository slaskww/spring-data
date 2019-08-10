package org.sda.springfull.demo.mapper;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.domain.User;
import org.sda.springfull.demo.dto.UserDto;

public class UserMapper {

    public static User toEntity(UserDto userDto) {
        Address address = new Address();
        address.setCity(userDto.getCity());
        address.setAppartmentNumber(userDto.getApartmentNumber());
        address.setHouseNumber(userDto.getHouseNumber());
        address.setStreet(userDto.getStreet());
        address.setId(userDto.getAddressId());

        User user = new User();
        user.setId(userDto.getId());
        user.setAddress(address);
        user.setBirthDate(userDto.getBirthDate());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        return user;
    }

    public static UserDto toDto(User user){
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setBirthDate(user.getBirthDate());
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());

        Address address = user.getAddress();
        userDto.setAddressId(address.getId());
        userDto.setCity(address.getCity());
        userDto.setStreet(address.getStreet());
        userDto.setHouseNumber(address.getHouseNumber());
        userDto.setApartmentNumber(address.getAppartmentNumber());
        return userDto;
    }

}
