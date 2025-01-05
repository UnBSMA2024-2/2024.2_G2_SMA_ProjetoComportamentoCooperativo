import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import jade.core.behaviours.CyclicBehaviour;

public class ControllerAgent extends Agent {
    private static final int STEP_DELAY = 200; // Ajustado para visibilidade
    private final int[][] positionsFE_LIZ = {
        // Letra F - 1 cm de espaçamento
        // Linha vertical da letra F
        {100, 100}, {100, 110}, {100, 120}, {100, 130}, {100, 140}, {100, 150}, {100, 160}, {100, 170}, {100, 180},
        // Linha horizontal superior
        {100, 100}, {110, 100}, {120, 100}, {130, 100}, {140, 100}, {150, 100}, {160, 100},
        // Linha horizontal intermediária
        {100, 140}, {110, 140}, {120, 140}, {130, 140}, {140, 140},

        // Letra E - 1 cm de espaçamento
        // Linha vertical da letra E
        {200, 100}, {200, 110}, {200, 120}, {200, 130}, {200, 140}, {200, 150}, {200, 160}, {200, 170}, {200, 180},
        // Linha horizontal superior
        {200, 100}, {210, 100}, {220, 100}, {230, 100}, {240, 100}, {250, 100},
        // Linha horizontal intermediária
        {200, 140}, {210, 140}, {220, 140}, {230, 140},
        // Linha horizontal inferior
        {200, 180}, {210, 180}, {220, 180}, {230, 180}, {240, 180}, {250, 180},

        // Letra L - 1 cm de espaçamento
        // Linha vertical da letra L
        {300, 100}, {300, 110}, {300, 120}, {300, 130}, {300, 140}, {300, 150}, {300, 160}, {300, 170}, {300, 180},
        // Linha horizontal inferior
        {300, 180}, {310, 180}, {320, 180}, {330, 180}, {340, 180},

        // Letra I - 1 cm de espaçamento
        // Linha vertical da letra I
        {400, 100}, {400, 110}, {400, 120}, {400, 130}, {400, 140}, {400, 150}, {400, 160}, {400, 170}, {400, 180},

        // Letra Z - 1 cm de espaçamento ajustado para maior proximidade com a letra I
        // Linha superior
        {470, 100}, {480, 100}, {490, 100}, {500, 100}, {510, 100}, {520, 100}, {530, 100},
        // Linha diagonal (completada)
        {530, 110}, {520, 120}, {510, 130}, {500, 140}, {490, 150}, {480, 160}, {470, 170},
        // Linha inferior
        {470, 180}, {480, 180}, {490, 180}, {500, 180}, {510, 180}, {520, 180}, {530, 180}        

    }; 
    private final int[][] positionsAno = {
        // INICIO do 2025
        // Numero 2
        // Linha horizontal inferior
        {630, 180}, {640, 180}, {650, 180}, {660, 180}, {670, 180}, {680, 180},
        // Linha vertical inferior
        {630, 170}, {630, 160}, {630, 150},
        // Linha horizontal do meio
        {630, 140}, {640, 140}, {650, 140}, {660, 140}, {670, 140}, {680, 140},
        // Linha vertical superior
        {680, 130}, {680, 120}, {680, 110},
        // Linha horizontal superior
        {680, 100}, {670, 100}, {660, 100}, {650, 100}, {640, 100}, {630, 100},
        
        // Numero 0
        // Linha horizontal inferior
        {730, 180}, {740, 180}, {750, 180}, {760, 180}, {770, 180}, {780, 180},
        // Linha vertical esquerda
        {730, 170}, {730, 160}, {730, 150}, {730, 140}, {730, 130}, {730, 120}, {730, 110}, {730, 100},
        // Linha vertical direita
        {780, 170}, {780, 160}, {780, 150}, {780, 140}, {780, 130}, {780, 120}, {780, 110}, {780, 100},
        // Linha horizontal superior
        {730, 100}, {740, 100}, {750, 100}, {760, 100}, {770, 100}, {780, 100},

        // Numero 2
        // Linha horizontal inferior
        {830, 180}, {840, 180}, {850, 180}, {860, 180}, {870, 180}, {880, 180},
        // Linha vertical inferior
        {830, 170}, {830, 160}, {830, 150},
        // Linha horizontal do meio
        {830, 140}, {840, 140}, {850, 140}, {860, 140}, {870, 140}, {880, 140},
        // Linha vertical superior
        {880, 130}, {880, 120}, {880, 110},
        // Linha horizontal superior
        {880, 100}, {870, 100}, {860, 100}, {850, 100}, {840, 100}, {830, 100},

        // Numero 5
        // Linha horizontal inferior
        {930, 180}, {940, 180}, {950, 180}, {960, 180}, {970, 180}, {980, 180},
        // Linha vertical inferior
        {980, 170}, {980, 160}, {980, 150},
        // Linha horizontal do meio
        {930, 140}, {940, 140}, {950, 140}, {960, 140}, {970, 140}, {980, 140},
        // Linha vertical superior
        {930, 130}, {930, 120}, {930, 110},
        // Linha horizontal superior
        {930, 100}, {940, 100}, {950, 100}, {960, 100}, {970, 100}, {980, 100},

        // Exclamação !
        // Linha vertical
        { 1030, 100 }, { 1030, 110 }, { 1030, 120 }, { 1030, 130 }, { 1030, 140 }, { 1030, 150 }, { 1030, 160 },
        { 1030, 180 }
    };
    private final int[][] positionsFireworks = {
        // Centro
        {540, 440}, 
        // Reta 1 (Longa, direita) 24
        {560, 440}, {580, 440}, {600, 440}, {620, 440}, {640, 440},
        // Reta 2 (Curta, diagonal superior direita)
        {550, 430}, {560, 420}, {570, 410}, {580, 400}, {590, 390},
        // Reta 3 (Longa, esquerda)
        {520, 440}, {500, 440}, {480, 440}, {460, 440},  {440, 440},
        // Reta 4 (Curta, diagonal inferior direita)
        {550, 450}, {560, 460}, {570, 470}, {580, 480}, {590, 490},
        // Reta 5 (Longa, cima)
        {540, 420}, {540, 400}, {540, 380}, {540, 360}, {540, 340},
        // Reta 6 (Curta, diagonal superior esquerda)
        {530, 430}, {520, 420}, {510, 410}, {500, 400}, {490, 390},
        // Reta 7 (Longa, baixo)
        {540, 460}, {540, 480}, {540, 500}, {540, 520}, {540, 540},
        // Reta 8 (Curta, diagonal inferior esqeurda)
        {530, 450}, {520, 460}, {510, 470}, {500, 480}, {490, 490}
    };
    private final int[][] positionsESTRELAS = {
        // Início da formação das estrelas
        // Primeira estrela
        // Lado direito diagonal superior
        { 100, 220 }, { 110, 230 }, { 120, 240 }, { 130, 250 },
        // Lado esquerdo diagonal superior
        { 100, 220 }, { 90, 230 }, { 80, 240 }, { 70, 250 },
        // Reta da direita intermediária
        { 140, 250 }, { 150, 250 }, { 160, 250 }, { 170, 250 }, { 180, 250 },
        // Reta da esquerda intermediária
        { 60, 250 }, { 50, 250 }, { 40, 250 }, { 30, 250 }, { 20, 250 },
        // Lado direito diagonal intermediária
        { 170, 260 }, { 160, 270 }, { 150, 280 },
        // Lado esquerdo diagonal intermediária
        { 30, 260 }, { 40, 270 }, { 50, 280 },
        // Lado direito diagonal inferior
        { 160, 290 }, { 170, 300 }, { 180, 310 },
        // Lado esquerdo diagonal inferior
        { 40, 290 }, { 30, 300 }, { 20, 310 },
        // Reta inferior esquerda
        { 30, 310 }, { 40, 310 }, { 50, 310 }, { 60, 310 }, { 70, 310 },
        // Reta inferior direita
        { 170, 310 }, { 160, 310 }, { 150, 310 }, { 140, 310 }, { 130, 310 },
        // Diagonal da esquerda da ponta de baixo
        { 80, 320 }, { 90, 330 }, { 100, 340 },
        // Diagonal da direita da ponta de baixo
        { 120, 320 }, { 110, 330 },
        // Segunda estrela
        // Lado direito diagonal superior
        { 1030, 220 }, { 1040, 230 }, { 1050, 240 }, { 1060, 250 },
        // Lado esquerdo diagonal superior
        { 1030, 220 }, { 1020, 230 }, { 1010, 240 }, { 1000, 250 },
        // Reta da direita intermediária
        { 1070, 250 }, { 1080, 250 }, { 1090, 250 }, { 1100, 250 }, { 1110, 250 },
        // Reta da esquerda intermediária
        { 990, 250 }, { 980, 250 }, { 970, 250 }, { 960, 250 }, { 950, 250 },
        // Lado direito diagonal intermediária
        { 1100, 260 }, { 1090, 270 }, { 1080, 280 },
        // Lado esquerdo diagonal intermediária
        { 960, 260 }, { 970, 270 }, { 980, 280 },
        // Lado direito diagonal inferior
        { 1090, 290 }, { 1100, 300 }, { 1110, 310 },
        // Lado esquerdo diagonal inferior
        { 970, 290 }, { 960, 300 }, { 950, 310 },
        // Reta inferior esquerda
        { 960, 310 }, { 970, 310 }, { 980, 310 }, { 990, 310 }, { 1000, 310 },
        // Reta inferior direita
        { 1100, 310 }, { 1090, 310 }, { 1080, 310 }, { 1070, 310 }, { 1060, 310 },
        // Diagonal da esquerda da ponta de baixo
        { 1010, 320 }, { 1020, 330 }, { 1030, 340 },
        // Diagonal da direita da ponta de baixo
        { 1050, 320 }, { 1040, 330 },
    };

