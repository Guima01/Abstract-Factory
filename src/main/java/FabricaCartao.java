public class FabricaCartao implements FabricaAbstrata {
    public Recibo createRecibo(){
        return new ReciboCartao();
    }
    public FormaPagamento createFormaPagamento(){
        return new Cartao();
    }
}
