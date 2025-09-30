## das-1-2025-2-a

# Princípios de Projeto de Código
São boas práticas que guiam a escrita de código mais limpo, compreensível e sustentável a longo prazo.


# O que é abstração?
Uma abstração é importante para combater a complexidade de sistemas de software. Uma abstração é uma representação de uma entidade, ela é simples mas nos permite interagir e tirar proveito da entidade abstraída, sem que tenhamos que dominar todos os detalhes envolvidos na sua implementação.

# Ocultamento de Informação
O ocultamento de informação consiste em expor apenas o necessário para o uso de uma classe ou módulo e esconder detalhes internos de implementação. Isso reduz dependências externas e aumenta a flexibilidade para futuras mudanças sem quebrar o código cliente.


# O que é coesão?
É esperado que uma classe seja escrita com uma única funcionalidade ou serviço, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço. Assim facilitando o entendimento, a manutenção e o teste.


# Acoplamento
Acoplamento é o grau de dependência entre módulos de um sistema. Quanto maior o acoplamento, mais difícil será manter e evoluir o software, pois mudanças em um módulo afetam outros. O ideal é buscar baixo acoplamento, privilegiando interfaces e abstrações para manter os módulos independentes.


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
Subclasses devem poder ser usadas no lugar da superclasse sem alterar o funcionamento do sistema. Ou seja, heranças devem manter o comportamento esperado, sem quebrar regras da classe pai.

# I = Interface Segregation Principle
Esse princípio estabelece que uma classe não deve ser forçada a depender de interfaces que não utiliza por completo. As interfaces devem ser coesas e ter apenas o mínimo necessário para seus clientes, evitando dependências desnecessárias.

# D = Dependency Inversion Principle
Esse principio estabelece que o cliente use dependências prioritariamente com abstrações e não com implementações concretas, pois abstrações são mais estáveis do que implementações concretas.


## Prefira Composição a Herança
No passado houve um incentivo ao uso de herança herança tende a introduzir problemas na manutenção e evolução das classes de um sistema. Então, se existirem duas soluções de projeto, uma baseada em herança e outra em composição, a solução por meio de composição, normalmente, é a melhor.

## Princípio de Demeter
É um principio que evita o uso de variáveis globais para usar variáveis locais nos métodos.


## Estilos de Arquitetura Usados
# Características da arquitetura
São os atributos que uma boa arquitetura deve possuir. Entre os principais:

- São atributos prioritários do sistema (ex.: segurança, desempenho, escalabilidade).
- Não dá para escolher todas: é preciso priorizar o que é mais relevante para o contexto do software.
- Segurança é uma característica que não pode ser deixada de lado.
- Cada característica escolhida impacta diretamente no sistema (ex.: se foco é segurança → não usar bibliotecas sem controle).


# Decisões da arquitetura
São as escolhas feitas para estruturar o sistema, que impactam diretamente no desenvolvimento e na manutenção. Exemplos:

- São as regras e escolhas estruturais que garantem organização e padronização.
- Exemplo: adotar uma arquitetura em camadas (apresentação, negócio, serviços, persistência, banco de dados).
- Definem como as camadas se comunicam e se podem ou não ser puladas.
- Normalmente as camadas devem ser respeitadas, mas algumas exceções podem ser abertas (com cuidado e planejamento).
- O professor destacou que misturar estilos arquiteturais é válido, desde que exista uma justificativa clara.


# Princípios do design (boas práticas)

- São boas práticas que devem ser seguidas sempre que possível.
- Servem para aumentar desempenho, flexibilidade e qualidade do sistema.
- Mensageria assíncrona entre serviços para melhorar desempenho e escalabilidade.
- Uso de event-driven architecture (arquitetura orientada a eventos) como tendência moderna (ex.: AWS Lambda, Alexa, Instagram, Kindle).
- Esses princípios são como regras de conduta para o código, que tornam a arquitetura sustentável a longo prazo.

💡 Características da arquitetura = requisitos não funcionais

É impossível um sistema atender todas as características da arquitetura
A decisão arquitetural...
Os principios da arquitetura

01/09
## Habilidades de um Arquiteto de Software
- Tomar Descisões de Arquitetura
É uma pessoa com mais experiência com o papel de fazer escolhas e orientar a equipe.

- Analisar Continuamente a Arquitetura
Analisar constantemente a arquitetura significa monitorar e avaliar regularmente o sistema para garantir que ele atenda aos requisitos, seja eficiente, escalável e adaptável a mudanças futuras.

- Manter-se Atualizado com as últimas tendências
Manter-se atualizado com as últimas tendências envolve acompanhar novas tecnologias, práticas e ferramentas para aplicar soluções modernas e eficazes na arquitetura de software.

- Assegurar a conformidade com as decisões
O arquiteto verifica se a equipe de desenvolvimento está seguindo os padrões de arquitetura, documentação, etc...

- Ter habilidades Interpessoais
É saber se comunicar, colaborar e resolver conflitos eficazmente com equipes e stakeholders para garantir o alinhamento e o sucesso do projeto.

- Entender e lidar bem com questões políticas
Isso significa reconhecer interesses, influências e dinâmicas de poder dentro da organização para negociar, mediar conflitos e tomar decisões estratégicas que beneficiem o projeto.

- Domínio do Negócio
Um arquiteto precisa compreender profundamente o domínio do negócio no qual o sistema será aplicado. Esse conhecimento garante que as decisões técnicas estejam alinhadas às necessidades reais da organização, evitando soluções tecnicamente corretas, mas inúteis para o contexto.

