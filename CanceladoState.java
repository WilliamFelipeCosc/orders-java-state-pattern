/**
 * Estado: Pedido Cancelado
 */
public class CanceladoState implements OrderState {
    
    @Override
    public void pagar(Order order) {
        System.out.println("Erro: Não é possível pagar um pedido cancelado.");
    }
    
    @Override
    public void enviar(Order order) {
        System.out.println("Erro: Não é possível enviar um pedido cancelado.");
    }
    
    @Override
    public void entregar(Order order) {
        System.out.println("Erro: Não é possível entregar um pedido cancelado.");
    }
    
    @Override
    public void cancelar(Order order) {
        System.out.println("Erro: O pedido já está cancelado.");
    }
    
    @Override
    public String getNomeEstado() {
        return "CANCELADO";
    }
}
