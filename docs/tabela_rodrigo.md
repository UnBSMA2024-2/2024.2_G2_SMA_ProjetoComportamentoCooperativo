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

/_ Alteração para o modo escuro _/
@media (prefers-color-scheme: dark) {
.tabela-alunos thead th {
color: #888; /_ Cor cinza apenas para os títulos no modo escuro _/
}
}

    /* Espaçamento adicional para textos abaixo das tabelas */
    .section-text {
      margin-top: 20px;
    }

  </style>
</head>
<body>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Pesquisa Bibliográfica</h1>

  <h6 align="center">Tabela 01: Pesquisa Bibliográfica de Rodrigo</h6>
  <div style="text-align: center;">
    <table>
      <thead>
        <tr>
          <th>#</th>
          <th>Etapa</th>
          <th>Descrição</th>
          <th>Exemplo</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>Estabelecer o Tema</td>
          <td>Defina o foco principal da pesquisa.</td>
          <td>Sistemas Multiagentes Comportamentais</td>
        </tr>
        <tr>
          <td>2</td>
          <td>Especificar uma Questão de Pesquisa</td>
          <td>Elabore uma pergunta que guiará a investigação.</td>
          <td></td>
        </tr>
        <tr>
          <td>3</td>
          <td>Identificar Palavras-chave</td>
          <td>Liste os termos mais relevantes para busca.</td>
          <td> 
            <h6 align="center">pt-br:</h6>
            <p align="center">Sistema Multiagentes, Sistema Multiagentes Comportamental, Comportamento, Características, Drone, Entrega, Navegação, Coleta e entrega em multiagentes</p>
            <h6 align="center">en:</h6>
            <p align="center">Software Agent, Multiagent System, Behavioral Multiagent System, Behavior, Features, Drones, Delivery, Navigation, Multi-Agent Pickup-and-Delivery</p>
            </td>
          </tr>
        <tr>
          <td>4</td>
          <td>Identificar Autores Relevantes</td>
          <td>Pesquise os principais especialistas na área.</td>
          <td></td>
        </tr>
        <tr>
          <td>5</td>
          <td>Estabelecer Strings de Busca</td>
          <td>Monte combinações de palavras-chave.</td>
          <td>
              <p>Behavioral Multiagent System</p>
              <p>multi agent delivery</p>
              <p>multiagentes + drone + monitoramento</p>
          </td>
        </tr>
        <tr>
          <td>6</td>
          <td>Escolher Bases Científicas</td>
          <td>Selecione as bases onde realizará as buscas.</td>
          <td>Google Scholar</td>
        </tr>
        <tr>
          <td>7</td>
          <td>Realizar as Buscas</td>
          <td>Execute as buscas utilizando as strings.</td>
          <td></td>
        </tr>
        <tr>
          <td>8</td>
          <td>Manter Rastreabilidade</td>
          <td>Registre base consultada, strings e filtros aplicados.</td>
          <td>
            <p>Google Scholar, Behavioral Multiagent System - 88.100 resultados</p>
            <p>Google Scholar, multi agent delivery - 2.740.000 resultados</p>
            <p>Google Scholar, multiagentes + drone + monitoramento - 47 resultados</p>
          </td>
        </tr>
        <tr>
          <td>9</td>
          <td>Estabelecer Critérios de Inclusão</td>
          <td>Defina critérios para selecionar referências.</td>
          <td>Mencionar drones, multiagentes, estar dentro das 5 primeiras paginas do Google Scholar</td>
        </tr>
        <tr>
          <td>10</td>
          <td>Estabelecer Critérios de Exclusão</td>
          <td>Defina critérios para descartar referências irrelevantes.</td>
          <td>Fuga do tema, sem relação a drones</td>
        </tr>
        <tr>
          <td>11</td>
          <td>Aplicar Critérios</td>
          <td>Filtre as referências com base nos critérios.</td>
          <td>Selecionadas: 15, Excluídas: 5</td>
        </tr>
        <tr>
          <td>12</td>
          <td>Ler Resumos</td>
          <td>Leia e refine a seleção das referências.</td>
          <td>Mantidas: 10, Descartadas: 5</td>
        </tr>
        <tr>
          <td>13</td>
          <td>Apresentar Referências Finais</td>
          <td>Compile e apresente as referências selecionadas.</td>
          <td>
              <p>SYCARA, K. P. Multiagent Systems . AI Magazine, [S. l.], v. 19, n. 2, p. 79, 1998. DOI: 10.1609/aimag.v19i2.1370. Disponível em: https://ojs.aaai.org/aimagazine/index.php/aimagazine/article/view/1370. Acesso em: 24 nov. 2024</p>
              <p>SALZMAN, Oren; STERN, Roni. Research challenges and opportunities in multi-agent path finding and multi-agent pickup and delivery problems. In: Proceedings of the 19th International Conference on Autonomous Agents and MultiAgent Systems. 2020. p. 1711-1715.</p>
              <p>MA, Hang et al. Lifelong multi-agent path finding for online pickup and delivery tasks. arXiv preprint arXiv:1705.10868, 2017.</p>
              <p>LIU, Minghua et al. Task and path planning for multi-agent pickup and delivery. In: Proceedings of the International Joint Conference on Autonomous Agents and Multiagent Systems (AAMAS). 2019.</p>
              <p>CHAVES, Áquila Neves. Proposta de modelo de veículos aéreos não tripulados (VANTs) cooperativos aplicados a operações de busca. 2013. Tese de Doutorado. Universidade de São Paulo.</p>
          </td>
        </tr>
      </tbody>
    </table>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela criada por <a href="https://github.com/The-Boss-Nina" target="_blank">SOUZA, Marina</a>. 2024.</em>
    </p>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela editada por <a href="https://github.com/rodrigoFAmaral" target="_blank">AMARAL, Rodrigo</a>. 2024.</em>
    </p>
  </div>

  <h1 style="font-weight: bold; margin-bottom: 10px;">Introdução</h1>
  <p align="justify">
    &emsp;&emsp;A evolução da logística impulsionada por tecnologias emergentes tem possibilitado soluções inovadoras, como o uso de drones para entrega de produtos. Esse modelo é viabilizado por sistemas multiagentes (MASs) e por técnicas como Multi-Agent Path Finding (MAPF) e Multi-Agent Pickup and Delivery (MAPD), que coordenam rotas e tarefas em ambientes dinâmicos. Este estudo explora como essas abordagens podem ser aplicadas, destacando métodos de funcionamento e vantagens no contexto urbano.
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Funcionamento do sistema</h1>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;1. Drones como Agentes Autônomos
  </p>
  <p align="justify">
    &emsp;&emsp;Cada drone é modelado como um agente no sistema, equipado com capacidades para navegar, coletar e entregar pacotes. Por meio de MASs, esses agentes podem colaborar de maneira descentralizada, adaptando-se a condições variáveis, como tráfego aéreo e novas demandas de entrega
  </p>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;2. Planejamento e Execução (MAPF e MAPD)
  </p>
  <p align="justify">
    &emsp;&emsp;O MAPF resolve o problema de coordenação das rotas de múltiplos drones para evitar colisões enquanto otimiza tempo e energia. Já o MAPD expande essa abordagem, integrando coleta e entrega dinâmicas de pacotes. Algoritmos como "Token Passing" permitem que tarefas sejam distribuídas de forma eficiente, garantindo a escalabilidade do sistema
  </p>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;3. Sistemas Multiagentes Comportamentais
  </p>
  <p align="justify">
    &emsp;&emsp;A combinação de agentes reativos e deliberativos em arquiteturas híbridas permite aos drones responder rapidamente a mudanças, como obstáculos ou alterações climáticas. Essas capacidades são fundamentais para a robustez do sistema em ambientes urbanos densos
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Aplicações no Contexto Real</h1>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;1. Logística Urbana
  </p>
  <p align="justify">
    &emsp;&emsp;Drones podem operar em sinergia com infraestruturas terrestres, entregando pacotes leves de forma rápida e com baixo custo. Além disso, o sistema MAS permite a inclusão de novos drones e rotas sem comprometer a eficiência geral.
  </p>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;2. Gestão de Recursos Dinâmicos
  </p>
  <p align="justify">
    &emsp;&emsp;O MAS facilita o gerenciamento de recursos limitados, como baterias e estações de recarga. Protocolos como o Contract Net Protocol (CNP) promovem negociações entre drones para distribuição otimizada de tarefas​
  </p>
  <p align="justify" style="font-weight: bold">
    &emsp;&emsp;3. Sustentabilidade e Eficiência
  </p>
  <p align="justify">
    &emsp;&emsp;O uso de drones reduz emissões de carbono, enquanto os algoritmos MAPD minimizam trajetos desnecessários. Essa abordagem se alinha com metas de sustentabilidade ambiental em sistemas logísticos modernos
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Conclusão</h1>
  <p align="justify">
    &emsp;&emsp;O uso de drones em sistemas de entrega, fundamentado em MASs e tecnologias como MAPF e MAPD, oferece um modelo viável, eficiente e escalável para atender demandas logísticas crescentes. Investimentos em regulamentação e infraestrutura serão cruciais para maximizar o potencial dessa tecnologia, que promete revolucionar o transporte urbano
  </p>

</body>
</html>
