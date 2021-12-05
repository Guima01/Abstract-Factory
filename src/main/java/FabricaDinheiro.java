public class FabricaDinheiro implements FabricaAbstrata {
    public Recibo createRecibo(){
        return new ReciboDinheiro();
    }

    public FormaPagamento createFormaPagamento(){
        return new Dinheiro();
    }

}