# Sistema de Gestão de Pedidos Online - Padrão State

Aluno: William Felipe Coscodai
RGM: 30051291

## 📋 Descrição

Este projeto implementa um sistema de gestão de pedidos para uma loja virtual utilizando o **padrão de projeto State (Estado)**. O sistema gerencia o ciclo de vida completo de um pedido, desde sua criação até a entrega ou cancelamento.

## 🎯 Objetivo

Demonstrar a aplicação do padrão State para gerenciar os diferentes estados de um pedido e suas transições, encapsulando os comportamentos específicos de cada estado.

## 🔄 Estados do Pedido

O sistema implementa 5 estados possíveis para um pedido:

1. **Novo** - Pedido criado, mas ainda não pago
2. **Pago** - Pagamento confirmado, aguardando envio
3. **Enviado** - Pedido despachado para o cliente
4. **Entregue** - Pedido recebido pelo cliente
5. **Cancelado** - Pedido cancelado

## 🎬 Ações Disponíveis

Cada pedido pode realizar as seguintes ações:

- `pagar()` - Registra o pagamento do pedido
- `enviar()` - Despacha o pedido
- `entregar()` - Confirma a entrega ao cliente
- `cancelar()` - Cancela o pedido

## 📐 Estrutura do Projeto

```
state/
├── OrderState.java       # Interface que define o contrato dos estados
├── NovoState.java        # Estado: Pedido Novo
├── PagoState.java        # Estado: Pedido Pago
├── EnviadoState.java     # Estado: Pedido Enviado
├── EntregueState.java    # Estado: Pedido Entregue
├── CanceladoState.java   # Estado: Pedido Cancelado
├── Order.java            # Classe contexto (Pedido)
├── Main.java             # Demonstração do sistema
└── README.md             # Este arquivo
```

## 🏗️ Padrão State

### Participantes:

- **OrderState (Interface)**: Define a interface para encapsular o comportamento associado a cada estado
- **Estados Concretos**: Implementam comportamentos específicos para cada estado
- **Order (Contexto)**: Mantém uma instância do estado atual e delega as operações para ele


## ✅ Vantagens do Padrão State

- **Encapsulamento**: Cada estado encapsula seu próprio comportamento
- **Facilidade de Manutenção**: Adicionar novos estados é simples
- **Eliminação de Condicionais**: Não há if/else ou switch para verificar estados
- **Princípio Open/Closed**: Aberto para extensão, fechado para modificação
- **Single Responsibility**: Cada classe de estado tem uma única responsabilidade

