# DesafioDev

## Descritivo do Sistema de Controle de Matrículas:
* Uma faculdade pretende informatizar seu sistema de matrículas. A secretaria da faculdade
gera o currículo para cada semestre e mantém as informações sobre as disciplinas,
professores e alunos.
* Cada curso tem um nome, um determinado número de créditos e é constituído por diversas
disciplinas.
* Os alunos podem se matricular a 4 disciplinas como 1ª opção e a mais 2 outras alternativas.
* O número máximo de alunos inscritos a uma disciplina é de 10 e quando este número é
atingido, as inscrições (matrículas) a essa disciplina são encerradas.
* Após um aluno se inscrever para um semestre, são geradas cobranças pelo sistema de
matrículas, de modo que o aluno possa ser cobrado pelas disciplinas daquele semestre.
* Os professores podem acessar o sistema para saber quais são os alunos que estão
matriculados em cada disciplina.
* A secretaria do curso pode acessar o sistema para saber quais disciplinas um determinado
aluno possui e o valor a ser pago.
* Todos os usuários do sistema têm senhas que são utilizadas para validação do respectivo
login.
O projeto deve ser desenvolvido na linguagem Java, utilizando o framework JSF, HIbernate e
banco de dados Postgres

## Desenvolvido
Baseando-me no padrão de projetos MVC (Model View Controller) desenvolvi as classes para a realização do proposto.
### Model
As classes dentro do pacote ```desafiodev.model``` são as classes Java que definem os atores dessa situação de controle de matrículas. Essas classes estão anotadas para integrar com o [Hibernate](https://hibernate.org), mapeando-as em tabelas do banco de dados.
### Controller 
Dentro do pacote ```desafiodev.controller``` estão as classes intermediárias no padrão MVC, fazendo a ponte entre o modelo e a cena (View). Recebendo as interações do usuário através da cena, processando/tratando os dados e encaminhando, nesse caso, para o serviço pedido: seja cadastro ou consulta de dados; e novamente repassando a resposta para a cena.
### Service
As classes dentro do pacote ```desafiodev.service``` são as que realizarão o serviço requisitado pela cena e tratado pelo controlador. Aqui é onde aplico as regras de negócio, requisitadas na definição desse problema.  
### View 
A cena, nesse ambiente web, são as páginas ```xhtml```, que recebem as interações do usuário, as enviam para o controlador responsável por cada página e exibem a resposta deste controlador.
### Repository
As classes dentro do pacote ```desafiodev.repository``` são as que, de fato, persistirão os dados ou realizarão as consultas no banco de dados utilizando o Hibernate para a persistência e o Criteria API para a consulta desses dados.
### Security
As classes dentro do pacote ```desafiodev.security``` tratam da segurança e permissões de cada ator desse cenário.
### Util
Nesse pacote se encontram classes/interfaces utilitárias para o propósito descrito no sub-pacote. 
* Para o JPA, é necessário uma anotação que garanta a atomicidade na consulta ou na inserção no banco de dados. E alerte à pilha de chamadas, e possivelmente o usuário em forma de aviso visual no site, caso haja falha.
* Para o JSF, por praticidade, criei funções para as mensagens de pop-up no xhtml com os contextos: Erro, Aviso e Informativo; para evitar reescrita de código similar em diversos pontos do projeto. 

## Desafios encontrados
No percurso do desenvolvimento desse site, encontrei vários problemas, tais quais:
* Bibliotecas incompatíveis
* Configurações de instalação para deploy
* Configurações do servidor
* Problemas com o servidor, vide [#2](../../issues/2)
* Não renderização das páginas
* Erros em tempo de execução
Alguns foram superados, com longas pesquisas, outros não. Estruturalmente, este projeto, é funcional mas, nuances de configurações me impediram de testá-lo.
