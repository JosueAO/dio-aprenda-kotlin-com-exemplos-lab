
# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


# Bootcamp Kotlin Experience

## Refatoração do template e implementação dos TODO

Este é um projeto que implementa o domínio de Formações da DIO, que tem como objetivo oferecer um conjunto de Conteúdos Educacionais voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.

O projeto utiliza Kotlin e foi desenvolvido com o objetivo de demonstrar o uso de Enumerations, Classes Data, Listas e Loops em Kotlin.

## Mudanças realizadas

Foram realizadas as seguintes mudanças no código original:

- Adicionado o parâmetro nivel na classe ConteudoEducacional, utilizando a Enumeração Nivel.
- Alterado a declaração dos parâmetros da classe Formacao para usar a palavra-chave vararg, permitindo que um número variável de 
  conteúdos educacionais possam ser passados como argumento.
- Substituído a estrutura if-else por uma estrutura when na função matricular, para simplificar o código.
- Removido o parâmetro duracao com valor padrão na classe ConteudoEducacional, pois não era utilizado.

## Conclusão
Este projeto foi desenvolvido com o objetivo de demonstrar como usar Enumerações, Classes Data, Listas e Loops em Kotlin. As mudanças realizadas no código original permitiram uma maior flexibilidade e simplicidade na utilização das classes do domínio.