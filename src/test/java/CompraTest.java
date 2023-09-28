import org.example.Compra;
import org.example.Fatura;
import org.example.Pagamento;
import org.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {
    @Test
    void deveRetornarCompraPendenteProduto() {
        Compra compra = new Compra();
        Produto.getInstancia().addCompraCliente(compra);

        assertEquals(false, compra.comprar());
    }

    @Test
    void deveRetornarCompraPendentePagamento() {
        Compra compra = new Compra();
        Pagamento.getInstancia().addCompraCliente(compra);

        assertEquals(false, compra.comprar());
    }

    @Test
    void deveRetornarCompraPendenteFatura() {
        Compra compra = new Compra();
        Fatura.getInstancia().addCompraCliente(compra);

        assertEquals(false, compra.comprar());
    }

    @Test
    void deveRetornarComprasSemPendencias() {
        Compra compra = new Compra();

        assertEquals(true, compra.comprar());
    }
}
