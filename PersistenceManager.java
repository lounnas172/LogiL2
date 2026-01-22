import java.io.*;

/**
 * Gère la sauvegarde et le chargement des circuits
 * Utilise la sérialisation Java native
 */
public class PersistenceManager {

    /**
     * Sauvegarde un circuit dans un fichier
     */
    public void saveCircuit(Circuit circuit, String filepath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))) {
            oos.writeObject(circuit);
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde: " + e.getMessage());
        }
    }

    /**
     * Charge un circuit depuis un fichier
     */
    public Circuit loadCircuit(String filepath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))) {
            return (Circuit) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement: " + e.getMessage());
            return null;
        }
    }
}
