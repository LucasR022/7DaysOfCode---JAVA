
# 7DaysOfCode - Java

Desafio Java - criar um código java para consumir uma API de filmes e criar um HTTP com o JSON criado
## Referência

 - [IMDb ](https://imdb-api.com/api)
 - [TMDb](https://themoviedb.org)



## Apêndice

No desafio é recomendado utilizar a API do IMDb, porém no momento esta API não tem mais a versão de teste gratuita.

Para realizar o desafio utilizei a API TMDb que tem o mesmo funcionamento e é gratuita.

## Documentação do Desafio

#### Requisição da API

```http
  .uri(new URI("https://api.themoviedb.org/3/movie/550?api_key=" + apiKey))
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `apiKey` | `String` | **Obrigatório**. Recebe a sua  chave da API |



## Aprendizados

### Day 1

No primeiro dia do desafio o objetivo era criar um código java rodar e consumir a API.

- Passo 1: Primeiro passo é criar uma conta no webservice ou plataforma da API, eu utilizei o TMDb

- Passo 2: Após criar sua conta você consegue acesso a sua API Key no site da plataforma explica todo o passo a passo necessário.

- Passo 3: Criar o código que irá consumir a API. (Aqui foi onde eu tive um pouco mais de dificulde por não conhecer as classes HTTP do java e seu funcionamento, mas com um pouco de pesquisa conseguir passar pela primeira etapa do desafio)

