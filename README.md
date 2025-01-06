# Sistema de Formação de Drones

**Disciplina**: FGA0134 - Sistemas Multiagentes <br>
**Nro do Grupo**: 02<br>
**Frente de Pesquisa**: Coordenação e Comunicação em Sistemas Multiagentes<br>

## Alunos
|Matrícula | Aluno |
| -- | -- |
| 211061850	| Henrique Azevedo Batalha |	
| 211061903	| Isaque Santos |           		
| 190058048	| Lara Giuliana Lima dos Santos	|
| 200023985	| Maria Eduarda dos Santos Marques	|
| 200041606	| Marina Márcia Costa de Souza	|
| 231011810	| Rodrigo Ferreira do Amaral |

## Sobre 
O Sistema de Formação de Drones será uma aplicação desenvolvida em Java utilizando o framework JADE (Java Agent DEvelopment Framework) para criar um sistema multiagente voltado para a organização inteligente de formações de drones.
Esse sistema será projetado para explorar a eficiência da comunicação e coordenação entre agentes, permitindo que múltiplos drones trabalhem juntos em tempo real para formar padrões específicos, como a letra "A". A principal funcionalidade será o gerenciamento colaborativo de agentes para alinhar formações, otimizar trajetórias e lidar com imprevistos, garantindo desempenho e precisão em operações coletivas.
Utilizando o framework JADE, a criação, comunicação e gerenciamento de agentes serão simplificados, proporcionando ao sistema modularidade e escalabilidade. Acreditamos que este projeto se destacará por sua aplicação prática em operações aéreas, servindo como um exemplo de como tecnologias avançadas podem transformar a organização e coordenação de drones, trazendo maior eficiência e inovação para o mundo real.

## Screenshots 

![formação dos drones](assets/formacaoDrone.gif)


## Instalação 
**Linguagens**: Java<br>
**Tecnologias**: JADE (Java Agent Development Framework), Swing (para a interface gráfica)<br>

## Pré-requisitos 
Certifique-se de que os seguintes itens estão instalados no seu sistema antes de executar o projeto:

