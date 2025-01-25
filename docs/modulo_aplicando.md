<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Módulo Aplicando</title>
  <style>
    /* Estilo geral para as tabelas */
    table {
      margin: 0 auto;
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
      color: #000;
    }

    /* Alteração para o modo escuro */
    @media (prefers-color-scheme: dark) {
      thead th {
        color: #888;
      }
    }

    /* Espaçamento adicional para textos abaixo das tabelas */
    .section-text {
      margin-top: 20px;
    }

    /* Estilo para o vídeo */
    .video-container {
      text-align: center;
      margin-top: 30px;
    }
  </style>
</head>
<body>
  <h1 align="center"><strong>Módulo Aplicando</strong></h1>

  <h1 style="font-weight: bold; margin-bottom: 10px;">Introdução</h1>
  <p align="justify">
    &emsp;&emsp; Este projeto foi desenvolvido como parte do <em>Módulo Aplicando</em> e tem como objetivo explorar o potencial de Sistemas Multiagentes na coordenação de drones em cenários dinâmicos. Utilizando o framework JADE, a equipe projetou um sistema capaz de realizar formações coordenadas, animações e ajustes em tempo real, simulados em uma interface gráfica interativa.
  </p>
  <p align="justify">
    &emsp;&emsp; O sistema inclui diversos desafios, como a comunicação eficiente entre agentes, a sincronização de movimentos e a adaptação a falhas ou mudanças no ambiente. A implementação foi orientada por cenários práticos, como a formação de palavras e números e efeitos visuais, como fogos de artifício e estrelas.
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Objetivo</h1>
  <p align="justify">
    &emsp;&emsp; O principal objetivo do projeto foi criar uma solução prática para a coordenação de drones em missões colaborativas, integrando técnicas de Sistemas Multiagentes com simulação gráfica em tempo real. A proposta incluiu não apenas a implementação de algoritmos de coordenação, mas também o desenvolvimento de uma interface visual que demonstrasse a aplicabilidade do sistema em cenários reais.
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 20px;">Descrição do Sistema</h1>
  <p align="justify">
    &emsp;&emsp; O sistema desenvolvido consiste em agentes distribuídos representando drones, e uma interface gráfica que exibe as formações. A comunicação entre os drones é gerenciada pelo framework JADE, que permite a troca de mensagens entre agentes para coordenar seus movimentos.
  </p>
  <p align="justify">
    &emsp;&emsp; A simulação engloba:
  </p>
  <ul style="margin-left: 20px;">
    <li>Formações coordenadas, como letras e números.</li>
    <li>Animações dinâmicas, incluindo fogos de artifício e estrelas.</li>
    <li>Adaptação em tempo real a mudanças ou falhas, como reposicionamento de drones.</li>
    <li>Alternância de cores nos drones, criando efeitos visuais atrativos.</li>
  </ul>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 20px;">Metodologia</h1>
  <p align="justify">
    &emsp;&emsp; O desenvolvimento do projeto foi realizado seguindo as seguintes etapas:
  </p>
  <ol>
    <li><strong>Planejamento:</strong> Definição dos objetivos e do escopo do sistema, incluindo as formações e animações desejadas.</li>
    <li><strong>Desenvolvimento:</strong> Implementação dos agentes, utilizando o framework JADE para gerenciar a comunicação.</li>
    <li><strong>Simulação:</strong> Criação de uma interface gráfica para exibir as formações e testar os algoritmos.</li>
    <li><strong>Teste e Ajustes:</strong> Validação do sistema em cenários simulados, corrigindo falhas e otimizando a coordenação dos drones.</li>
  </ol>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 20px;">Resultados</h1>
  <p align="justify">
    &emsp;&emsp; O sistema atingiu os objetivos propostos, demonstrando a eficácia de Sistemas Multiagentes na coordenação de drones. Os resultados incluem:
  </p>
  <ul>
    <li>Formações precisas e sincronizadas, exibidas na simulação gráfica.</li>
    <li>Animações dinâmicas, como fogos de artifício e alternância de cores, aumentando o impacto visual.</li>
    <li>Capacidade de adaptação a mudanças no ambiente, como falhas simuladas nos drones.</li>
    <li>Integração bem-sucedida entre os agentes JADE e a interface gráfica Swing.</li>
  </ul>

  <h6 align="center">Tabela 01: Resultados Esperados</h6>
  <div style="text-align: center;">
    <table class="tabela-resultados">
      <thead>
        <tr>
          <th>Etapa</th>
          <th>Descrição</th>
          <th>Resultado Esperado</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1. Planejamento</td>
          <td>Definição do problema e design inicial do sistema.</td>
          <td>Proposta documentada no Moodle e GitHub.</td>
        </tr>
        <tr>
          <td>2. Desenvolvimento</td>
          <td>Implementação do sistema multiagente para formação de drones.</td>
          <td>Código funcional documentado no GitHub.</td>
        </tr>
        <tr>
          <td>3. Testes</td>
          <td>Simulações em cenários controlados e análise de resultados.</td>
          <td>Relatórios detalhados sobre desempenho e ajustes.</td>
        </tr>
        <tr>
          <td>4. Apresentação</td>
          <td>Exposição dos resultados obtidos e desafios enfrentados.</td>
          <td>Slides e demonstrações práticas em sala de aula.</td>
        </tr>
      </tbody>
    </table>
  </div>


  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Simulação do Algoritmo</h1>
  <p align="justify">
    &emsp;&emsp; A seguir, apresentamos um vídeo que demonstra o funcionamento do algoritmo desenvolvido durante o módulo. A simulação foi realizada utilizando o framework JADE, e ilustra a formação coordenada dos drones, mostrando como a comunicação e a adaptação a mudanças no ambiente foram implementadas.
  </p>
  <div class="video-container">
    <iframe width="560" height="315" src="https://www.youtube.com/embed/NDC42u8LhFw" 
            title="YouTube video player" frameborder="0" 
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
            allowfullscreen>
    </iframe>
  </div>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Histórico de Versão</h1>
  <p align="justify" class="section-text">
    A Tabela 02 representa o histórico de versão do documento.
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
          <td>1.0</td>
          <td>03/01/2025</td>
          <td>Criação do arquivo.</td>
          <td><a href="https://github.com/The-Boss-Nina" target="_blank">Marina Márcia Costa de Souza</a></td>
          <td><a href="https://github.com/rodrigoFAmaral" target="_blank">Rodrigo Ferreira do Amaral</a></td>
        </tr>
        <tr>
          <td>1.1</td>
          <td>04/01/2025</td>
          <td>Adicionando introdução, objetivo e espaço para inserir o vídeo.</td>
          <td><a href="https://github.com/EduardaSMarques" target="_blank">Maria Eduarda dos Santos Marques</a></td>
          <td><a href="https://github.com/IsaqueSH" target="_blank">Isaque Santos</a></td>
        </tr>
        <tr>
          <td>1.2</td>
          <td>05/01/2025</td>
          <td> Corrigindo introdução e objetivo, retirando tópicos e acrescentando tópicos restantes</td>
          <td><a href="https://github.com/EduardaSMarques" target="_blank">Maria Eduarda dos Santos Marques</a></td>
          <td><a href="https://github.com/IsaqueSH" target="_blank">Isaque Santos</a></td>
        </tr>
      </tbody>
    </table>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela criada por <a href="https://github.com/The-Boss-Nina" target="_blank">SOUZA, Marina</a>. 2025.</em>
    </p>
  </div>
</body>
</html>
