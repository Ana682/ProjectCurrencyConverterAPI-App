# ProjectCurrencyConverterAPI-App

## Tópicos
* [Tópicos](#tópicos)
* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionamento](#funcionamento)
* [Benefícios](#benefícios)
* [Tecnologias](#tecnologias)
* [Estruturas do Projeto](#estrutura)
* [Comandos Iniciais] (#comandos-iniciais)
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

Ainda assim, vale destacar que na parte do (activity_main.xml) foram criados os seguintes comandos:
- EditText = com o objetivo de inserir o valor;
- Spinner = com o objetivo de escolher a moeda de origem;
- Spinner2 = com o objetivo de escolher a moeda de destino;
- Buttom = com o objetivo de realizar a conversão escolhida.

E uma das partes mais importantes utilizadas no (MainActivity.Java):
- import android.os.Bundle;: O pacote Bundle é usado para empacotar e transferir dados entre diferentes partes de um aplicativo Android, como entre Activities;
- import android.view.View;: A classe View é a classe base para todos os elementos de interface (widgets) na interface do utilizador do Android, como botões, textos, etc;
- import android.widget.Button;: Traz a funcionalidade de criar um botão na interface do utilizador;
- import android.widget.ArrayAdapter;: É um adaptador que pode preencher um ListView ou Spinner com dados de uma lista de objetos;
- import android.widget.EditText;: Permite criar uma área onde o usuário pode inserir texto;
- import android.widget.Spinner;: Traz a funcionalidade de criar um menu de seleção (dropdown) onde o usuário pode escolher um item;
- import android.widget.TextView;: É usado para exibir texto estático na interface;
- import android.widget.Toast;: Cria mensagens pequenas e temporárias que aparecem na tela para dar feedback ao usuário;
- import androidx.appcompat.app.AppCompatActivity;: Traz a classe base para as suas Activitys, garantindo compatibilidade com versões mais antigas do Android e oferecendo funcionalidades modernas;
-  ArrayAdapter: converte os dados da fonte em objetos visuais que a UI pode exibir. Ou seja, permite organizar múltiplas cópias de um objeto ou grupo de objetos segundo um padrão retangular;

Nest contexto, temos algumas partes que são extremamentes necessárias, dividndo as em quatro partes:

1) Local que irá Inicializar os componentes da interface:
- spinnerMoedaOrigem = findViewById(R.id.spinnerMoedaOrigem);
- spinnerMoedaDestino = findViewById(R.id.spinnerMoedaDestino);
- etValor = findViewById(R.id.etValor);
- btnConverter = findViewById(R.id.btnConverter);
- tvResultado = findViewById(R.id.tvResultado);

2) Local da configuração dos  Spinners com a lista de moedas:
- ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moedas);
- adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
- spinnerMoedaOrigem.setAdapter(adapter);
- spinnerMoedaDestino.setAdapter(adapter);

3) Local que carrega as taxas de câmbio da API:
- carregarTaxasDeCambio();
- btnConverter.setOnClickListener( view-> converterMoeda());

4) Método para converter o valor de uma moeda para outra
- private void converterMoeda(){

# Comandos - Iniciais
Nesta parte, há a presença das anotações escritas durante as primeiras aulas. Anotações, as quais são o estopim para começar tudo.
- git init = usado para criar um repositório vazio;
- git remote add origin url = atrelar ou ligar um repositório local a um repositório remoto;  
- git status = usado para verificar o estado do repositório no momento.
- git add = server para traquear (colocar sob cuidado do git os arquivos, os arquivos que não foram tratados no git). 
- git commit = usado para adicionar uma mensagem que descreve a alteração feita no repositório. O parâmetro -m significa mensagem em inglês que me permite colocar na linha de comando o texto da alteração feita.
- git push = serve para enviar os arquivos para o repositório remoto.
- git pull = serve para baixar arquivos do remoto para local. 

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
