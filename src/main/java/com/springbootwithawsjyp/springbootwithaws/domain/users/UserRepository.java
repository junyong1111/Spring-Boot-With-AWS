package com.springbootwithawsjyp.springbootwithaws.domain.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);

}
