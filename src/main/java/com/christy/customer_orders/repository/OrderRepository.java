package com.christy.customer_orders.repository;

import com.christy.customer_orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kiruthiga P M
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
