
# Conexao Java e MongoDB

O objetivo e aprender a criar uma conexao de forma exemplar o projeto java spring boot com banco de dados mongodb


## Documentação da API

#### Salvar Dados

```http
  POST localhost:8080/user
```

```json
{
    "name" : "Angelica",
    "email" : "angelica@gmail.com",
    "document" : "12345874",
    "address" : {
        "street" : "Alguma rua",
        "neighborhood" : "centro",
        "number" : "1245",
        "zipCode" : "20756160",
        "city" : "city",
        "complement" : "complement"
    }
}
```

#### Retorna os Dados

```http
  GET localhost:8080/user
```

| Key   | Value       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `angelica@gmail.com` | **Obrigatório**. |


#### Deleta os Dados

```http
  DELETE localhost:8080/user
```

| Key   | Value       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `angelica@gmail.com` | **Obrigatório**. |


