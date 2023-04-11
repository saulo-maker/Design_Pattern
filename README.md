# Design Pattern Singleton Java

O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e
forneça um único ponto de acesso a ele para qualquer outro código.

O Singleton tem quase os mesmos prós e contras que as variáveis globais.
Embora sejam super úteis, eles quebram a modularidade do seu código.

Você pode usar classes que dependem de singletons em algumas outras situações.
Você terá que levar a classe singleton também. Na maioria das vezes,
essa limitação surge durante a criação de testes de unidade.

PROBLEMAS:

  1 - COMO GARANTIR QUE UMA CLASSE TENHA APENAS UMA INSTÂNCIA ?

  2 - COMO FAZER COM QUE ESTÁ INSTANCIA UNICA POSSA SER ACESSIVEL GLOBALMENTE ?
