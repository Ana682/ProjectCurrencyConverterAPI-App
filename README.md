# ProjectCurrencyConverterAPI-App

## Tópicos
* [Tópicos](#tópicos)
* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionamento](#funcionamento)
* [Benefícios](#benefícios)
* [Tecnologias](#tecnologias)
* [Estruturas do Projeto](#estrutura)
* [Autores](#autores)
* [Conclusão](#conclusão)

#  Projeto Conversor de Moedas

Nas últimas duas aulas da disciplina de Programação, oferecida pela instituição SESC Senac, tive o privilégio de desenvolver, ao lado dos meus colegas, um projeto proposto em sala: a criação de um conversor de moedas.

Essa atividade teve como objetivo aplicar na prática os conhecimentos adquiridos ao longo do curso, promovendo aprendizado colaborativo e desenvolvimento individual.

# Funcionamento
Esse conversor expressa os dados em moedas internacionais durante a criação de modelos financeiros multinacionais. 

# Benefícios:
- Visão Global: Permite uma análise financeira unificada e comparável entre as operações globais. 
- Tomada de Decisão: Facilita a tomada de decisões estratégicas, pois as informações financeiras são apresentadas em um formato padronizado. 
- Padronização: Garante a consistência dos dados financeiros em todas as subsidiárias, independentemente da moeda local. 

# Tecnologias 
As principais tecnologias empregadas no desenvolvimento deste projeto foram:

- Android Studio: Utilizado como ambiente de desenvolvimento integrado (IDE), o Android Studio permitiu a criação e execução do aplicativo Android em diversos dispositivos. Além de oferecer ferramentas essenciais para o desenvolvimento, ele também contribuiu para a melhoria da performance e organização do projeto.

- GitHub: Serviu como plataforma para armazenamento do código-fonte, controle de versão e hospedagem na nuvem. Facilitou a gestão do projeto e possibilitou o acompanhamento e compartilhamento do progresso do desenvolvimento.

- Linguagem de Programação utilizada: Este projeto foi desenvolvido utilizando JavaScript, uma linguagem de programação amplamente usada para aplicações web e scripts do lado do cliente. 

- API utilizada: Este projeto utiliza a ExchangeRate-API para buscar taxas de câmbio atualizadas entre diferentes moedas. A API fornece dados em tempo real, permitindo a conversão precisa dos valores.



# Estrutura do Projeto (Android Studio)

O projeto segue a estrutura padrão de um aplicativo Android. Dentro dessa abordagem, foram criadas as seguintes classes e suas funções:

- ExchangeRateService – Responsável por definir as chamadas à API de taxas de câmbio.

- ExchangeRatesResponse – Modelo de dados (DTO - Data Transfer Object) que representa a resposta em JSON da API.

- MainActivity.java – Classe principal responsável por iniciar a aplicação e carregar a interface do usuário.

- RetrofitClient – Classe responsável pela configuração e fornecimento de uma instância do Retrofit para comunicação com a API.

Além disso, para executar corretamente as classes e manter o controle de versão do projeto, foram utilizados os seguintes comandos Git e suas funções:

- git init – Inicializa um repositório Git vazio no diretório atual.

- git remote add origin <url> – Associa o repositório local a um repositório remoto.

- git status – Exibe o estado atual dos arquivos no repositório (modificados, novos, não rastreados, etc.).

- git add <arquivo> – Adiciona arquivos ao controle de versão, preparando-os para o commit.

- git commit -m "mensagem" – Registra as alterações no repositório com uma mensagem descritiva.

- git push – Envia os commits locais para o repositório remoto.


# Autores
O projeto contou com a orientação do Professor Leonardo Rocha, que auxiliou os alunos da turma do 3º ano do Ensino Médio durante o desenvolvimento.

Embora tenha sido um projeto proposto em conjunto, a execução foi realizada de forma individual.

Este conversor de moedas foi desenvolvido pela aluna Ana Júlia como parte da atividade.

# Referencias 

Este projeto foi inspirado nas ideias do projeto Conversor de Moedas desenvolvido pelo Professor Leonardo Rocha.

Repositório original disponível em: github.com/leonardossrocha

# Conclusão

O desenvolvimento deste conversor de moedas proporcionou uma oportunidade prática de aplicar conceitos de programação, consumo de APIs e estruturação de projetos.

Além de reforçar o uso da linguagem JavaScript e a integração com a ExchangeRate-API, o projeto também contribuiu para o aprendizado de boas práticas no desenvolvimento de aplicações web e organização de código.

A experiência foi enriquecedora e demonstrou a importância de unir teoria e prática para a consolidação do conhecimento.