    @Override
    protected void setup() {
        System.out.println("Controlador iniciado.");

        addBehaviour(new CyclicBehaviour() {
            private int stepFeliz = 0;
            private int stepAno = 0;
            private int stepFirework = 0;
            private int stepEstrelas = 0;

            @Override
            public void action() {
                if (stepFeliz < positionsFE_LIZ.length) {
                    String droneName = "drone_FE_LIZ" + (stepFeliz + 1);
                    int x = positionsFE_LIZ[stepFeliz][0];
                    int y = positionsFE_LIZ[stepFeliz][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    stepFeliz++;
                    block(STEP_DELAY); // Reduzido para maior fluidez
                } else {
                    System.out.println("Formação das letras F, E, L, I, Z concluída.");
                    block(); // Finaliza o comportamento
                }

                if (stepAno < positionsAno.length) {
                    String droneName = "drone_ANO" + (stepAno + 1);
                    int x = positionsAno[stepAno][0];
                    int y = positionsAno[stepAno][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    stepAno++;
                    block(STEP_DELAY);
                }

                if (stepFirework < positionsFireworks.length) {
                    String droneName = "drone_FIREWORK" + (stepFirework + 1);
                    int x = positionsFireworks[stepFirework][0];
                    int y = positionsFireworks[stepFirework][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    stepFirework++;
                    block(STEP_DELAY);
                }
                if (stepEstrelas < positionsESTRELAS.length) {
                    String droneName = "drone_ESTRELAS" + (stepEstrelas + 1);
                    int x = positionsESTRELAS[stepEstrelas][0];
                    int y = positionsESTRELAS[stepEstrelas][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    stepEstrelas++;
                    block(200);
                }
            }

            private void sendMoveCommand(String droneName, int x, int y) {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new AID(droneName, AID.ISLOCALNAME));
                msg.setContent("MOVE " + x + " " + y);
                send(msg);
            }
        });

    }
}
