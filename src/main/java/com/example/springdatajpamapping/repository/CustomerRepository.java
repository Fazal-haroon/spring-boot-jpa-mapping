package com.example.springdatajpamapping.repository;

import com.example.springdatajpamapping.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springdatajpamapping.entity.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.example.springdatajpamapping.dto.OrderResponse(c.name, p.productName) FROM Customer c join c.products p")
    List<OrderResponse> getJoinInformation();
}
