# Exercício 9 – Polimorfismo com Funcionários (Java)

Este projeto demonstra o uso de **polimorfismo** em Java por meio de
diferentes tipos de funcionários que possuem regras distintas de pagamento.

## Praticar os conceitos de:
- Herança
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Uso de classes base e subclasses

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Herança (`extends`)
- Polimorfismo em tempo de execução
- Uso de listas (`ArrayList`)
- Reutilização de código

## Diagrama UML
Disponível em: docs/uml/exernove.png

## 📘 Descrição das Classes
### 🔹 Funcionario
Classe base que representa um funcionário genérico.
- Nome do funcionário
- Método `pagamento()` sobrescrito pelas subclasses

### 🔹 Assalariado
Funcionário que recebe um salário fixo mensal.

### 🔹 Horista
Funcionário que recebe de acordo com:
- Horas trabalhadas
- Valor da hora

### 🔹 Comissionado
Funcionário que recebe com base em:
- Total de vendas
- Percentual de comissão