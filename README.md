# To-Do_List

To-Do_List é uma aplicação simples de listagem de tarefas desenvolvida em Java utilizando Spring Framework.

## Funcionalidades

- Cadastro de Tarefas: Permite ao usuário adicionar novas tarefas à lista, especificando o nome e a data de entrega.
- Visualização e Edição: Lista todas as tarefas cadastradas com os detalhes (Nome da Task, Dia que a Task foi inicializada, Dia de entrega, Data de conclusão da Task).
- Botões de Ação: Cada tarefa listada possui botões para:
  * Concluir: Marca a tarefa como concluída.
  * Editar: Permite editar o nome e a data de entrega da tarefa.
  * Excluir: Remove a tarefa da lista.
- Validação de Dados: Utiliza Spring Validation para garantir que as entradas de dados sejam válidas.
- Armazenamento: Utiliza um banco de dados H2 em memória para persistência dos dados.

## Pré-requisitos

- Java JDK 17 ou superior
- Maven

## Dependencias Utilizadas

- Spring Boot DevTools
- Spring Data JPA
- Spring Web
- Validation
- Thymeleaf
- H2 Database

## Como Executar

- Clone o repositório: git clone https://github.com/seu-usuario/to-do-list.git
- Navegue até o diretório do projeto: cd to-do-list
- Execute a aplicação usando Maven: mvn spring-boot:run
- Acesse a aplicação em seu navegador: http://localhost:8080

## Configuração do Banco de Dados

O projeto utiliza um banco de dados H2 em memória por padrão. Não é necessário configurar nenhum banco de dados adicional.

## Rotas

| Action                     | Endpoint                                                                   | Description                                           |
|----------------------------|----------------------------------------------------------------------------|-------------------------------------------------------|
| Tarefas                    | [http://localhost:8080/](http://localhost:8080/)                           | Endpoint para conferir suas tarefas                   |
| Registrar                  | [http://localhost:8080/create](http://localhost:8080/create)               | Endpoint para realizar a criação de novas tarefas     |
| Excluir                    | [http://localhost:8080/delete/{id}](http://localhost:8080/delete/{id})     | Endpoint para excluir suas tarefas                    |

## Entidades 
  ```json
[
    {
        "Título": "John Doe",
        "Data de entrega": "27/06/2024"
    }
]
```

## Arquitetura

```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br
│   │   │       └── com
│   │   │           └── ricardo
│   │   │               └── twtodo
│   │   │                   ├── controller
│   │   │                   │   └── TodoController.java
│   │   │                   ├── models
│   │   │                   │   └── Todo.java
│   │   │                   ├── repository
│   │   │                   │   └── TodoRepository.java
│   │   │                   └── LoginAuthApiApplication.java
│   │   ├── resources
│   │       └── templates
│   │           └── todo
│   │               ├── delete.html
│   │               ├── form.html
│   │               ├── list.html
│   │           └── base.html
│   └── test
│       └── java
│           └── br
│               └── com
│                   └── ricardo
│                       └── twtodo
│                           └── TodoControllerTest.java
├── .gitignore
├── pom.xml
└── README.md
```



## License

This project is licensed under the MIT License.
