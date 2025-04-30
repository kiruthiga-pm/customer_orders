package com.tejatechtutes.customer_orders.repository;

import com.tejatechtutes.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kiruthiga P M
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
