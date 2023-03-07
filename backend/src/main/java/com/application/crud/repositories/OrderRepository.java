package com.application.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.crud.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
