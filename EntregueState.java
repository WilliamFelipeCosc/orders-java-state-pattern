/**
 * Estado: Pedido Entregue (recebido pelo cliente)
 */
public class EntregueState implements OrderState {
    
    @Override
    public void pagar(Order order) {
        System.out.println("Erro: O pedido já foi pago e entregue.");
    }
    
    @Override
    public void enviar(Order order) {
        System.out.println("Erro: O pedido já foi enviado e entregue.");
    }
    
    @Override
    public void entregar(Order order) {
        System.out.println("Erro: O pedido já foi entregue.");
    }
    
    @Override
    public void cancelar(Order order) {
        System.out.println("Erro: Não é possível cancelar um pedido já entregue.");
    }
    
    @Override
    public String getNomeEstado() {
        return "ENTREGUE";
    }
}
