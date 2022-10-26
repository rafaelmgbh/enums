package com.example.enums.models;

public enum PedidoStatus {
    PAGAMENTO_PENDENTE(1),
    PROCESSANDO(2),
    ENVIADO(3),
    ENTREGUE(4);

    private int code;

    private PedidoStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static PedidoStatus valueOf(int code){
        //percorre todos os valores possíveis do tipo enumerado
        for(PedidoStatus value : PedidoStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}
