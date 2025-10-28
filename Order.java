public class Order {
    private String id;
    private OrderState state;
    
    /**
     * Construtor que inicializa um pedido no estado "Novo"
     * @param id Identificador único do pedido
     */
    public Order(String id) {
        this.id = id;
        this.state = new NovoState();
        System.out.println("Pedido #" + id + " criado no estado: " + state.getNomeEstado());
    }
    
    /**
     * Define o estado atual do pedido
     * @param state Novo estado
     */
    public void setState(OrderState state) {
        this.state = state;
    }
    
    /**
     * Retorna o estado atual do pedido
     * @return Estado atual
     */
    public OrderState getState() {
        return state;
    }
    
    /**
     * Retorna o ID do pedido
     * @return ID do pedido
     */
    public String getId() {
        return id;
    }
    
    /**
     * Registra o pagamento do pedido
     */
    public void pagar() {
        System.out.println("\n[Pedido #" + id + "] Tentando PAGAR...");
        state.pagar(this);
        exibirEstadoAtual();
    }
    
    /**
     * Despacha o pedido para o cliente
     */
    public void enviar() {
        System.out.println("\n[Pedido #" + id + "] Tentando ENVIAR...");
        state.enviar(this);
        exibirEstadoAtual();
    }
    
    /**
     * Confirma a entrega ao cliente
     */
    public void entregar() {
        System.out.println("\n[Pedido #" + id + "] Tentando ENTREGAR...");
        state.entregar(this);
        exibirEstadoAtual();
    }
    
    /**
     * Cancela o pedido
     */
    public void cancelar() {
        System.out.println("\n[Pedido #" + id + "] Tentando CANCELAR...");
        state.cancelar(this);
        exibirEstadoAtual();
    }
    
    /**
     * Exibe o estado atual do pedido
     */
    private void exibirEstadoAtual() {
        System.out.println("Estado atual: " + state.getNomeEstado());
    }
    
    /**
     * Retorna uma representação em string do pedido
     */
    @Override
    public String toString() {
        return "Pedido #" + id + " - Estado: " + state.getNomeEstado();
    }
}
