package com.application.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.crud.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
