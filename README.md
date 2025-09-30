# 📘 Princípios de Projeto de Código
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

## 📚 Tipos de Relacionamentos
- ⇾ **Herança**  
- ⇢ **Implementação**  
- ➞ **Associação**  

---

# 🏛️ SOLID

- **S** - Single Responsibility Principle  
- **O** - Open/Closed Principle  
- **L** - Liskov Substitution Principle  
- **I** - Interface Segregation Principle  
- **D** - Dependency Inversion Principle  

---

### 🟦 S = Single Responsibility Principle
Separar **apresentação** de **regras de negócio**.  

➡️ Exemplo: Arquitetura MVC  
- **M** = Model → dados e lógica de negócio  
- **V** = View → interface com o usuário  
- **C** = Controller → intermediário entre Model e View  

---

### 🟩 O = Open/Closed Principle
Classes devem ser:  
- **Abertas para extensão**  
- **Fechadas para modificação**  

---

### 🟨 L = Liskov Substitution Principle
Subclasses devem poder substituir suas superclasses **sem quebrar o sistema**.  

---

### 🟧 I = Interface Segregation Principle
Uma classe **não deve depender** de interfaces que não utiliza.  
Interfaces devem ser **pequenas e coesas**.  

---

### 🟥 D = Dependency Inversion Principle
Depender de **abstrações**, não de implementações concretas.  
🔑 Abstrações são mais estáveis que implementações.  

---

## 🏗️ Prefira Composição a Herança
Herança pode dificultar manutenção e evolução.  
✔️ Sempre que possível, prefira **composição**.  

---

## 📏 Princípio de Demeter
Evite variáveis globais.  
Prefira **variáveis locais** nos métodos.  

---

# ⚙️ Estilos de Arquitetura Usados

## 🌟 Características da Arquitetura
- Definidas como **atributos de qualidade** (segurança, desempenho, escalabilidade).  
- Não é possível priorizar todos → escolha os mais relevantes.  
- **Segurança** nunca deve ser deixada de lado.  

💡 Características da arquitetura = **requisitos não funcionais**  

---

## 🗂️ Decisões de Arquitetura
- Escolhas estruturais que impactam diretamente o sistema.  
- Exemplo: Arquitetura em camadas (apresentação, negócio, persistência, etc.).  
- Normalmente as camadas devem ser respeitadas, mas exceções podem existir com **planejamento**.  

---

## 📐 Princípios do Design
- Boas práticas que aumentam desempenho, flexibilidade e qualidade.  
- **Mensageria assíncrona** entre serviços.  
- Uso de **event-driven architecture** (ex.: AWS Lambda, Alexa, Instagram).  

---

# 👨‍💻 Habilidades de um Arquiteto de Software
- 🧭 **Tomar decisões arquiteturais**  
- 🔍 **Analisar continuamente a arquitetura**  
- 📈 **Atualizar-se com tendências**  
- ✅ **Garantir conformidade** com decisões  
- 🤝 **Habilidades interpessoais**  
- ⚖️ **Lidar com questões políticas**  
- 💼 **Domínio do negócio**  
- 🔄 **DevOps (CI/CD, monitoramento, automação)**  

---

## 🔎 Arquitetura vs Design
- **Arquitetura** → visão macro, padrões e requisitos.  
- **Design** → detalhes de implementação e código.  

Hoje ambos devem ser trabalhados **em conjunto**.  

---

## 📊 Modelo T de Conhecimento
- Barra horizontal (—) → conhecimento amplo  
- Barra vertical (|) → especialização profunda  

---

## ⚖️ Trade-offs
São escolhas entre qualidades como:
- Desempenho  
- Segurança  
- Escalabilidade  
- Manutenibilidade  

🎯 Melhorar um aspecto pode **prejudicar outro**.  

---

# 📬 Padrões de Mensageria

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

# 🔌 Circuit Breaker Pattern
Protege sistemas contra falhas em serviços externos:  
- **Fechado** → comunicação normal  
- **Aberto** → bloqueia após falhas  
- **Meio Aberto** → testa se o serviço voltou  

🔗 [Documentação Microsoft](https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638)  

---
