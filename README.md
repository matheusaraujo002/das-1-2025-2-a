## das-1-2025-2-a

# O que é abstração?
Uma abstração é importante para combater a complexidade de sistemas de software. Uma abstração é uma representação de uma entidade, ela é simples mas nos permite interagir e tirar proveito da entidade abstraída, sem que tenhamos que dominar todos os detalhes envolvidos na sua implementação.


# O que é coesão?
É esperado que uma classe seja escrita com uma única funcionalidade ou serviço, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço. Assim facilitando o entendimento, a manutenção e o teste.

# Tipos de relacionamentos
- ⇾ Herança
- ⇢ Implementação
- ➞ Associação


# SOLID
- S - Single Responsibility Principle (Princípio da Responsabilidade Única)
- O - Open/Closed Principle
- L - Liskov Substitution Principle
- I - Interface Segregation Principle
- D - Dependency Inversion Principle

# S = Single Responsibility Principle
Esse princípio recomenda separar apresentação de regras de negócio. Portanto, um sistema deve possuir classes de apresentação, que vão tratar de aspectos de sua interface com os usuários, formato das mensagens, meio no qual as mensagens serão exibidas, etc. E classes responsáveis por regras de negócio, isto é, que vão realizar as computações, processamento, análises, etc. Um exemplo é o uso da arquitetura MVC:
- M = Model (Responsável por representar representar os dados e a lógica de negócio da aplicação)
- V = View (Interface com a qual o usuário interage)
- C = Controller (Intermediário entre o Model e o View, responsável por coordenar as ações da aplicação)

# O = Open/Closed Principle
Aberto/Fechado tem como objetivo a construção de classes flexíveis e extensíveis, capazes de se adaptarem a diversos cenários de uso, sem modificações no seu código fonte.

# L = Liskov Substitution Principle
?

# I = Interface Segregation Principle
Esse princípio estabelece que uma classe não deve ser forçada a depender de interfaces que não utiliza por completo. As interfaces devem ser coesas e ter apenas o mínimo necessário para seus clientes, evitando dependências desnecessárias.

# D = Dependency Inversion Principle
Esse principio estabelece que o cliente use dependências prioritariamente com abstrações e não com implementações concretas, pois abstrações são mais estáveis do que implementações concretas.


## Prefira Composição a Herança
No passado houve um incentivo ao uso de herança herança tende a introduzir problemas na manutenção e evolução das classes de um sistema. Então, se existirem duas soluções de projeto, uma baseada em herança e outra em composição, a solução por meio de composição, normalmente, é a melhor.

## Princípio de Demeter
É um principio que evita o uso de variáveis globais para usar variáveis locais nos métodos.

