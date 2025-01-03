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

    @Override
    protected void setup() {
        System.out.println("Controlador iniciado.");

        addBehaviour(new CyclicBehaviour() {
            private int step = 0;

            @Override
            public void action() {
                if (step < positionsFE_LIZ.length) {
                    String droneName = "drone_FE_LIZ" + (step + 1);
                    int x = positionsFE_LIZ[step][0];
                    int y = positionsFE_LIZ[step][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    step++;
                    block(200); // Reduzido para maior fluidez
                } else {
                    System.out.println("Formação das letras F, E, L, I, Z concluída.");
                    block(); // Finaliza o comportamento
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
