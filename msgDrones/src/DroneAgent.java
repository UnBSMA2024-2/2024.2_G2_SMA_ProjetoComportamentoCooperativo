import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class DroneAgent extends Agent {
    private int x = 540, y = 300; // Coordenadas iniciais do drone
    private Simulation simulation;

    @Override
    protected void setup() {
        System.out.println("Drone " + getLocalName() + " foi iniciado.");

        // Recebe a instância da simulação passada como argumento
        Object[] args = getArguments();
        if (args != null && args.length > 0) {
            simulation = (Simulation) args[0];
        }

        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = receive();
                if (msg != null) {
                    String content = msg.getContent();
                    if (content.startsWith("MOVE")) {
                        String[] parts = content.split(" ");
                        int targetX = Integer.parseInt(parts[1]);
                        int targetY = Integer.parseInt(parts[2]);

                        // Simula o movimento gradual do drone
                        while (x != targetX || y != targetY) {
                            if (x < targetX) x++;
                            else if (x > targetX) x--;

                            if (y < targetY) y++;
                            else if (y > targetY) y--;

                            if (simulation != null) {
                                simulation.updateDronePosition(getLocalName(), x, y);
                            }

                            try {
                                Thread.sleep(5); // Reduzido para tornar o movimento mais suave
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(getLocalName() + " chegou em (" + x + ", " + y + ")");
                    }
                } else {
                    block();
                }
            }
        });
    }
}
