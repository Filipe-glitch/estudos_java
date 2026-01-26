# Exceção Personalizada em Java

## Descrição
Este projeto demonstra a criação e o uso de uma exceção personalizada em Java,
simulando a busca de um usuário em um sistema.

Caso o usuário não seja encontrado, uma exceção específica é lançada e tratada
adequadamente.

## Estrutura do Projeto
- `Gerenciador`: classe responsável por buscar usuários.
- `Usuario`: representa um usuário do sistema (classe simples).
- `UsuarioInexistenteException`: exceção personalizada para usuário não encontrado.
- `Teste`: classe principal que executa o teste e trata a exceção.

## Funcionamento
- O método `buscar` tenta localizar um usuário pelo ID.
- Se o ID for válido, retorna um objeto `Usuario`.
- Caso contrário, lança uma `UsuarioInexistenteException`.
- A exceção é capturada no `main` utilizando `try/catch`.

## Conceitos Aplicados
- Exceções personalizadas
- Uso de `throws`
- Tratamento de erros com `try/catch`
- Separação de responsabilidades
- Boas práticas de tratamento de erro

## Observação
Este projeto tem fins educacionais e foi desenvolvido para praticar
tratamento de exceções em Java.