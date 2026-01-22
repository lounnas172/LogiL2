import java.util.ArrayList;
import java.util.List;

public class Circuit {
    private List<Component> components;
    private List<Wire> wires;

    public Circuit() {
        components = new ArrayList<>();
        wires = new ArrayList<>();
    }

    // Ajouter un composant
    public void addComponent(Component component) {
        components.add(component);
    }

    // Retirer un composant
    public void removeComponent(Component component) {
        components.remove(component);
        // Supprimer toutes les connexions associées à ce composant
        wires.removeIf(wire -> wire.getSource().equals(component) || wire.getDestination().equals(component));
    }

    // Ajouter un fil
    public void addWire(Wire wire) {
        wires.add(wire);
    }

    // Exécuter la simulation du circuit
    public void simulate() {
        for (Component component : components) {
            component.simulate();
        }
        for (Wire wire : wires) {
            wire.transmitSignal();
        }
    }

    // Afficher le circuit
    public void displayCircuit() {
        for (Component component : components) {
            System.out.println(component);
        }
        for (Wire wire : wires) {
            System.out.println(wire);
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    public List<Wire> getWires() {
        return wires;
    }
}
