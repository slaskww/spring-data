package org.sda.springfull.demo.repository;


import org.sda.springfull.demo.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
