public interface OrderState {
    
    /**
     * Registra o pagamento do pedido
     * @param order O pedido sendo processado
     */
    void pagar(Order order);
    
    /**
     * Despacha o pedido para o cliente
     * @param order O pedido sendo processado
     */
    void enviar(Order order);
    
    /**
     * Confirma a entrega ao cliente
     * @param order O pedido sendo processado
     */
    void entregar(Order order);
    
    /**
     * Cancela o pedido
     * @param order O pedido sendo processado
     */
    void cancelar(Order order);
    
    /**
     * Retorna o nome do estado atual
     * @return Nome do estado
     */
    String getNomeEstado();
}
