import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Créer un circuit
        Circuit circuit = new Circuit();

        // Créer la fenêtre principale pour l'affichage
        MainFrame frame = new MainFrame();
        frame.setTitle("ArchSimul - Simulation de Circuits Logiques");
        frame.setSize(800, 600);  // Taille de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer le contrôleur pour gérer les interactions entre le modèle et la vue
        CircuitController controller = new CircuitController(circuit, frame);

        // Initialiser l'interface graphique (MainFrame)
        frame.initializeUI(controller);

        // Exemple d'ajout de composants et de connexion (vous pouvez le faire dynamiquement dans l'interface)
        // Ajouter un composant AND et un OR
        controller.handleComponentAddition("AND", 100, 100);
        controller.handleComponentAddition("OR", 300, 100);

        // Créer un fil entre le composant AND et OR
        Component andGate = circuit.getComponents().get(0);  // Le premier composant ajouté (AND)
        Component orGate = circuit.getComponents().get(1);   // Le deuxième composant ajouté (OR)
        controller.handleWireCreation(andGate, orGate);

        // Lancer la simulation
        controller.runSimulation();

        // Sauvegarder le circuit dans un fichier
        PersistenceManager persistenceManager = new PersistenceManager();
        try {
            // Sauvegarde le circuit dans le fichier "circuit.dat"
            persistenceManager.saveCircuit(circuit, "circuit.dat");
            System.out.println("Circuit sauvegardé avec succès dans 'circuit.dat'.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Charger un circuit existant (facultatif, si vous avez un fichier à charger)
        // Essayez de charger le circuit précédemment sauvegardé
        try {
            Circuit loadedCircuit = persistenceManager.loadCircuit("circuit.dat");
            System.out.println("Circuit chargé avec succès.");
            // Si vous chargez un circuit, vous pouvez l'afficher dans l'interface
            frame.updateCircuitView(loadedCircuit);
        } catch (Exception e) {
            System.out.println("Aucun circuit sauvegardé trouvé, ou erreur de chargement.");
            e.printStackTrace();
        }

        // Afficher la fenêtre principale de l'application
        frame.setVisible(true);
    }
}
