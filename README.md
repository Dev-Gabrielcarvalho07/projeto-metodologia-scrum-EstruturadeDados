# Projeto Integrador: Sistema de Gerenciamento de Produtos

## 📝 Descrição do Projeto
Desenvolvimento de um sistema de console em **Java** para o gerenciamento de produtos, focado na aplicação prática de estruturas de dados e algoritmos de busca e ordenação. O projeto utiliza uma abordagem de **Desenvolvimento Modular** integrada via metodologia **Scrum**.

## 🛠️ Tecnologias e Conceitos
* **Linguagem:** Java (Aplicação de Console).
* **Metodologia:** Scrum (Sprints de Planejamento à Apresentação).
* **Algoritmos de Busca:** Sequencial e Binária.
* **Algoritmos de Ordenação:** Bubble Sort e Selection Sort.
* **Estrutura de Dados:** Tabela Hash e Listas (Arrays/Vetores).

## 📂 Padrão de Organização (OBRIGATÓRIO)
Para garantir a integração final entre as equipes, o projeto segue rigorosamente a estrutura de pacotes abaixo:

* `model`: Estrutura de dados (Ex: Classe `Produto`).
* `service`: Regras de negócio, algoritmos de busca, ordenação e tabela hash.
* `util`: Funções auxiliares, leitura de dados e métodos de apoio.

## 👥 Divisão das Equipes (Módulos)
O sistema foi dividido em módulos funcionais, cada um com papéis definidos de PO, Scrum Master e Devs:

| Equipe | Responsabilidade | Integrantes Responsáveis |
| :--- | :--- | :--- |
| **Equipe 1** | Modelo e Repositório (Core) | Pedro Feitosa, Maria Eduarda, Yan Santos, Vitor Pereira, Italo |
| **Equipe 2** | Busca Sequencial | Caique Alves, João Pedro, Gabriel Oliveira, Daniel Antonio, Samuel da Silva |
| **Equipe 3** | Busca Binária | Davi Martins, Caio Vinicius, Renato Borges, Fernando Papacosta |
| **Equipe 4** | Bubble Sort | Jordana Pinheiro, Ian Borges, Gabriel Ribeiro, Joel Felipe, Luis Eduardo |
| **Equipe 5** | Selection Sort | **Caio Abreu, Cassiano Abreu**, Gabriel Naoki, Willian Mariano, Gustavo Doutor |
| **Equipe 6** | Tabela Hash | Lucio Aguiar, Guilherme Silva, Jurandir Marques, Ramon Silva |

## ⚙️ Regras de Armazenamento e Cadastro
* **Duplo Armazenamento:** Todo produto cadastrado deve ser inserido simultaneamente na **Lista** (para ordenação) e na **Tabela Hash** (para busca rápida por ID).
* **Tabela Hash:** Implementação de função hash simples (`index = id % tamanho`) com tratamento de colisões.
* **Busca Binária:** O sistema deve garantir que a lista esteja ordenada para o funcionamento deste algoritmo.

## 🚀 Fluxo de Trabalho (Sprints)
1. **Sprint 1 - Planejamento:** Divisão de tarefas e criação do esqueleto do código (`br.com.projeto`).
2. **Sprint 2 - Desenvolvimento:** Implementação isolada de cada módulo.
3. **Sprint 3 - Integração:** União dos códigos e resolução de conflitos.
4. **Sprint 4 - Testes:** Validação completa (Cadastro, Busca, Ordenação e Hash).
5. **Sprint 5 - Apresentação:** Defesa das soluções adotadas e demonstração do sistema final.

## ⚠️ Regras Importantes
* **Não alterar as assinaturas dos métodos** definidas no plano de projeto.
* **Seguir o padrão de pacotes** obrigatoriamente para não comprometer a integração.
* O projeto final deve estar **totalmente integrado e funcional** para a entrega.

---
*Este repositório documenta o trabalho da GYNConstrutora / Projeto Integrador acadêmico.*
