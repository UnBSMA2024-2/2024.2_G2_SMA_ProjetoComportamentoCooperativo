<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Módulo Aplicando</title>
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
      .tabela-resultados thead th {
        color: #888; /* Cor cinza apenas para os títulos no modo escuro */
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
  &emsp;&emsp; O Módulo Aplicando focou na implementação prática de conceitos relacionados a sistemas multiagentes, com ênfase na formação coordenada de drones. O grupo desenvolveu algoritmos para enfrentar desafios como comunicação, sincronização e adaptação a ambientes dinâmicos, utilizando o framework JADE para simular o comportamento dos agentes e testar diferentes formações.
  </p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Objetivo</h1>
  <p align="justify">
    &emsp;&emsp; O principal objetivo deste módulo foi implementar uma solução de controle coletivo de drones, usando técnicas de sistemas multiagentes, para explorar como drones podem cooperar de forma autônoma em diversas situações. A equipe se concentrou em desenvolver algoritmos que garantissem a eficiência nas formações dos drones, considerando a interação entre eles e as mudanças no ambiente.
</p>

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Resultados Esperados</h1>
  <ul style="text-align: justify; margin-left: 20px;">
    <li>Implementação de sistemas de formação de drones em SMA.</li>
    <li>Entregas documentadas via Tarefa no Moodle.</li>
    <li>Manutenção de repositórios no GitHub, seguindo o template da disciplina.</li>
    <li>Apresentações dos resultados e desafios enfrentados em sala de aula.</li>
  </ul>

  <h2 style="font-weight: bold; margin-top: 30px; margin-bottom: 20px;">Focos do Módulo</h2>
  <ol style="text-align: justify; margin-left: 20px;">
    <li>Desenvolvimento de algoritmos para formação de drones baseados em SMA.</li>
    <li>Trabalho colaborativo em equipe para implementar soluções.</li>
    <li>Avaliação de desempenho em diferentes cenários simulados.</li>
  </ol>

  <h2 style="font-weight: bold; margin-top: 30px; margin-bottom: 20px;">Cenário de Uso - Formação de Drones</h2>
  <p align="justify">
    &emsp;&emsp; O cenário abordado neste módulo envolve a formação coordenada de drones para missões específicas, como patrulha, busca e resgate, ou logística urbana. O objetivo é programar os drones para se organizarem em diferentes formações (ex.: linha, triângulo, círculo) enquanto lidam com obstáculos e mudanças no ambiente.
  </p>
  <ul style="margin-left: 20px;">
    <li>Os drones devem comunicar-se entre si para ajustar sua posição em tempo real.</li>
    <li>Os agentes devem reagir a falhas (ex.: perda de comunicação ou bateria baixa).</li>
    <li>As formações devem ser otimizadas para garantir eficiência e cobertura total do espaço.</li>
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
      &emsp;&emsp; A seguir, apresentamos um vídeo que demonstra o funcionamento do algoritmo desenvolvido durante o módulo. A simulação foi realizada utilizando o framework JADE, e ilustra a formação coordenada dos drones em diferentes cenários, mostrando como a comunicação e a adaptação a mudanças no ambiente foram implementadas.
    </p>
    <div style="text-align: center;">
    <iframe width="560" height="315" src=" link do vídeo" 
            title="YouTube video player" frameborder="0" 
            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" 
            referrerpolicy="strict-origin-when-cross-origin" allowfullscreen>
    </iframe>
    </div>
    

  <h1 style="font-weight: bold; margin-top: 30px; margin-bottom: 10px;">Histórico de Versão</h1>
  <p align="justify" class="section-text">
    A Tabela (00) representa o histórico de versão do documento.
  </p>

  <h6 align="center">Tabela (00): Histórico de Versão</h6>
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
      </tbody>
    </table>
    <p style="margin-top: 10px; text-align: center;">
      <em>Tabela criada por <a href="https://github.com/The-Boss-Nina" target="_blank">SOUZA, Marina</a>. 2025.</em>
    </p>
  </div>
</body>
</html>

