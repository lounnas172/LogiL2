package model;

import java.util.ArrayList;
import java.util.List;

public class SuperComponent extends Component {
    private List<Component> components;

    public SuperComponent(String name, int x, int y) {
        super(name, x, y);
        this.components = new ArrayList<>();
    }

    // Ajouter un composant à ce SuperComponent
    public void addComponent(Component component) {
        components.add(component);
    }

    // Supprimer un composant
    public void removeComponent(Component component) {
        components.remove(component);
    }

    // Simuler tous les composants internes
    @Override
    public void simulate() {
        for (Component component : components) {
            component.simulate();
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "SuperComponent{name='" + getName() + "', components=" + components.size() + "}";
    }
}
