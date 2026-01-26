# Comparação de Objetos em Java (`equals` vs `==`)

## Descrição
Este projeto demonstra a diferença entre comparação de referências (`==`)
e comparação de conteúdo (`equals`) em Java, utilizando tanto objetos da
classe `String` quanto uma classe personalizada (`Usuario`).

O objetivo é compreender como o Java trata igualdade entre objetos e como
sobrescrever corretamente os métodos `equals()` e `toString()`.

---

## Estrutura do Projeto

- `Usuario`
  - Representa um usuário com `id`, `nome` e `cpf`
  - Sobrescreve os métodos `equals()` e `toString()`

- `Teste`
  - Executa comparações usando `==` e `equals`
  - Demonstra comportamento com `String` e objetos personalizados

---

## Conceitos Abordados

- Diferença entre `==` e `equals()`
- Comparação por referência vs comparação por conteúdo
- Sobrescrita do método `equals()`
- Uso de `instanceof` e type cast
- Sobrescrita do método `toString()`
- Boas práticas em Programação Orientada a Objetos