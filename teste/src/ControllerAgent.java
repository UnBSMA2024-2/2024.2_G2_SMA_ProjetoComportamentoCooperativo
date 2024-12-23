import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import jade.core.behaviours.CyclicBehaviour;

public class ControllerAgent extends Agent {
    private final int[][] positionsA = {
        // Contorno da letra A
        {200, 100}, // Topo
        {190, 120}, {210, 120}, // Parte superior das linhas inclinadas
        {180, 140}, {220, 140}, // Parte intermediária das linhas inclinadas
        {170, 160}, {230, 160}, // Parte inferior das linhas inclinadas
        {160, 180}, {240, 180}, // Base das linhas inclinadas

        // Travessão central ajustado com espaçamento maior
        {185, 150}, {195, 150}, {205, 150}, {215, 150}
    };

    @Override
    protected void setup() {
        System.out.println("Controlador iniciado.");

        addBehaviour(new CyclicBehaviour() {
            private int step = 0;

            @Override
            public void action() {
                if (step < positionsA.length) {
                    String droneName = "drone_A" + (step + 1);
                    int x = positionsA[step][0];
                    int y = positionsA[step][1];

                    sendMoveCommand(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    step++;
                    block(500); // Aguarda 0.5 segundos antes de mover o próximo drone
                } else {
                    System.out.println("Formação da letra A concluída.");
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