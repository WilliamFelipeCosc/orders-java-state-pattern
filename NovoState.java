public class NovoState implements OrderState {
    
    @Override
    public void pagar(Order order) {
        System.out.println("Pagamento confirmado! Pedido aguardando envio.");
        order.setState(new PagoState());
    }
    
    @Override
    public void enviar(Order order) {
        System.out.println("Erro: Não é possível enviar um pedido que não foi pago.");
    }
    
    @Override
    public void entregar(Order order) {
        System.out.println("Erro: Não é possível entregar um pedido que não foi pago.");
    }
    
    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado com sucesso.");
        order.setState(new CanceladoState());
    }
    
    @Override
    public String getNomeEstado() {
        return "NOVO";
    }
}
