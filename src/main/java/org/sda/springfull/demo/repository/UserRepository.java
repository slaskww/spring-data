package org.sda.springfull.demo.repository;

import org.sda.springfull.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
