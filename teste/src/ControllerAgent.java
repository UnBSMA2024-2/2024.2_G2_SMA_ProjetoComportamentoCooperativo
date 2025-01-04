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
        {530, 450}, {520, 460}, {510, 470}, {500, 480}, {490, 490},
    };
    
    private boolean fireworksStarted = false;

    @Override
    protected void setup() {
        System.out.println("Controlador iniciado.");
        Simulation simulation = new Simulation(); // Instancia a simulação

        addBehaviour(new CyclicBehaviour() {
            private int step = 0;

            @Override
            public void action() {
                if (!fireworksStarted && step < positionsA.length) {
                    // Movendo drones para a formação da letra A
                    String droneName = "drone_A" + (step + 1);
                    int x = positionsA[step][0];
                    int y = positionsA[step][1];

                    sendMoveCommand(droneName, x, y);
                    simulation.updateDronePosition(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    step++;
                    block(500); // Aguarda 0.5 segundos antes de mover o próximo drone
                } else if (!fireworksStarted) {
                    // Inicia a formação de fogos de artifício
                    System.out.println("Formação da letra A concluída. Iniciando fogos de artifício.");
                    fireworksStarted = true;
                    step = 0; // Reinicia o contador para a formação dos fogos
                    simulation.startFireworks(); // Sinaliza para a simulação o início dos fogos
                } else if (fireworksStarted && step < positionsFireworks.length) {
                    // Movendo drones para a formação de fogos de artifício
                    String droneName = "drone_firework" + (step + 1);
                    int x = positionsFireworks[step][0];
                    int y = positionsFireworks[step][1];

                    sendMoveCommand(droneName, x, y);
                    simulation.updateDronePosition(droneName, x, y);
                    System.out.println("Movendo " + droneName + " para (" + x + ", " + y + ")");
                    step++;
                    block(500); // Aguarda 0.5 segundos antes de mover o próximo drone
                } else {
                    System.out.println("Formação de fogos concluída.");
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