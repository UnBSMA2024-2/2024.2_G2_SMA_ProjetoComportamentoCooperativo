import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Simulation extends JFrame {
    private final Map<String, Point> dronePositions = new HashMap<>();
    private boolean isFireworksPhase = false; // Controle para alternar cores na fase de fogos
    private static final int DRONE_SIZE = 8;

    public Simulation() {
        setTitle("Simulação de Drones");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Atualiza a posição de um drone na simulação.
     *
     * @param droneName Nome do drone.
     * @param x         Coordenada X.
     * @param y         Coordenada Y.
     */
    public synchronized void updateDronePosition(String droneName, int x, int y) {
        dronePositions.put(droneName, new Point(x, y));
        repaint();
    }

    /**
     * Sinaliza o início da fase de fogos de artifício.
     */
    public void startFireworks() {
        isFireworksPhase = true;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        synchronized (dronePositions) {
            for (Map.Entry<String, Point> entry : dronePositions.entrySet()) {
                Point position = entry.getValue();
                String droneName = entry.getKey();

                // Escolhe a cor com base no estado atual
                if (isFireworksPhase && droneName.startsWith("drone_firework")) {
                    // Alterna as cores para os fogos
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Cor aleatória
                } else {
                    // Mantém azul para a formação da letra "A"
                    g.setColor(Color.BLUE);
                }

                g.fillOval(position.x, position.y, DRONE_SIZE, DRONE_SIZE);
            }
        }
    }
}