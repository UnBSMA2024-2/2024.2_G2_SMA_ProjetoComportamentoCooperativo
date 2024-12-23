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

            // Cria os drones necessários para a formação da letra A
            int totalDrones = 13; // Total ajustado de drones necessários
            for (int i = 1; i <= totalDrones; i++) {
                mainContainer.createNewAgent("drone_A" + i, "DroneAgent", new Object[]{simulation}).start();
            }

            // Cria o controlador
            mainContainer.createNewAgent("controller", "ControllerAgent", null).start();

            System.out.println("JADE iniciado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}