1. **Java Development Kit (JDK)**: Versão 8 ou superior.  
2. **JADE Framework**: Baixe e configure o JADE em seu ambiente.  
   - Site oficial do JADE: [JADE Download](http://jade.tilab.com/)  
3. **IDE de sua preferência**: Recomenda-se IntelliJ IDEA, Eclipse ou qualquer outra compatível com projetos Java.  
4. **Git**: Para clonar o repositório.  

## Passo a Passo para Instalação do JADE

### **Windows**

#### Descompactar o Arquivo

1. Navegue até a pasta onde o arquivo `jadeAll.zip` foi baixado.
2. Clique com o botão direito no arquivo e escolha a opção **Extrair Tudo...** 
3. Escolha uma pasta de destino para extrair os arquivos.
   - Exemplo: `C:\Users\<usuário>\jade`.

#### Configurar Variáveis de Ambiente 

1. **Abrir Configurações de Variáveis de Ambiente:**
- Pressione `Win + R`, digite `sysdm.cpl` e pressione **Enter**.
- Vá para a aba **Avançado** e clique em **Variáveis de Ambiente**.

2. **Criar as Variáveis Necessárias:**
- Na seção **Variáveis do Sistema**, clique em **Nova**:
  - Nome: `JAVA_HOME`
  - Valor: O caminho para a instalação do JDK (exemplo: `C:\Program Files\Java\jdk-23\bin`).
- Na seção **Variáveis do Sistema**, clique em **Nova**:
  - Nome: `CLASSPATH`
  - Valor:
    ```
    C:\Users\<usuário>\jade\JADE-bin-4.6.0\jade\lib\jade.jar
    ```

3. **Repetir o Processo nas Variáveis do Usuário:**
- Repita as etapas acima, adicionando as mesmas variáveis `JAVA_HOME` e `CLASSPATH` na seção **Variáveis do Usuário**.

4. **Adicionar o Caminho do Java ao `Path`:**
- Na mesma janela, localize a variável `Path` em **Variáveis do Sistema** .
- Clique em **Editar** e adicione:

  - `C:\Program Files\Java\jdk-23\bin` 
  - `C:\Users\<usuário>\jade\JADE-bin-4.6.0\jade\lib\jade.jar`

5. **Repetir o Processo nas Variáveis do Usuário:**
- Repita as etapas acima, adicionando as variáveis:

- `C:\Program Files\Java\jdk-23\bin` 
- `C:\Users\<usuário>\jade\JADE-bin-4.6.0\jade\lib\`


### **Linux**

#### Descompactar o Arquivo

- Localize o arquivo baixado, como `jade-bin-<versão>.zip` ou `jadeAll.zip`.
- Use o comando abaixo para descompactá-lo no diretório desejado (exemplo: `~/jade`):
  ```bash
  unzip jade-bin-<versão>.zip -d ~/jade

#### Localizar o Arquivo jade.jar

Após a descompactação, localize o arquivo jade.jar. Ele geralmente estará na pasta:
`~/jade/lib`

#### Editar o Arquivo .bashrc

Abra o arquivo .bashrc no seu editor de texto preferido, como nano:

`nano ~/.bashrc`

Adicione as seguintes linhas ao final do arquivo:

  ```
export JADE_LIB=/home/<SEU_USUARIO>/jade/lib
export JADE_CP=$JADE_LIB/jade.jar:$JADE_LIB/jadeExamples.jar:$JADE_LIB/commons-codec-1.3.jar
alias rJade='java -cp $JADE_CP jade.Boot -gui'
alias cJade='javac -cp $JADE_CP'
 ```

Recarregue o arquivo utilizando o comando a seguir:

`source ~/.bashrc`

Para testar se está tudo funcionando corretamente utulize o comando:

`rJade`

Se tudo estiver certo deverá aparecer a tela clássica do Jade.



### **Como Usar o Sistema de Formação de Drones**  

Após a instalação e configuração, siga os passos abaixo para utilizar o sistema:

### **1. Inicie o Container Principal do JADE**
- No terminal, execute o seguinte comando para iniciar o container principal do JADE:
- Windows  
   ```bash
   javac -cp "msgFinal\lib\jade.jar" -d msgFinal\bin msgFinal\src\*.java
- Linux
   ```bash
   javac -cp "msgFinal/lib/jade.jar" -d msgFinal/bin msgFinal/src/*.java
- Uma interface gráfica será aberta mostrando os agentes registrados no sistema (GUI do JADE).

### **2. Inicie os Agentes**
- No terminal, execute o seguinte comando para iniciar os agentes:
- Windows
   ```bash
   java -cp "msgFinal\lib\jade.jar;msgFinal\bin" Main
- Linux
   ```bash
   java -cp "msgFinal/lib/jade.jar:msgFinal/bin" Main
- Isso criará os agentes responsáveis pela formação e o controlador.

### **3. Visualize a Formação de Drones**
- A interface gráfica do sistema abrirá automaticamente, mostrando a posição dos drones em tempo real enquanto eles se movem para formarem as frases e as figuras desejadas.
- Cada drone será representado como um ponto na tela, e as formações serão atualizadas dinamicamente.
- O sistema é capaz de exibir diferentes padrões, como letras, números ou figuras, permitindo uma visualização clara da coordenação entre os drones.
- Caso ocorra uma falha em um dos drones, o sistema ajustará automaticamente as posições dos demais para manter a integridade da formação. 
- Os drones podem alterar suas cores em tempo real, criando efeitos visuais atrativos, como transições suaves de cores ou destaques em padrões específicos.

## Vídeo REALIZAR
Adicione 1 ou mais vídeos com a execução do projeto.
Procure: 
(i) Introduzir o projeto;
(ii) Mostrar passo a passo o código, explicando-o, e deixando claro o que é de terceiros, e o que é contribuição real da equipe;
(iii) Apresentar particularidades do Paradigma, da Linguagem, e das Tecnologias, e
(iV) Apresentar lições aprendidas, contribuições, pendências, e ideias para trabalhos futuros.
OBS: TODOS DEVEM PARTICIPAR, CONFERINDO PONTOS DE VISTA.
TEMPO: +/- 15min

## Participações
Contribuição de cada membro ao longo do projeto.
|Nome do Membro | Contribuição | Significância da Contribuição para o Projeto (Excelente/Boa/Regular/Ruim/Nula) | Comprobatórios (ex. links para commits)
| -- | -- | -- | -- |
| Henrique Azevedo Batalha | Pesquisa Bibliográfica, ... | (Em análise) | [feat: adiciona tabela Henrique](https://github.com/UnBSMA2024-2/Grupo2/commit/2778438a0e7b4aaa28cd22370d2e5d1438fa9abd)   
| Isaque Santos | Pesquisa Bibliográfica, ... | (Em análise) | [feat: adiciona tabela Isaque](https://github.com/UnBSMA2024-2/Grupo2/commit/94a399841ad71ae5cc8895b9d7c1b83a695d779a)
| Lara Giuliana Lima dos Santos | Pesquisa Bibliográfica, ... | (Em análise) | [add investigando](https://github.com/UnBSMA2024-2/Grupo2/commit/0307239ddbd7bd0ea3f9b1b485dc5fbdee0b62c3)
| Maria Eduarda dos Santos Marques | Pesquisa Bibliográfica, ... | (Em análise) | [[ADD] colocando a minha parte do modulo investigando](https://github.com/UnBSMA2024-2/Grupo2/commit/4442fcf62e2af67e83922962c93a6663eeead0d9)
| Marina Márcia Costa de Souza | Pesquisa Bibliográfica, ... | (Em análise) | [feat: adiciona tabela Marina](https://github.com/UnBSMA2024-2/Grupo2/commit/ecefa0122d264e772d945338acd4a8e6a89c9baf)
| Rodrigo Ferreira do Amaral | Pesquisa Bibliográfica, ... | (Em análise) | [feat: adiciona tabela rodrigo](https://github.com/UnBSMA2024-2/Grupo2/commit/7ca8d88d98676179415465102c805f7ab6daadf4)

## Outros 
Quaisquer outras informações sobre o projeto podem ser descritas aqui. Não esqueça, entretanto, de informar sobre:
(i) Lições Aprendidas;
(ii) Percepções;
(iii) Contribuições e Fragilidades, e
(iV) Trabalhos Futuros.

## Fontes
Referencie, adequadamente, as referências utilizadas.
Indique ainda sobre fontes de leitura complementares. 