package org.sda.springfull.demo.service;

import org.sda.springfull.demo.domain.User;
import org.sda.springfull.demo.dto.UserDto;
import org.sda.springfull.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.sda.springfull.demo.mapper.UserMapper.toEntity;

@Service
public class UserService {

    private UserRepository userRepository;

    private AddressService addressService;

    @Autowired
    public UserService(UserRepository userRepository, AddressService addressService) {
        this.userRepository = userRepository;
        this.addressService = addressService;
    }

    @Transactional(readOnly = false)
    public void createUser(UserDto userDto){
        User user = toEntity(userDto);
        this.addressService.save(user.getAddress());
        this.userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Transactional(readOnly = false)
    public void deleteUserById(Long id) {
        this.userRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Transactional
    public void updateUser(UserDto userDto) {
        userRepository.save(toEntity(userDto));
    }
}