- DevOps
Um arquiteto moderno deve também dominar práticas de DevOps, integrando desenvolvimento e operações. Isso envolve automação de deploys, integração contínua, entrega contínua (CI/CD), monitoramento e observabilidade. O objetivo é garantir entregas rápidas, seguras e sustentáveis, além de reduzir a distância entre quem desenvolve e quem mantém o sistema em produção.


## Resuma a diferençca entre: Arquitetura e Design
Arquitetura é pensar no sistema como um todo: definir padrões, componentes e requisitos. Design é detalhar como essas partes vão funcionar no dia a dia, como interfaces e código. Antes, arquitetura e design ficavam separados, mas isso causa problemas. Hoje, arquitetos e desenvolvedores precisam trabalhar juntos o tempo todo para a coisa funcionar bem.

## Como é a formação do conhecimento de um arquiteto modelo T?
O arquiteto precisa saber um pouco de muita coisa (amplitude) e ser especialista em algumas áreas (profundidade). É como a letra T: a barra de cima é o conhecimento amplo, e a barra vertical é a especialização. Assim ele consegue tomar boas decisões e ajudar a equipe.


## O que é o padrão de Trade-offs?

Na arquitetura de software, Trade-offs são escolhas entre diferentes qualidades (atributos) do sistema, como desempenho, segurança, manutenibilidade, escalabilidade, etc.
Geralmente, otimizar uma qualidade impacta negativamente outra, exigindo decisões conscientes.

# Padrão de mensageria baseado em tópicos?

É um padrão de comunicação assíncrono e desacoplado, onde:

- Publishers (publicadores) enviam mensagens/eventos.
- Subscribers (assinantes) recebem essas mensagens/eventos.

Ambos não conhecem diretamente uns aos outros. A comunicação acontece por meio de um broker (intermediário), como Kafka, RabbitMQ, Redis Pub/Sub etc.

# 🔔 Exemplo: Notificações do WhatsApp

Quando alguém te envia uma mensagem:

- O servidor do WhatsApp (publisher) publica o evento "nova mensagem".
- O seu app (subscriber) está inscrito para receber esse tipo de notificação.
- O sistema envia a notificação para o seu dispositivo.

Você não precisa que o app e o servidor estejam conectados diretamente, a entrega da mensagem é gerenciada pelo sistema de mensagens do WhatsApp, de forma assíncrona.

## Padrão de mensageria baseado em filas

É um padrão de comunicação assíncrono e desacoplado, onde:

- Um sender (emissor) envia mensagens para uma fila que atua como buffer.
- Um ou mais receivers (consumidores) recuperam mensagens da fila, normalmente fazendo polling — verificando periodicamente se há mensagens para processar.
- O sender e os receivers não precisam estar conectados diretamente, e a fila garante a entrega das mensagens mesmo se algum receiver estiver temporariamente indisponível.

## Comparação

# Diferenças e Trade-offs entre Filas e Tópicos

Em sistemas distribuídos, a comunicação assíncrona pode ser feita por meio de filas ou tópicos, cada um com suas vantagens e desafios.

# Modelo baseado em filas

Nesse modelo, um emissor envia mensagens para uma fila, onde múltiplos consumidores podem retirar e processar as mensagens. Esse método permite dividir a carga entre vários consumidores, garantindo controle sobre quem recebe cada mensagem. Porém, a implementação é mais complexa e custosa, exigindo gerenciamento de filas, balanceamento e controle de processamento.

# Modelo baseado em tópicos

No modelo de tópicos, o emissor publica mensagens em um canal comum, e todos os consumidores inscritos recebem essas mensagens ao mesmo tempo. É simples e flexível, facilitando a inclusão de novos consumidores sem modificar o emissor. A desvantagem é que todos recebem a mesma mensagem, o que pode gerar custo elevado se as mensagens forem grandes, além de exigir que todos aceitem o mesmo formato de dados.

# Resumo

Filas oferecem maior controle e confiabilidade, mas são mais complexas. Tópicos são mais simples e escaláveis, mas com menos controle e potencial custo maior para mensagens grandes. A escolha depende das necessidades específicas da aplicação, equilibrando controle, custo e flexibilidade.


## Padrão Fan-out em Mensageria

O padrão fan-out combina os modelos de tópicos e filas para garantir que uma mensagem publicada por um único sender seja processada por múltiplos consumidores de forma eficiente e controlada.

# Como funciona:

- O sender publica uma mensagem em um único tópico.
- Essa mensagem é então replicada para várias filas, no exemplo, 3 filas diferentes.
- Cada uma dessas filas está ligada a um consumidor específico (3 consumidores no total).
- Os consumidores processam as mensagens de suas filas de forma independente e isolada.

# Vantagens do fan-out:

- Desacoplamento: O sender publica uma única mensagem sem precisar conhecer os consumidores.
- Isolamento: Cada consumidor tem sua própria fila, permitindo contratos e processos específicos.
- Escalabilidade: O sistema pode escalar cada consumidor de forma independente, além de facilitar o balanceamento de carga.
- Resiliência: Se um consumidor ficar offline, sua fila acumula as mensagens, evitando perda de dados.


# 2º Bimestre
## Circuit Breaker Pattern
https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638

Protege sistemas contra falhas em serviços externos, interrompendo chamadas problemáticas para evitar sobrecarga.

Estados:
- Fechado: Comunicação normal, monitorando falhas.
- Aberto: Comunicação bloqueada por falhas recentes.
- Meio Aberto: Testa se o serviço voltou; se sim, fecha o circuito, se não, abre novamente.

