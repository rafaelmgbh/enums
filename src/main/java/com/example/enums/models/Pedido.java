package com.example.enums.models;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @Enumerated(EnumType.STRING) // para salvar o valor do enum no banco de dados como String e não como inteiro
    private PedidoStatus pedidoStatus;

    public Pedido() {
    }

    public Pedido(Long id, Instant moment, PedidoStatus pedidoStatus) {

        this.id = id;
        this.moment = moment;
        setPedidoStatus(pedidoStatus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public PedidoStatus getPedidoStatus() {

        return PedidoStatus.valueOf(String.valueOf(pedidoStatus));
    }

    public void setPedidoStatus(PedidoStatus pedidoStatus) {
        // Para garantir que o pedido não seja criado com um status nulo
        if(pedidoStatus != null){
            this.pedidoStatus = PedidoStatus.valueOf(pedidoStatus.getCode());
        }
    }
}

