import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class Simulation extends JFrame {
    private final Map<String, Point> dronePositions = new HashMap<>();
    private static final int DRONE_SIZE = 8; // Ajustado para visibilidade
    private boolean toggleVisibility = true; // Controla se os drones estão visíveis

    public Simulation() {
        setTitle("Simulação de Drones");
        setSize(1140, 600); // Ajuste para comportar as letras
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);

        // Configura um Timer para alternar a visibilidade dos drones a cada 500ms
        Timer timer = new Timer(500, e -> {
            toggleVisibility = !toggleVisibility;
            repaint();
        });
        timer.start();
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

        if (toggleVisibility) { // Drones visíveis somente se toggleVisibility for true
            synchronized (dronePositions) {
                for (Map.Entry<String, Point> entry : dronePositions.entrySet()) {
                    Point position = entry.getValue();
                    String droneName = entry.getKey();

                    // Escolhe a cor com base no estado atual
                    if (droneName.startsWith("drone_FIREWORK")) {
                        // Alterna as cores para os fogos
                        g.setColor(new Color((int) (Math.random() * 0x1000000))); // Cor aleatória
                    } else {
                        // Mantém azul para a formação da letra
                        g.setColor(Color.BLUE);
                    }

                    g.fillOval(position.x, position.y, DRONE_SIZE, DRONE_SIZE);
                }
            }
        }
    }
}

