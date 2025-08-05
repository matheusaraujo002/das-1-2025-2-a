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

# Single Responsibility Principle
Esse princípio recomenda separar apresentação de regras de negócio. Portanto, um sistema deve possuir classes de apresentação, que vão tratar de aspectos de sua interface com os usuários, formato das mensagens, meio no qual as mensagens serão exibidas, etc. E classes responsáveis por regras de negócio, isto é, que vão realizar as computações, processamento, análises, etc. Um exemplo é o uso da arquitetura MVC:
- M = Model (Responsável por representar representar os dados e a lógica de negócio da aplicação)
- V = View (Interface com a qual o usuário interage)
- C = Controller (Intermediário entre o Model e o View, responsável por coordenar as ações da aplicação)

# Interface Segregation Principle
Esse princípio estabelece que uma classe não deve ser forçada a depender de interfaces que não utiliza por completo. As interfaces devem ser coesas e ter apenas o mínimo necessário para seus clientes, evitando dependências desnecessárias.
