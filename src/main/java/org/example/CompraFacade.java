package org.example;

public class CompraFacade {
    public static boolean verificarComprasPendentes(Compra compra) {
        if (Produto.getInstancia().verificaCompra(compra)) {
            return false;
        }
        if (Pagamento.getInstancia().verificaCompra(compra)) {
            return false;
        }
        if (Fatura.getInstancia().verificaCompra(compra)) {
            return false;
        }
        return true;
    }
}
