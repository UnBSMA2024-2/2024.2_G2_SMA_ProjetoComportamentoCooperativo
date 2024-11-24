<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Módulo Investigando</title>
  <style>
    /* Estilo geral para as tabelas */
    table {
      margin-left: auto;
      margin-right: auto;
      border-collapse: collapse;
      width: 100%;
      max-width: 1200px;
      text-align: center;
      border: 1px solid black;
      font-size: 16px;
      margin-bottom: 20px;
    }

    th, td {
      padding: 8px;
      border: 1px solid black;
    }

    thead th {
      background-color: #f2f2f2;
      color: #000; /* Cor padrão para modo claro */
    }

  /* Alteração para o modo escuro */
  @media (prefers-color-scheme: dark) {
    .tabela-alunos thead th {
      color: #888; /* Cor cinza apenas para os títulos no modo escuro */
    }
  }

    /* Espaçamento adicional para textos abaixo das tabelas */
    .section-text {
      margin-top: 20px;
    }
  </style>
</head>
<body>
  <h1 align="center"><strong>Introdução</strong></h1>

  <h1 style="font-weight: bold; margin-bottom: 10px;">Introdução</h1>
  <p align="justify">
    &emsp;&emsp;Com o objetivo de encontrar bases para a pesquisa sobre sistemas multiagentes, foi realizada uma pesquisa bibliográfica em busca de artigos que possam nortear o andamento do projeto da disciplina. 
  </p>

<h1 style="font-weight: bold; margin-bottom: 10px;">Pesquisa Bibliográfica</h1>
<p align="justify">
    &emsp;&emsp;
</p>

