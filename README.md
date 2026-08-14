# ☕ Estudos em Java - POO & Consumo de APIs

Repositório dedicado aos meus estudos em **Java**, abrangendo desde lógica de programação e fundamentos da linguagem até Programação Orientada a Objetos (POO), consumo de APIs REST e manipulação de JSON.

## 🚀 Objetivo

Desenvolver e consolidar conhecimentos em Java por meio de exercícios práticos e pequenos projetos, evoluindo desde os fundamentos da linguagem até conceitos de POO e integração com APIs externas.

## 🛠️ Tecnologias e Ferramentas

- **Java (JDK 17+)**
- **Visual Studio Code**
- **Google Gson**
- **HTTP Client (`java.net.http`)**
- **APIs REST**
- **JSON**
- **Git / GitHub**

## 📁 Estrutura do Projeto

```text
estudos_java/
├── lib/                              # Dependências externas (.jar)
├── exerciciosfundamentos/            # Exercícios de lógica e fundamentos
├── fundamentos/                      # Conceitos básicos da linguagem
└── poo/                              # Programação Orientada a Objetos
    ├── classes_atributos_c1/         # Classes, objetos e atributos
    ├── metodos_construtores_c2/      # Métodos e construtores
    ├── encapsulamento_c3/            # Encapsulamento
    ├── heranca_c4/                   # Herança
    ├── polimorfismo_interfaces_c5/   # Polimorfismo e interfaces
    ├── composicao_c6/                # Composição
    ├── sealed_class_c7/              # Classes seladas
    ├── colecoes_c8/                  # Coleções
    ├── records_c9/                   # Records e DTOs
    ├── erros_excecoes_c10/           # Tratamento de exceções
    └── api_consumo_c11/              # APIs REST e JSON

```

🔹 Alguns Projetos Práticos

### 📍 ViaCEP

Aplicação para consulta de endereços utilizando a API ViaCEP.

- Consumo de API REST
- Requisições HTTP
- Desserialização de JSON
- Uso de Records
- Gravação dos dados em arquivo JSON

### 🎬 OMDb

Aplicação para busca de filmes utilizando a API OMDb.

- Busca interativa de filmes
- Consumo de API REST
- Manipulação de JSON
- Uso do Gson
- Records
- Exportação dos resultados para JSON

### 🍽️ TheMealDB

Exercício de consumo de API utilizando dados de receitas e refeições.

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/SEU-USUARIO/estudos_java.git
cd estudos_java
```

### 2. Abrir no VS Code

Abra a pasta do projeto no Visual Studio Code.

Recomenda-se instalar a extensão: Extension Pack for Java

### 3. Dependência Gson

A biblioteca gson-2.14.0.jar deve estar localizada na pasta:

```bash
lib/
└── gson-2.14.0.jar
```

O projeto utiliza o arquivo .vscode/settings.json para reconhecer automaticamente as bibliotecas .jar dentro da pasta lib:
```bash
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
```

### 4. Executar

Navegue até a classe que possui o método main que deseja executar.

```bash
Por exemplo: poo/api_consumo_c11/viacep_busca/Principal.java

No VS Code, clique em Run acima do método main.
```
## 👨‍💻 Autor

Filipe Mariano Rocha