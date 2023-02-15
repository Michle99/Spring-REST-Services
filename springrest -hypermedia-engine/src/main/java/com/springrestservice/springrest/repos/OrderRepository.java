package com.springrestservice.springrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrestservice.springrest.Beans.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
