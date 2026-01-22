import java.util.ArrayList;
import java.util.List;

public class Component {
    private String name;
    private int x, y;
    private List<Wire> connections;

    public Component(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.connections = new ArrayList<>();
    }

    // Connecte ce composant à un autre
    public void connect(Component other) {
        Wire wire = new Wire(this, other);
        addConnection(wire);
        other.addConnection(wire);
    }

    // Déconnecte ce composant d'un autre
    public void disconnect(Component other) {
        connections.removeIf(wire -> wire.getDestination().equals(other));
        other.connections.removeIf(wire -> wire.getSource().equals(this));
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Getter pour la position
    public int[] getPosition() {
        return new int[]{x, y};
    }

    // Setter pour la position
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Retourne la liste des connexions
    public List<Wire> getConnections() {
        return connections;
    }

    // Ajoute une connexion
    public void addConnection(Wire wire) {
        connections.add(wire);
    }

    // Supprime une connexion
    public void removeConnection(Wire wire) {
        connections.remove(wire);
    }

    // Vérifie si ce composant est connecté à un autre
    public boolean isConnectedTo(Component other) {
        return connections.stream().anyMatch(wire -> wire.getDestination().equals(other));
    }

    // Calcule la distance entre deux composants
    public double getDistanceTo(Component other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
    }

    // Simulation spécifique à chaque composant
    public void simulate() {
        // Cette méthode est vide ici mais peut être redéfinie dans les sous-classes
    }

    // Retourne le type de composant
    public String getComponentType() {
        return "Component"; // À surcharger dans les sous-classes
    }

    // Affiche les informations du composant
    @Override
    public String toString() {
        return "Component[name=" + name + ", position=(" + x + ", " + y + ")]";
    }

    // Clone ce composant
    public Component clone() {
        return new Component(this.name, this.x, this.y);
    }

    // Sérialise en JSON
    public String toJSON() {
        return "{ \"name\": \"" + name + "\", \"position\": [" + x + ", " + y + "] }";
    }

    // Désérialise un composant à partir d'un JSON
    public static Component fromJSON(String json) {
        return new Component("Dummy", 0, 0); // À implémenter selon votre format JSON
    }
}
