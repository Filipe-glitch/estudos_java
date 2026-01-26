# Exercício – Computador (Abstração e Polimorfismo)

Este projeto é um exercício em Java que demonstra o uso de **classes abstratas**, 
**herança** e **polimorfismo** para cálculo de valores de diferentes tipos de computadores.

## Objetivo

Simular o cálculo de preço de computadores diferentes (Desktop e Notebook),
utilizando uma classe abstrata como base.

## Estrutura do Projeto

- **Computador (classe abstrata)**
  - Atributos comuns: memória RAM e número de processadores
  - Método abstrato: `calculaValor()`

- **Desktop**
  - Herda de `Computador`
  - Possui custo adicional de acessórios

- **Notebook**
  - Herda de `Computador`
  - Possui custo baseado no tamanho da tela

- **Principal**
  - Demonstra o uso de polimorfismo
  - Armazena objetos em uma lista
  - Calcula o valor individual e total dos computadores
  
## Conceitos Aplicados

- Classe abstrata
- Herança
- Polimorfismo
- Coleções (`ArrayList`)
- Sobrescrita de métodos (`@Override`)

## Exemplo de Execução

O programa calcula o valor individual de cada computador e, ao final,
mostra o valor total de todos os computadores cadastrados.