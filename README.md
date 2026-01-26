##Projeto desenvolvido para estudo de:

- Lógica de programação com Java
- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Exceções
- UML

## Estrutura do projeto
- src/: código-fonte
- docs/: documentação
- docs/uml/: diagramas UML

## O QUE DEVE TER EM UM README?
- Objetivo claro do projeto
- Contexto de uso (por que esse sistema existe?)
- Como executar
- Exemplo de entrada/saída
- Tecnologias utilizadas
- Escopo (o que faz e o que não faz)
- Público-alvo (estudo, portfólio, exercício)

## EXEMPLO DE UM README:

# Sistema de Avaliação de Alunos (Java)

## Visão Geral
Este projeto implementa um sistema simples de avaliação de alunos,
utilizando composição entre classes para representar alunos e suas
notas e calcular médias aritmética e ponderada.

O objetivo principal é demonstrar conceitos fundamentais de
Programação Orientada a Objetos em Java.

## Estrutura do Projeto
- `Aluno`: representa o aluno e seus dados acadêmicos.
- `Avaliacao`: encapsula as notas e a lógica de cálculo das médias.
- `Principal`: ponto de entrada da aplicação.

## Conceitos Aplicados
- Programação Orientada a Objetos (POO)
- Composição entre classes
- Encapsulamento
- Separação de responsabilidades
- Organização e legibilidade de código

## Como Executar
1. Abra o projeto em uma IDE Java (Eclipse, IntelliJ ou VS Code).
2. Execute a classe `Principal`.
3. Os dados dos alunos e as médias serão exibidos no console.

## 📄 Exemplo de Uso
```java
Aluno aluno = new Aluno("Mario", "Encanador", new Avaliacao(7, 9, 5));
aluno.info();