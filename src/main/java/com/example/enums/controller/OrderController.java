package com.example.enums.controller;


import com.example.enums.models.Pedido;
import com.example.enums.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Order;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    //Para fazer a injeção de dependência e instanciar o objeto
    private OrderRepository orderRepository;

    @GetMapping
    public ResponseEntity<List<Pedido>>findAll(){
        //Para retornar a lista de pedidos
        List<Pedido> list = orderRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
}
