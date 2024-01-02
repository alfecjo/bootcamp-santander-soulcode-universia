# ☕ Bootcamp Santander SoulCode Universia - Módulo HTML CSS JavaScript

Este repositório contém o material desenvolvido durante o módulo de HTML, CSS e JavaScript no Bootcamp Santander SoulCode Universia.

## ✨ Descrição

👉 O material aqui apresentado foi criado como parte da avaliação final do módulo, cobrindo uma variedade de tópicos essenciais para o desenvolvimento web. Durante o bootcamp, exploramos profundamente os seguintes conceitos:

### 👨‍💻 HTML
- Estruturação de documentos HTML5
- Uso de tags semânticas para melhorar a acessibilidade e SEO
- Incorporação de formulários interativos

### 👨‍💻 CSS
- Estilização de páginas usando seletores e propriedades CSS
- Responsividade e layout flexível com Flexbox e Grid
- Aplicação de animações e transições para melhorar a experiência do usuário

### 👨‍💻 JavaScript
- Manipulação do DOM para interatividade dinâmica
- Utilização de eventos para responder a ações do usuário
- Comunicação assíncrona com APIs para carregamento dinâmico de dados

## 🚀 Projetos Destacados

Destacamos alguns dos projetos desenvolvidos durante este módulo:

1. **Projeto 1**: [CONTADOR DE CLIQUES](./index-01.html)
   - Crie uma página que apresente um botão que toda vez que é clicado atualizará na mesma tela a quantidade de cliques. Conforme a faixa de valores a estilização do contador deve mudar: até 100 usa-se cor verde, de 101 a 150 amarelo e de 151 acima vermelho.

2. **Projeto 2**: [Nome do Projeto 2](link-para-o-projeto2)
   - Breve descrição do projeto e tecnologias envolvidas.

## Como Usar

Siga as instruções abaixo para executar e explorar os projetos:

1. Faça o checkout do branch correspondente ao projeto desejado.
2. Abra o projeto em sua IDE preferida.
3. Instale as dependências necessárias (se houver) usando os comandos específicos.
4. Execute os projetos seguindo as instruções fornecidas nos respectivos READMEs.

## Autor

[Seu Nome](link-para-o-seu-perfil-github)
- Contato: seu-email@provedor.com
- LinkedIn: [Seu LinkedIn](link-para-o-seu-linkedin)

Sinta-se à vontade para explorar os projetos e fornecer feedback. Obrigado por visitar!
🎉 Os projetos, são exercícios solicitados ao longo do curso que juntos perfazem a nota que compõem a média final.

🥋 Se você está entrando no Java agora, vou deixar um comentário apenas para orientá-lo, caso considere o código deste exercício estranho. Este exercício, em especial, foi considerado pelo professor e os demais colegas, o mais HARD de toda a Pós na disciplina Java II, sem exageros e caso não entenda de primeira, continue tentando, pois, o sucesso não só reside nos melhores, más também, nos persistentes, que considero meu caso (_😎tirei nota máxima_). Desenvolver software, nada mais é que descartar a possibilidade de desistência, independente de qualquer motivo! Esta aplicação roda 10 threads em paralelo, más, poderia rodar quantas você quisesse...(claro!!! Guardadas as proporções de memória)

## Corrida de Motocicletas

😵 Objetivo:

Exercitar o conceito e a prática de Race Condition e Critical Sections através do uso de sincronismo de métodos e/ou objetos para simular uma corrida de motos onde o ganhador é aquele que somar mais pontos ao acessar a região crítica (ou linha de chegada).

👨‍💻 Requisitos:

1. (10 pts) O programa deve criar no mínimo 10 threads que vão representar cada competidor, cada competidor deve usar o seguinte nome: Competidor #N (onde N é o número da thread)

2. (10 pts) Haverá no mínimo 10 corridas

3. (10 pts) Uma corrida só inicia após o fim da corrida anterior, ou seja, quando todos os competidores cruzarem a linha de chegada (área crítica)

4. (30 pts) O placar da nossa corrida será contabilizado toda vez que um corredor cruzar a linha de chegada (área crítica), o competidor receberá pontos de acordo com sua posição de chegada ou seja: competidor 3 chegou primeiro na área sincronizada, recebe 10 pontos, o competidor 5 chegou em segundo, recebe 9 pontos, e assim sucessivamente até que o ultimo a cruzar a linha de chegada ganhe 1 ponto

5. (10 pts) As 10 corridas formam um campeonato, ganhará aquele que somar o maior número de pontos no campeonato

6. (10 pts) Ao final do campeonato deverá ser apresentado o placar com o total dos pontos e o pódio

🕵️ Critérios de aceite e avaliação do exercício:

1. Cada requisito possui um peso que compõe 80 pontos no total, cumpra todos para ter nota máxima, cumpra alguns e sua nota será aplicada conforme cada requisito implementado.

2. Estrutura do código (uso das regras de escrita da linguagem, estrutura) e parametrização dos valores de corridas e competidores (sim, eu posso querer ter um campeonato com 20 participantes e 30 corridas) terão peso de 10 pontos

3. Entrega no prazo, 10 pontos

🎯 Importante:

- Cópias e/ou exercícios duplicados/idênticos serão descartados, apenas os pontos da entrega (se feita no prazo) serão contabilizados.

- Faça o programa todo em apenas uma classe, utilize recursos como classes aninhadas para organização, caso envie o projeto e/ou PDF's ou vários arquivos, sua atividade não será avaliada e o ato do reenvio da mesma incorrerá em desconto por atraso

- Envie APENAS o arquivo .java do programa, nada mais.

- O objetivo da atividade também é parte da avaliação!

- Envios com atraso tem o desconto da pontualidade (acima, item 3) e desconto de 1 ponto por dia de atraso, por exemplo: se vc atrasar 1 dia, terá 1 ponto de desconto por atraso + 10 da pontualidade, totalizando 11 pontos a menos na nota.

# Tecnologia utilizada:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Tabela de Conteúdos

- [Instalação](#Instalação)
- [Uso](#Uso)
- [Contribuição](#Contribuição)

## Instalação

1. Clone o repositório ou baixe o arquivo .zip:

```bash
git clone https://github.com/alfecjo/Java-II.git
```
## Uso

1. Execute em sua IDE de preferência. Contudo, o desenvolvimento foi feito no IntelliJ! Você pode começar com: "mvn install", no diretório raiz, que é onde se encontra o
   arquivo pom.xml. Desta forma, serão baixadas as dependências, caso seja necessário.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em um branch separado.

Muito obrigado!!

