package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {
    private List<Compra> comprasNaoFinalizadas = new ArrayList<Compra>();

    public void addCompraCliente(Compra compra) {
        this.comprasNaoFinalizadas.add(compra);
    }

    public boolean verificaCompra(Compra compra) {
        return this.comprasNaoFinalizadas.contains(compra);
    }
}
