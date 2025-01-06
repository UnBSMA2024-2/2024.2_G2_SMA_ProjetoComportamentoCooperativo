import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.*;

public class Simulation extends JFrame {
    private final Map<String, Point> dronePositions = new HashMap<>();
    private final Map<String, Color> droneColors = new HashMap<>(); // Armazena as cores de cada drone
    private static final int DRONE_SIZE = 8; // Ajustado para visibilidade
    private final Random random = new Random();
    private final Color[] colors = {
            Color.DARK_GRAY, Color.BLUE, Color.CYAN,
            Color.GREEN, Color.MAGENTA, Color.PINK, Color.ORANGE
    };

    public Simulation() {
        setTitle("Simulação de Drones");
        setSize(1140, 600); // Ajuste para comportar as letras
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);

        // Configura um Timer para alternar as cores dos drones a cada 1000ms
        Timer colorTimer = new Timer(1000, e -> {
            updateDroneColors();
            repaint();
        });
        colorTimer.start();
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
        // Inicializa com uma cor aleatória, se ainda não existir
        droneColors.putIfAbsent(droneName, colors[random.nextInt(colors.length)]);
        repaint();
    }

    /**
     * Atualiza as cores de todos os drones para uma nova cor aleatória.
     */
    private synchronized void updateDroneColors() {
        for (String droneName : dronePositions.keySet()) {
            droneColors.put(droneName, colors[random.nextInt(colors.length)]);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK); // Fundo branco
        g.fillRect(0, 0, getWidth(), getHeight());

        synchronized (dronePositions) {
            for (Map.Entry<String, Point> entry : dronePositions.entrySet()) {
                Point position = entry.getValue();
                String droneName = entry.getKey();

                // Obtém a cor atual do drone
                g.setColor(droneColors.getOrDefault(droneName, Color.BLACK));
                g.fillOval(position.x, position.y, DRONE_SIZE, DRONE_SIZE);
            }
        }
    }

}