<h6 align="center">Tabela 01: Pesquisa Bibliográfica</h6>
  <div style="text-align: center;">
    <table>
      <thead>
        <tr>
          <th>#</th>
          <th>Etapa</th>
          <th>Descrição</th>
          <th>Resultado</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>Estabelecer o Tema</td>
          <td>Defina o foco principal da pesquisa.</td>
          <td>Sistemas Multiagentes Comportamentais.
            <ul>
              <li>Motivação: Foi concluído por análise que o repositório que desejamos utilizar como base se trata de um sistema multiagente comportamental.</li>
            </ul>
          </td>
        </tr>
        <tr>
          <td>2</td>
          <td>Especificar uma Questão de Pesquisa</td>
          <td>Elabore uma pergunta que guiará a investigação.</td>
          <td>Sistemas Multiagentes Comportamentais X Sistemas Multiagentes Colaborativos.
            <ul>
              <li>Motivação: Sistemas Multiagentes Colaborativos foi um aspecto interessante  não explorado dentro do repositório. Por isso devemos considerá-lo como candidato.</li>
            </ul>
          </td>
        </tr>
        <tr>
          <td>3</td>
          <td>Identificar Palavras-chave</td>
          <td>Liste os termos mais relevantes para busca.</td>
          <td>Multiagentes Comportamentais, Multiagente Comportamental,  Behaviour Multiagent, Agente Colaborativo, Agente Cooperação, Agent Cooperation, Agent Collaborative, Drone.</td>
        </tr>
        <tr>
          <td>4</td>
          <td>Identificar Autores Relevantes</td>
          <td>Pesquise os principais especialistas na área.</td>
          <td>Frank L. Lewis.</td>
        </tr>
        <tr>
          <td>5</td>
          <td>Estabelecer Strings de Busca</td>
          <td>Monte combinações de palavras-chave.</td>
          <td>
            <ul>
              <li>“Sistemas Multiagentes" E "Comportamental" E “Drones” .</li>
              <li>“Multiagent” AND “Behavioral” AND “Drones” .</li>
            </ul>
          </td>
        </tr>
        <tr>
          <td>6</td>
          <td>Escolher Bases Científicas</td>
          <td>Selecione as bases onde realizará as buscas.</td>
          <td>Google Acadêmico e Periódicos Capes.</td>
        </tr>
        <tr>
          <td>7</td>
          <td>Realizar as Buscas</td>
          <td>Execute as buscas utilizando as strings.</td>
          <td> </td>
        </tr>
        <tr>
          <td>8</td>
          <td>Manter Rastreabilidade</td>
          <td>Registre base consultada, strings e filtros aplicados.</td>
          <td> </td>
        </tr>
        <tr>
          <td>9</td>
          <td>Estabelecer Critérios de Inclusão</td>
          <td>Defina critérios para selecionar referências.</td>
          <td>Escrito em português ou inglês.</td>
        </tr>
        <tr>
          <td>10</td>
          <td>Estabelecer Critérios de Exclusão</td>
          <td>Defina critérios para descartar referências irrelevantes.</td>
          <td>Não ser relacionado com drones.</td>
        </tr>
        <tr>
          <td>11</td>
          <td>Aplicar Critérios</td>
          <td>Filtre as referências com base nos critérios.</td>
          <td>Selecionadas: 8, Excluídas: 3.
            <ul>
              <li>Sistema Multiagente para Formação e Sincronização Utilizando Drones.</li>
              <li>Avaliação de Protocolos de Controle Cooperativo em VANT’s.</li>
              <li><s>Simulação Multiagentes em Áreas Atingidas por Terremotos com Focos de Incêndio.</s></li>
              <li>A Decentralized Multilevel Agent Based Explainable Model for Fleet Management of Remote Drones.</li>
              <li>A multi-agent approach to the truck multi-drone routing problem.</li>
              <li>Imitation Learning of Complex Behaviors for Multiple Drones with Limited Vision.</li>
              <li><s>Learning Communication for Cooperation in Dynamic Agent-Number Environment.</s></li>
              <li><s>Self-triggered distributed model predictive control for flocking of multi-agent systems.</s></li>
            </ul>
          </td>
        </tr>
        <tr>
          <td>12</td>
          <td>Ler Resumos</td>
          <td>Leia e refine a seleção das referências.</td>
          <td>Mantidas: 3, Descartadas: 2.
            <ul>
              <li>Sistema Multiagente para Formação e Sincronização Utilizando Drones.</li>
                <ul>
                  <li>Focado mais na cooperação entre agentes drones para a movimentação conjunta de drones em formação.</li>
                </ul>
              <li>Avaliação de Protocolos de Controle Cooperativo em VANT’s.</li>
                <ul>
                  <li>Mesmos autores e tema do artigo anterior. Mais recente, pode ser útil para compreender mais o conteúdo.</li>
                </ul>
              <li><s>A Decentralized Multilevel Agent Based Explainable Model for Fleet Management of Remote Drones.</s></li>
                <ul>
                  <li>Parece mais voltado à interação entre o sistema e seres humanos.</li>
                </ul>
              <li>A multi-agent approach to the truck multi-drone routing problem.</li>
                <ul>
                  <li>Relaciona o uso de drones com o problema do caixeiro viajante.</li>
                </ul>
              <li><s>Imitation Learning of Complex Behaviors for Multiple Drones with Limited Vision.</s></li>
                <ul>
                  <li>O artigo trata do comportamento de um enxame de drones descentralizado dependentes apenas de uma câmera frontal, sem comunicação entre eles.</li>
                </ul>
            </ul>
          </td>
        </tr>
        <tr>
          <td>13</td>
          <td>Apresentar Referências Finais</td>
          <td>Compile e apresente as referências selecionadas.</td>
          <td>
            <ul>
              <li>de Sá, Denis F. Sousa. "Sistema Multiagente para Formação e Sincronização Utilizando Drones." Congresso Brasileiro de Automática-CBA. Vol. 2. No. 1. 2020.</li>
                <ul>
                  <li>https://sba.org.br/open_journal_systems/index.php/cba/article/view/1129</li>
                </ul>
              <li>De Sá, Denis Fabrício Sousa, and João Viana Da Fonseca Neto. "Avaliação de Protocolos de Controle Cooperativo em VANT’s." ENGENHARIAS-AUTOMAÇÃO, ROBÓTICA, METROLOGIA E ENERGIA: ESTUDOS E TENDÊNCIAS-VOLUME 1. Vol. 1. Editora Científica Digital, 2023.</li>
                <ul>
                  <li>https://downloads.editoracientifica.com.br/articles/230111668.pdf</li>
                </ul>
              <li>Leon-Blanco, Jose Miguel, et al. "A multi-agent approach to the truck multi-drone routing problem." Expert Systems with Applications 195 (2022): 116604.</li>
                <ul>
                  <li>https://www.sciencedirect.com/science/article/pii/S0957417422000975</li>
                </ul>
            </ul>
          </td>
        </tr>
      </tbody>
    </table>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela criada por <a href="https://github.com/The-Boss-Nina" target="_blank">SOUZA, Marina</a>. 2024.</em>
    </p>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela editada por <a href="https://github.com/HeBatalha" target="_blank">BATALHA, Henrique</a>. 2024.</em>
    </p>
  </div>

 <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Conclusão</h1>
  <p align="justify">
    &emsp;&emsp;Em suma, as referências finais consistem de dois temas relacionados com sistemas multiagentes com drones, apesar de se tratarem de objetivos diferentes não significa que os dois temas não possam ser aproveitados e utilizados em conjunto para o projeto da disciplina.
  </p>
  <p align="justify">
    &emsp;&emsp;O primeiro tema que consiste de dois artigos aborda a organização de um conjunto de drones em uma formação de movimento, nos artigos estão presentes diversas fórmulas matemáticas usadas para a base teórica além conceitos de liderança e formação utilizados. Por isso, apesar do objetivo final dos dois artigos talvez não ser o mais relevante para os objetivos do grupo, esses artigos possuem diversos conceitos e conteúdos que podem vir a ser utilizados em outras aplicações do grupo.
  </p>
  <p align="justify">
    &emsp;&emsp;O segundo tema aborda a utilização de sistemas multiagentes dentro de um problema chamado Truck-multi-Drone Team Logistics Problem que é uma variação do problema do caixeiro viajante. O que varia entre esse problema de sua versão original é que consideramos um caminhão que carrega alguns drones, em cada ponto visitado esses drones podem viajar autonomamente e visitar outros pontos, mas eles possuem bateria limitada, ou seja, devem voltar para o caminhão para recarga. Um ponto interessante do artigo é que ele faz referência a muitos outros artigos similares que exploram variações desse problema, como o caso de apenas os drones fazerem as entregas e o caminhão servir apenas como uma estação de recarga, ou como no caso de cada drone ser capaz de fazer apenas uma única entrega. Com isso, o artigo apresenta diversas qualidades favoráveis para servir como base para a pesquisa do projeto, pois além de ser bastante completo no que se refere a ideias aplicáveis, conta com uma extensa base de referências, o que facilita a identificação de novas fontes de conteúdo, caso necessário.
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Histórico de Versão</h1>
  <p align="justify" class="section-text">
  A tabela 02 representa o histórico de versão do documento.
  </p>

  <h6 align="center">Tabela 02: Histórico de Versão</h6>
  <div style="text-align: center;">
    <table>
      <thead>
        <tr>
          <th>Versão</th>
          <th>Data</th>
          <th>Descrição</th>
          <th>Autor(es)</th>
          <th>Revisor(es)</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td><code>1.0</code></td>
          <td>24/11/2024</td>
          <td>Criação do arquivo</td>
          <td><a href="https://github.com/HeBatalha" target="_blank">Henrique Batalha</a></td>
          <td><a href="" target="_blank"></a></td>
        </tr>
      </tbody>
    </table>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela criada por <a href="https://github.com/The-Boss-Nina" target="_blank">SOUZA, Marina</a>. 2024.</em>
    </p>
  </div>
</body>
</html>
