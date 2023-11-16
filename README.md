
## Fisica360 - Grupo 2

Alunos:

Guilherme Schmidt Lingnau - 2210924

Guilherme Augusto Silva de Melo - 2267306

Victor Ribeiro Calado - 2313553

Stefano Calheiros Stringhini - 2312123

Adilson Floro da Silva Junior - 2206510
## Descrição do Projeto

O projeto consiste em uma aplicação Java Desktop que atua como um questionário de exercícios de física para alunos do ensino médio, permitindo aos usuários testarem e melhorarem seus conhecimentos em física por meio da resolução de uma série de 10 exercícios. A interface principal apresenta todas as questões disponíveis, exibindo informações como título, nível de dificuldade e status de resolução. O projeto também oferece funcionalidades para ordenar as questões de acordo com o nível de dificuldade.

- Funcionalidades Principais:

Listagem de Problemas: A tela principal lista os 10 exercícios disponíveis, mostrando o título, nível de dificuldade e se foram ou não resolvidos.

Ordenação por Nível de Dificuldade: A aplicação permite que os usuários ordenem os exercícios com base no nível de dificuldade, tanto de forma ascendente quanto descendente.

Navegação entre Menus: Ao clicar em um exercício na tela principal, a aplicação direciona o usuário para uma janela dedicada a esse exercício, permitindo que o usuário navegue de forma organizada entre os exercícios, acessando cada menu de exercício individualmente. No entanto, vale ressaltar que a disponibilidade de acesso a exercícios de nível superior está condicionada ao cumprimento das regras que irão ser citadas abaixo.

Aviso ao usuário: A aplicação informa ao usuário se o problema escolhido já foi resolvido anteriormente. Se o problema já foi resolvido, a aplicação pergunta ao usuário se deseja resolver novamente.


- Regras aplicadas no Projeto:

O usuário desbloqueia níveis superiores de problemas para resolver após concluir problemas de níveis inferiores.

A pontuação é acumulada ao resolver problemas, com valores diferentes: 100 pontos para nível 1, 250 pontos para nível 2 e 500 pontos para nível 3.
Após resolver um problema de nível 3, o usuário pode escolher qualquer problema para resolver.

Se um exercício já resolvido e que o usuario errou e é refeito, a pontuação é reduzida pela metade a cada tentativa.

- Limitações/Restrições:

Não oferece feedback detalhado                    
Sendo uma aplicação Java Desktop, então é menos acessível do que aplicativos web.
## Repositório do Projeto

https://github.com/Noghiros/Certificadora-1
## Instalação e Execução

A estrutura de pastas do projeto é organizada da seguinte forma:

- .vscode/: Configurações do Visual Studio Code 
- target/:  Pasta
- src/: Pasta
-     test/:  Pasta
-     main/: Pasta
-           java/: Pasta que armazena os codigos do Projeto.
-               exercicion.json: Arquivo JSON para armazenar informações sobre os exercícios.
-               Listas.java: Código do Projeto 
-               Problemas.java: Código do Projeto
-               com /: Pasta
-                   mycompany /: Pasta
-                       certificadora1 /: Pasta
-                           certificadora1 - Codigo do Projeto


- pom.xml: O arquivo de configuração  Maven com as dependências do projet
### Pré-requisitos
- JDK 17
- Apache Maven
- Visual Studio Code
- Extensão "Extension Pack for Java" para o Visual Studio Code:

### Clone este repositório


```bash
git clone https://github.com/Noghiros/Certificadora-1.git
``` 

Execute o comando "mvn clean package" na pasta que se encontra o arquivo pom.xml.
Após isso, abra a pasta Certificadora-1 utilizando o VSCode, e procure o arquivo Listas.java execute e compile através do VSCode. 
Pronto!

### Dependências


Jackson Databind (Versão 2.15.2): Usada para manipular JSON.