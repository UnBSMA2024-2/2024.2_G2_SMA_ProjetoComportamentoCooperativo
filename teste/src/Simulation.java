import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Simulation extends JFrame {
    private final Map<String, Point> dronePositions = new HashMap<>();
    private static final int DRONE_SIZE = 8; // Tamanho reduzido dos drones

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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE); // Cor dos drones
        synchronized (dronePositions) {
            for (Map.Entry<String, Point> entry : dronePositions.entrySet()) {
                Point position = entry.getValue();
                g.fillOval(position.x, position.y, DRONE_SIZE, DRONE_SIZE); // Representa o drone como um círculo
                // g.drawString(entry.getKey(), position.x + 15, position.y + 5); // Nome do drone (removido)
            }
        }
    }
}