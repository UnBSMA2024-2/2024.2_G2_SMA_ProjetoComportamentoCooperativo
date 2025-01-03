import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import jade.core.behaviours.CyclicBehaviour;

public class ControllerAgent extends Agent {
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
        {930, 100}, {940, 100}, {950, 100}, {960, 100}, {970, 100}, {980, 100}
    };

    @Override
    protected void setup() {
        System.out.println("Controlador iniciado.");

        addBehaviour(new CyclicBehaviour() {
            private int stepFeliz = 0;
            private int stepAno = 0;

            @Override
            public void action() {
                if (stepFeliz < positionsFE_LIZ.length) {
                    String droneName = "drone_FE_LIZ" + (stepFeliz + 1);
                    int x = positionsFE_LIZ[stepFeliz][0];
                    int y = positionsFE_LIZ[stepFeliz][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    stepFeliz++;
                    block(200); // Reduzido para maior fluidez
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
