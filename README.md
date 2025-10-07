# 📆 1º Bimestre

---

## 📘 Princípios de Projeto de Código
> São boas práticas que guiam a escrita de código mais **limpo, compreensível e sustentável** a longo prazo.

---

## ✨ O que é Abstração?
A abstração é importante para **combater a complexidade** de sistemas de software.  
Ela é uma **representação simplificada de uma entidade**, permitindo interação sem precisar conhecer todos os detalhes internos da implementação.

---

## 🔒 Ocultamento de Informação
Expor **apenas o necessário** e esconder os detalhes internos de implementação:
- Reduz dependências externas  
- Aumenta a flexibilidade  
- Facilita futuras mudanças sem quebrar o código cliente  

---

## 🧩 O que é Coesão?
Uma classe deve ter **apenas uma responsabilidade**.  
Isso facilita:
- Entendimento  
- Manutenção  
- Testes  

---

## 🔗 Acoplamento
O **acoplamento** é o grau de dependência entre módulos:  
- Alto acoplamento → mudanças impactam várias partes do sistema  
- Baixo acoplamento → módulos mais independentes e flexíveis  

✅ Busque baixo acoplamento com **interfaces e abstrações**.

---

## 📚 Tipos de Relacionamentos em Orientação a Objetos

Os relacionamentos indicam **como as classes se conectam ou dependem umas das outras** dentro de um sistema.  
Eles ajudam a entender **quem usa quem** e **como as responsabilidades estão distribuídas**.


### 🧬 **Herança** ( ─────────▷ Seta vazada com linha contínua)
A herança representa um relacionamento do tipo **“é um”**.  
Uma classe filha herda **atributos e métodos** de uma classe pai, podendo reutilizar e até especializar o comportamento.

📘 Exemplo:  
`Cachorro` herda de `Animal` → significa que **um cachorro é um tipo de animal**.  
Assim, `Cachorro` tem tudo o que `Animal` tem, além de suas próprias características.

💡 Usada para **reaproveitar código** e **definir hierarquias** entre classes.


### ⚙️ **Implementação** ( - - - -▷ Seta vazada com linha pontilhada)
A implementação ocorre quando uma **classe concreta adota o contrato de uma interface**.  
Ou seja, a classe se compromete a **implementar todos os métodos** definidos pela interface.

📘 Exemplo:  
A classe `Cachorro` implementa a interface `SomAnimal`, garantindo que ela tenha o método `emitirSom()` definido pela interface.

💡 Usada para garantir **padronização de comportamento** entre diferentes classes.


### 🔗 **Associação** ( ─────────▶ Seta preenchida com linha contínua)
A associação representa um relacionamento do tipo **“usa”** ou **“possui”**.  
Indica que uma classe **depende de outra** para executar alguma ação, mas sem criar uma hierarquia entre elas.

📘 Exemplo:  
`Pessoa` usa um `Carro` → significa que **a pessoa possui ou utiliza um carro**, mas eles são entidades separadas.

💡 Usada para representar **colaboração** entre objetos.

---

## 🧠 O que são Design Patterns?

Os **Design Patterns** (Padrões de Projeto) são **soluções típicas para problemas recorrentes** no design de software.  
Pense neles como **modelos ou “blueprints”** que podem ser adaptados para resolver desafios comuns na estrutura do código.

💡 Eles **não são pedaços prontos de código**, mas **conceitos reutilizáveis** que orientam a forma de resolver um problema específico de maneira eficiente e padronizada.

