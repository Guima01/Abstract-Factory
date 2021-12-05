public class Cliente {

    private FormaPagamento formaPagamento;
    private Recibo recibo;

    public Cliente(FabricaAbstrata fabrica){
        this.formaPagamento = fabrica.createFormaPagamento();
        this.recibo = fabrica.createRecibo();
    }
    public String FormaPagamento(){
        return this.formaPagamento.pagamento();
    }
    public String emitirRecibo(){
        return this.recibo.emitir();
    }

}