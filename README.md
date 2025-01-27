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

## Participações
Contribuição de cada membro ao longo do projeto.
|Nome do Membro | Contribuição | Significância da Contribuição para o Projeto (Excelente/Boa/Regular/Ruim/Nula) | Comprobatórios (ex. links para commits)
| -- | -- | -- | -- |
| Henrique Azevedo Batalha | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [feat: adiciona tabela Henrique](https://github.com/UnBSMA2024-2/Grupo2/commit/2778438a0e7b4aaa28cd22370d2e5d1438fa9abd) / [feat: adiciona formatação da palavra 2025](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/b12736a80001fbc0e8f4f5634f552535ac6b5e93) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)
| Isaque Santos | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [feat: adiciona tabela Isaque](https://github.com/UnBSMA2024-2/Grupo2/commit/94a399841ad71ae5cc8895b9d7c1b83a695d779a) / [feat: adiciona formatação das decorações da frase](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/54995d919af973534fcff085b738aa91a7249bc8) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)
| Lara Giuliana Lima dos Santos | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [add investigando](https://github.com/UnBSMA2024-2/Grupo2/commit/0307239ddbd7bd0ea3f9b1b485dc5fbdee0b62c3) / [change-colors](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/bc744a3d485ccbe639383f02e5fbd2db214b2cf9) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)
| Maria Eduarda dos Santos Marques | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [[ADD] colocando a minha parte do modulo investigando](https://github.com/UnBSMA2024-2/Grupo2/commit/4442fcf62e2af67e83922962c93a6663eeead0d9) / [feat: implementação do fogo de artifício e coloração](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/4b574e2ccaa4f99d08a2b96b6f52f38a16120278) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)
| Marina Márcia Costa de Souza | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [feat: adiciona tabela Marina](https://github.com/UnBSMA2024-2/Grupo2/commit/ecefa0122d264e772d945338acd4a8e6a89c9baf) / [feat: adiciona formacao da palavra FELIZ](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/439a06c576ecd34619fa46de924f416bdff1c933) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)
| Rodrigo Ferreira do Amaral | Pesquisa Bibliográfica, Código final e Artigo Científico | <div align="center">Excelente</div> | [feat: adiciona tabela rodrigo](https://github.com/UnBSMA2024-2/Grupo2/commit/7ca8d88d98676179415465102c805f7ab6daadf4) / [feat: implementação do fogo de artifício e coloração](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/4b574e2ccaa4f99d08a2b96b6f52f38a16120278) / [Adicionando pdf do artigo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo/commit/41c88e43a87d85f7475bea2005b5b5544f29916a)

---

## Outros
#### (i) Lições Aprendidas
- **Métricas em tempo real:** Identificamos a importância de ajustar continuamente as métricas de cooperação e coordenação para maior eficiência.
- **Inteligência dos agentes:** A implementação de respostas a falhas e mecanismos de aprendizagem foi essencial para a robustez do sistema.
- **Escalabilidade:** Percebemos a necessidade de preparar o sistema para cenários de alta densidade de drones, especialmente com desafios de comunicação e sincronização.

#### (ii) Percepções
- A utilização de drones em sistemas multiagentes é promissora para desafios como logística, entretenimento e monitoramento ambiental.
- O framework JADE mostrou-se eficaz para criar simulações de comportamento cooperativo, mas possui limitações em cenários de falhas devido à centralização do controle.

#### (iii) Contribuições e Fragilidades
- **Contribuições:**
  - Desenvolvimento de simulações visuais atrativas, como a formação de padrões gráficos (e.g., "FELIZ 2025").
  - Documentação detalhada e publicação de código no GitHub, promovendo transparência e reprodutibilidade.
- **Fragilidades:**
  - Dependência centralizada no ControllerAgent, limitando a resiliência do sistema.
  - Falta de testes em drones reais, restringindo a aplicação prática imediata.

#### (iv) Trabalhos Futuros
- Implementar aprendizado cooperativo para melhorar a inteligência autônoma dos drones.
- Integrar entradas visuais para replicar imagens em ambientes reais.
- Realizar experimentos em cenários reais com interações humanas.
- Desenvolver sistemas de monitoramento interativo para operações cooperativas.

---

## Fontes
1. **Artigos e Livros**  
   - WOOLDRIDGE, M. *An introduction to multiagent systems*. John Wiley & Sons, 2009.  
   - RUSSELL, S.; NORVIG, P. *Artificial Intelligence: A Modern Approach*. Pearson, 2020.  
   - SÁ, D. F. S.; NETO, J. V. F. *Sistema Multiagente para Formação e Sincronização Utilizando Drones*. Disponível em: [Acesso aqui](https://www.sba.org.br/open_journal_systems/index.php/cba/article/view/1129/1614).  

2. **Repositórios**  
   - Repositório GitHub do Projeto: [2024.2_G2_SMA_ProjetoComportamentoCooperativo](https://github.com/UnBSMA2024-2/2024.2_G2_SMA_ProjetoComportamentoCooperativo).  
   - HEMMER, Mathias. *Multiagent Drone System*. Disponível em: [Acesso aqui](https://github.com/MathiasFHemmer/MultiagentDroneSystem).  

3. **Documentação**  
   - [Documentação do Projeto SMA](https://unbsma2024-2.github.io/2024.2_G2_SMA_ProjetoComportamentoCooperativo/).  
