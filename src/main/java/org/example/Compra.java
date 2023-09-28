package org.example;

public class Compra {
    public boolean comprar() {
        return CompraFacade.verificarComprasPendentes(this);
    }
}
