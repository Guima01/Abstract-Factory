import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirReciboDinheiro(){
        FabricaAbstrata fabrica = new FabricaDinheiro();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo Dinheiro", cliente.emitirRecibo());
    }

    @Test
    void deveEmitirReciboCartao(){
        FabricaAbstrata fabrica = new FabricaCartao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Recibo Cartão", cliente.emitirRecibo());
    }

    @Test
    void deveinformarPagamentoDinheiro (){
        FabricaAbstrata fabrica = new FabricaDinheiro();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento em Dinheiro", cliente.FormaPagamento());
    }

    @Test
    void deveinformarPagamentoCartao (){
        FabricaAbstrata fabrica = new FabricaCartao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Pagamento no Cartão", cliente.FormaPagamento());
    }

}