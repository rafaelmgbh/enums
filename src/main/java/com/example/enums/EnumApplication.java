package com.example.enums;


import com.example.enums.models.Pedido;
import com.example.enums.models.PedidoStatus;
import com.example.enums.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.Instant;
import java.util.List;

@SpringBootApplication
public class EnumApplication  implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;



    public static void main(String[] args) {
        SpringApplication.run(EnumApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Pedido o1 = new Pedido(null,Instant.parse("2021-07-20T18:43:07Z"), PedidoStatus.ENVIADO);
        Pedido o2 = new Pedido(null,Instant.parse("2021-08-20T20:58:07Z"), PedidoStatus.ENTREGUE);
        Pedido o3 = new Pedido(null,Instant.parse("2021-07-20T19:53:07Z"), PedidoStatus.PROCESSANDO);
        Pedido o4 = new Pedido(null,Instant.parse("2021-08-20T21:17:09Z"), PedidoStatus.ENVIADO);
        Pedido o5 = new Pedido(null,Instant.parse("2021-07-20T15:20:07Z"), PedidoStatus.PROCESSANDO);

        orderRepository.saveAll(List.of(o1,o2,o3,o4,o5));

    }
}