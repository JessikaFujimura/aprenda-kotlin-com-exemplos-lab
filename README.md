# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```
## Resolução do desafio

O desafio primeiramente cria a entidade Usuário com o nome informado via input no console.

Logo após é exibido uma listagem de Formações pré-cadastradas.

Em seguida se pede para digitar o número da formação que se deseja matricular.

A confirmação da matricula é feita por uma mensagem: **"*Usuário* matriculado na formação *Nome da formação* com sucesso!"**

### Pontos a melhorar no código: 
- Incluir a validação para caso o usuário informe um número da formação inexistente;
- Criar a opção de desmatricular do curso