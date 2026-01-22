import java.util.ArrayList;
import java.util.List;

public class SuperComponent extends Component {
    private List<Component> subComponents; // Liste des composants qui font partie de ce SuperComponent

    public SuperComponent(String name, int x, int y) {
        super(name, x, y);  // Appelle le constructeur de la classe de base `Component`
        subComponents = new ArrayList<>();
    }

    // Ajoute un sous-composant à ce SuperComponent
    public void addSubComponent(Component component) {
        subComponents.add(component);
    }

    // Retire un sous-composant de ce SuperComponent
    public void removeSubComponent(Component component) {
        subComponents.remove(component);
    }

    // Retourne la liste des sous-composants
    public List<Component> getSubComponents() {
        return subComponents;
    }

    // Implémente la méthode `simulate()` en simulant tous les sous-composants
    @Override
    public void simulate() {
        for (Component component : subComponents) {
            component.simulate();  // Appelle la simulation de chaque sous-composant
        }
    }

    // Récupère le type de ce composant
    @Override
    public String getComponentType() {
        return "SuperComponent";
    }

    // Affiche les informations du SuperComponent et de ses sous-composants
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", SubComponents: [");
        for (Component component : subComponents) {
            sb.append(component.getName()).append(", ");
        }
        if (!subComponents.isEmpty()) {
            sb.setLength(sb.length() - 2);  // Enlever la dernière virgule
        }
        sb.append("]");
        return sb.toString();
    }

    // Clone ce SuperComponent et ses sous-composants
    @Override
    public SuperComponent clone() {
        SuperComponent cloned = new SuperComponent(this.getName(), this.getPosition()[0], this.getPosition()[1]);
        for (Component component : subComponents) {
            cloned.addSubComponent(component.clone());
        }
        return cloned;
    }

    // Sérialise ce SuperComponent et ses sous-composants en JSON
    @Override
    public String toJSON() {
        StringBuilder sb = new StringBuilder(super.toJSON());
        sb.append(", \"subComponents\": [");
        for (Component component : subComponents) {
            sb.append(component.toJSON()).append(", ");
        }
        if (!subComponents.isEmpty()) {
            sb.setLength(sb.length() - 2);  // Enlever la dernière virgule
        }
        sb.append("]");
        return sb.toString();
    }

    // Désérialise un SuperComponent à partir d'un JSON
    public static SuperComponent fromJSON(String json) {
        // Implémentation de la désérialisation, qui pourrait impliquer de lire un fichier JSON
        // et créer les composants en fonction de la structure du JSON. À adapter selon le format
        return new SuperComponent("Dummy", 0, 0);  // À implémenter selon le format JSON spécifique
    }
}
