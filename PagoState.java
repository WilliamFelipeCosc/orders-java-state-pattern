public class PagoState implements OrderState {
    
    @Override
    public void pagar(Order order) {
        System.out.println("Erro: O pedido já foi pago.");
    }
    
    @Override
    public void enviar(Order order) {
        System.out.println("Pedido despachado com sucesso!");
        order.setState(new EnviadoState());
    }
    
    @Override
    public void entregar(Order order) {
        System.out.println("Erro: Não é possível entregar um pedido que ainda não foi enviado.");
    }
    
    @Override
    public void cancelar(Order order) {
        System.out.println("Pedido cancelado. O valor será estornado.");
        order.setState(new CanceladoState());
    }
    
    @Override
    public String getNomeEstado() {
        return "PAGO";
    }
}
