import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Simulation extends JFrame {
    private final Map<String, Point> dronePositions = new HashMap<>();
    private static final int DRONE_SIZE = 8; // Ajustado para visibilidade

    public Simulation() {
        setTitle("Simulação de Drones");
        setSize(1000, 600); // Ajuste para comportar as letras
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
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
        System.out.println("Atualizando posição: " + droneName + " para (" + x + ", " + y + ")");
        dronePositions.put(droneName, new Point(x, y));
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE); // Fundo branco
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE); // Cor dos drones
        synchronized (dronePositions) {
            for (Map.Entry<String, Point> entry : dronePositions.entrySet()) {
                Point position = entry.getValue();
                g.fillOval(position.x, position.y, DRONE_SIZE, DRONE_SIZE);
            }
        }
    }
}