🔗 [Refactoring Guru](https://refactoring.guru/design-patterns/catalog)

---

## 🏛️ SOLID

- **S** - Single Responsibility Principle  
- **O** - Open/Closed Principle  
- **L** - Liskov Substitution Principle  
- **I** - Interface Segregation Principle  
- **D** - Dependency Inversion Principle  


### 🟦 S = Single Responsibility Principle
Separar **apresentação** de **regras de negócio**.  

➡️ Exemplo: Arquitetura MVC  
- **M** = Model → dados e lógica de negócio  
- **V** = View → interface com o usuário  
- **C** = Controller → intermediário entre Model e View  


### 🟩 O = Open/Closed Principle
Classes devem ser:  
- **Abertas para extensão**  
- **Fechadas para modificação**  


### 🟨 L = Liskov Substitution Principle
Subclasses devem poder substituir suas superclasses **sem quebrar o sistema**.  


### 🟧 I = Interface Segregation Principle
Uma classe **não deve depender** de interfaces que não utiliza.  
Interfaces devem ser **pequenas e coesas**.  


### 🟥 D = Dependency Inversion Principle
Depender de **abstrações**, não de implementações concretas.  
🔑 Abstrações são mais estáveis que implementações.  

---

## 🔄 Prefira Composição a Herança
Herança pode dificultar manutenção e evolução.  
✔️ Sempre que possível, prefira **composição**.  

---

## 📏 Princípio de Demeter
Evite variáveis globais.  
Prefira **variáveis locais** nos métodos.  

---

## ⚙️ Estilos de Arquitetura Usados

### 🌟 Características da Arquitetura
- Definidas como **atributos de qualidade** (segurança, desempenho, escalabilidade).  
- Não é possível priorizar todos → escolha os mais relevantes.  
- **Segurança** nunca deve ser deixada de lado.  

💡 Características da arquitetura = **requisitos não funcionais**  


### 🗂️ Decisões de Arquitetura
- Escolhas estruturais que impactam diretamente o sistema.  
- Exemplo: Arquitetura em camadas (apresentação, negócio, persistência, etc.).  
- Normalmente as camadas devem ser respeitadas, mas exceções podem existir com **planejamento**.  


### 📐 Princípios do Design
- Boas práticas que aumentam desempenho, flexibilidade e qualidade.  
- **Mensageria assíncrona** entre serviços.  
- Uso de **event-driven architecture** (ex.: AWS Lambda, Alexa, Instagram).  


### 👨‍💻 Habilidades de um Arquiteto de Software
- 🧭 **Tomar decisões arquiteturais**  
- 🔍 **Analisar continuamente a arquitetura**  
- 📈 **Atualizar-se com tendências**  
- ✅ **Garantir conformidade** com decisões  
- 🤝 **Habilidades interpessoais**  
- ⚖️ **Lidar com questões políticas**  
- 💼 **Domínio do negócio**  
- 🔄 **DevOps (CI/CD, monitoramento, automação)**  


### 🔎 Arquitetura vs Design
- **Arquitetura** → visão macro, padrões e requisitos.  
- **Design** → detalhes de implementação e código.  

Hoje ambos devem ser trabalhados **em conjunto**.  


### 📊 Modelo T de Conhecimento
- Barra horizontal (—) → conhecimento amplo  
- Barra vertical (|) → especialização profunda  


### ⚖️ Trade-offs
São escolhas entre qualidades como:
- Desempenho  
- Segurança  
- Escalabilidade  
- Manutenibilidade  

🎯 Melhorar um aspecto pode **prejudicar outro**.  

---

## 📬 Padrões de Mensageria

### 📡 Baseado em Tópicos
- **Publisher** envia mensagens  
- **Subscribers** recebem  
- Comunicação via **broker** (Kafka, RabbitMQ, Redis Pub/Sub)  

📱 Exemplo: Notificações do WhatsApp  

---

### 📦 Baseado em Filas
- **Sender** envia para uma fila  
- **Receivers** consomem da fila  
- Garante entrega mesmo se receiver estiver offline  

---

### ⚖️ Comparação
- **Filas** → maior controle, mais complexidade  
- **Tópicos** → mais simples, mas com menos controle  

---

### 🌐 Fan-out Pattern
Combina filas + tópicos:
- Mensagem publicada em **1 tópico**  
- Replicada em várias filas  
- Cada fila ligada a um consumidor específico  

Vantagens: **desacoplamento, escalabilidade, resiliência**.  

---

# 📆 2º Bimestre

---

## 🔌 Circuit Breaker Pattern
Protege sistemas contra falhas em serviços externos:  
- **Fechado** → comunicação normal  
- **Aberto** → bloqueia após falhas  
- **Meio Aberto** → testa se o serviço voltou  

🔗 [Documentação Microsoft](https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638)  

---

## 🏗️ Características Estruturais da Arquitetura

São aspectos que influenciam diretamente a estrutura do código e o design interno do sistema. O arquiteto deve garantir qualidade na organização do software, promovendo modularidade, baixo acoplamento e legibilidade do código.

Exemplos importantes incluem:

- **Configuração:** facilidade para os usuários finais alterarem configurações do software.
- **Extensão:** capacidade de adicionar novas funcionalidades.
- **Instabilidade:** facilidade de instalação em diferentes plataformas.
- **Reutilização:** aproveitamento de componentes comuns em múltiplos produtos.
- **Localização:** suporte a múltiplos idiomas e formatos regionais.
- **Manutenção:** facilidade para aplicar alterações e melhorias.
- **Portabilidade:** capacidade de rodar em diferentes ambientes e plataformas.
- **Suporte:** nível de suporte técnico e facilidades para depuração.
- **Atualização:** facilidade de atualizar o sistema sem interrupções.

Essas características estruturais são essenciais para garantir que o software seja sustentável, adaptável e fácil de evoluir.

---

## ⚖️ Padrão CQRS (Command Query Responsibility Segregation)

O CQRS é um padrão que separa as operações de leitura e escrita usando bancos de dados diferentes para melhorar o desempenho, evitar travamentos e facilitar a escalabilidade.


### ⚙️ Como funciona na prática: 
Você tem um banco principal, onde só são feitas as gravações, ou comandos. Para as leituras, você usa bancos réplicas, que são cópias do banco principal, mas só aceitam consultas (leitura), não gravações.

### 🚀 Benefícios principais: 
- 🔒 Sem travamentos: Como as leituras e gravações acontecem em bancos separados, não tem aquele conflito clássico de “alguém quer ler enquanto outro escreve”.
- ⚡ Mais desempenho: A aplicação fica mais rápida porque as consultas pesadas vão para as réplicas, liberando o banco principal para se concentrar nas escritas.
- 🛡️ Alta disponibilidade: Se o banco principal falhar, as réplicas podem garantir que o sistema continue funcionando, pois estão em locais diferentes e atualizam os dados automaticamente.

### 📌 Detalhes importantes:

> A sincronização entre o banco principal e as réplicas é assíncrona, ou seja, as réplicas ficam com um pequeno atraso (milissegundos), mas na maioria dos casos isso não atrapalha o sistema.
> Essa arquitetura é usada por sistemas grandes e críticos, como bancos, e-commerces e serviços que precisam suportar muitos usuários e manter alta performance.
> Essa separação ajuda a manter o sistema rápido, escalável, estável e mais fácil de gerenciar.

---
