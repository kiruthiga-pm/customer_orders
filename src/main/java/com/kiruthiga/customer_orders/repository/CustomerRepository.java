package com.kiruthiga.customer_orders.repository;

import com.kiruthiga.customer_orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kiruthiga P M
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
