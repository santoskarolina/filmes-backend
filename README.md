# :pushpin: API de filmes

Api de filmes, cada filme tem uma categoria e uma classificação 
indicativa


#### :small_blue_diamond: Tecnologias usadas

 - Java como linguagem de programação,
 - SpringBoot como framework,
 - h2 para banco de dados de teste,
 - postgreSql para banco de dados de produção e desenvolvimento,
 - Heroku para deploy da aplicação
  
#### :small_blue_diamond: API Reference

#### GET todos os filmes

```http
  GET /api/filmes
```

```http
[
{
    "id": 1,
    "titulo": "Viuva negra",
    "linkFoto": "https://lumiere-a.akamaihd.net/v1/images/image_a2514f6d.jpeg?region=0,0,540,810",
    "dataLancamento": 2021,
    "categoria": "Ação"
  },
  {
    "id": 2,
    "titulo": "Os Vingadores",
    "linkFoto": "https://br.web.img2.acsta.net/medias/nmedia/18/89/43/82/20052140.jpg",
    "dataLancamento": 2019,
    "categoria": "Ação"
  },
  {
    "id": 3,
    "titulo": "Aladdin",
    "linkFoto": "https://lumiere-a.akamaihd.net/v1/images/image_9e35a739.jpeg?region=0%2C0%2C540%2C810",
    "dataLancamento": 2019,
    "categoria": "Musical"
  }
] 
```

#### Get filmes por id

```http
  GET /api/filmes/${id}
```

```http
{
  "id": 1,
  "titulo": "Viuva negra",
  "linkFoto": "https://lumiere-a.akamaihd.net/v1/images/image_a2514f6d.jpeg?region=0,0,540,810",
  "dataLancamento": 2021,
  "descricao": "Natsha conta sua historia até virar a viuva negra",
  "nota": 10.0,
  "linkIMDB": "https://www.imdb.com/title/tt3480822/?ref_=nv_sr_srsg_3",
  "categoria": {
    "id": 1,
    "nome": "Ação"
  },
  "classificacao": {
    "id": 3,
    "nome": "12 anos"
  }
}
```

#### POST novo filme

```http
  POST /api/filmes
```
```http
  {
    "titulo": "Viuva negra",
    "linkFoto": "https://lumiere-a.akamaihd.net/v1/images/image_a2514f6d.jpeg?region=0,0,540,810",
    "dataLancamento": 2021,
    "descricao": "Natsha conta sua historia até virar a viuva negra",
    "nota": 10.0,
    "linkIMDB": "https://www.imdb.com/title/tt3480822/?ref_=nv_sr_srsg_3",
    "categoria": 1,
    "classificacao": 3
  }
```
#### :small_blue_diamond: Modelo de camadas
![DOMAIN MODEL](https://github.com/anna104016/html/blob/main/estrutura%20de%20camadas01.png)
 

  
