# Exercício 4 – Avaliação de Notas e Faltas (Java)

Este projeto é um exercício em Java que simula a avaliação de um aluno
com base em **duas notas** e **quantidade de faltas**.

---

## 📌 Funcionalidades

- Registrar duas notas
- Registrar número de faltas
- Calcular média aritmética
- Determinar o resultado do aluno: Aprovado, Exame final, Reprovado por nota e Reprovado por faltas.

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Encapsulamento (`private`, `get`, `set`)
- Construtores
- Validação de dados
- Estruturas condicionais (`if / else`)
- Separação entre regra de negócio e execução

## Regras de Avaliação

- Notas válidas: entre 0 e 10
- Média:
  - Média < 4 → Reprovado
  - Média ≥ 4 e < 7 → Exame final
  - Média ≥ 7 → Aprovado
- Faltas:
  - Mais de 7 faltas → Reprovado por faltas