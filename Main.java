/**
 * Classe Main - Demonstração do padrão State
 * Sistema de gestão de pedidos online
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTÃO DE PEDIDOS ONLINE");
        System.out.println("   Demonstração do Padrão State");
        System.out.println("=================================================\n");
        
        // Cenário 1: Fluxo completo de sucesso
        System.out.println("--- CENÁRIO 1: Fluxo Normal (Sucesso) ---");
        Order pedido1 = new Order("001");
        pedido1.pagar();
        pedido1.enviar();
        pedido1.entregar();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Cenário 2: Tentando enviar sem pagar
        System.out.println("--- CENÁRIO 2: Tentativa de Envio sem Pagamento ---");
        Order pedido2 = new Order("002");
        pedido2.enviar();  // Deve dar erro
        pedido2.entregar(); // Deve dar erro
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Cenário 3: Cancelamento antes do pagamento
        System.out.println("--- CENÁRIO 3: Cancelamento Antes do Pagamento ---");
        Order pedido3 = new Order("003");
        pedido3.cancelar();
        pedido3.pagar();  // Deve dar erro
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Cenário 4: Cancelamento após pagamento
        System.out.println("--- CENÁRIO 4: Cancelamento Após Pagamento ---");
        Order pedido4 = new Order("004");
        pedido4.pagar();
        pedido4.cancelar();
        pedido4.enviar();  // Deve dar erro
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Cenário 5: Tentando cancelar após envio
        System.out.println("--- CENÁRIO 5: Tentativa de Cancelamento Após Envio ---");
        Order pedido5 = new Order("005");
        pedido5.pagar();
        pedido5.enviar();
        pedido5.cancelar();  // Deve dar erro
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Cenário 6: Tentando ações em pedido já entregue
        System.out.println("--- CENÁRIO 6: Ações em Pedido Já Entregue ---");
        Order pedido6 = new Order("006");
        pedido6.pagar();
        pedido6.enviar();
        pedido6.entregar();
        pedido6.entregar();  // Deve dar erro
        pedido6.cancelar();  // Deve dar erro
        
    }
}
