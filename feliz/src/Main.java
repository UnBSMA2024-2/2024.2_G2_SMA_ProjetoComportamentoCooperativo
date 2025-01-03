import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class Main {
    public static void main(String[] args) {
        Runtime rt = Runtime.instance();
        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.GUI, "true");

        try {
            AgentContainer mainContainer = rt.createMainContainer(profile);
            System.out.println("Container principal criado com sucesso!");

            // Instancia a simulação
            Simulation simulation = new Simulation();

            // Cria os drones necessários para a formação das letras F, E, L, I, Z
            int totalDrones = 100; // Ajustado para acomodar o maior número de drones necessário para o Z
            for (int i = 1; i <= totalDrones; i++) {
                mainContainer.createNewAgent("drone_FE_LIZ" + i, "DroneAgent", new Object[]{simulation}).start();
            }

            // Cria o controlador
            mainContainer.createNewAgent("controller", "ControllerAgent", null).start();

            System.out.println("JADE iniciado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
