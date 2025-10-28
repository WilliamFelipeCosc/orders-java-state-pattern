public class EnviadoState implements OrderState {
    
    @Override
    public void pagar(Order order) {
        System.out.println("Erro: O pedido já foi pago.");
    }
    
    @Override
    public void enviar(Order order) {
        System.out.println("Erro: O pedido já foi enviado.");
    }
    
    @Override
    public void entregar(Order order) {
        System.out.println("Entrega confirmada! Pedido concluído com sucesso.");
        order.setState(new EntregueState());
    }
    
    @Override
    public void cancelar(Order order) {
        System.out.println("Erro: Não é possível cancelar um pedido que já foi enviado.");
    }
    
    @Override
    public String getNomeEstado() {
        return "ENVIADO";
    }
}
