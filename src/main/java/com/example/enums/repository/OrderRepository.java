package com.example.enums.repository;

import com.example.enums.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Pedido, Long> {

}
