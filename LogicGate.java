import java.util.ArrayList;
import java.util.List;

/**
 * Représente une porte logique (AND, OR, NOT, etc.)
 * Hérite de Component et ajoute la logique de calcul
 */
public class LogicGate extends Component {
    private String gateType; // AND, OR, NOT, XOR, NAND, NOR
    private List<Boolean> inputs;
    private boolean output;

    public LogicGate(String name, int x, int y, String gateType) {
        super(name, x, y);
        this.gateType = gateType;
        this.inputs = new ArrayList<>();
        this.output = false;
    }

    /**
     * Définit les entrées de la porte logique
     */
    public void setInputs(List<Boolean> inputs) {
        this.inputs = inputs;
    }

    /**
     * Ajoute une entrée à la porte logique
     */
    public void addInput(boolean input) {
        inputs.add(input);
    }

    /**
     * Calcule la sortie de la porte en fonction de son type
     */
    @Override
    public void simulate() {
        if (inputs.isEmpty()) {
            output = false;
            return;
        }

        switch (gateType.toUpperCase()) {
            case "AND":
                output = inputs.stream().allMatch(b -> b);
                break;
            case "OR":
                output = inputs.stream().anyMatch(b -> b);
                break;
            case "NOT":
                output = !inputs.get(0);
                break;
            case "XOR":
                output = inputs.stream().filter(b -> b).count() % 2 == 1;
                break;
            case "NAND":
                output = !inputs.stream().allMatch(b -> b);
                break;
            case "NOR":
                output = !inputs.stream().anyMatch(b -> b);
                break;
            default:
                output = false;
        }
    }

    /**
     * Retourne la sortie calculée
     */
    public boolean getOutput() {
        return output;
    }

    /**
     * Retourne le type de porte
     */
    public String getGateType() {
        return gateType;
    }

    @Override
    public String getComponentType() {
        return "LogicGate-" + gateType;
    }

    @Override
    public String toString() {
        return "LogicGate[name=" + getName() + ", type=" + gateType +
               ", inputs=" + inputs + ", output=" + output + "]";
    }

    @Override
    public LogicGate clone() {
        return new LogicGate(getName(), getPosition()[0], getPosition()[1], gateType);
    }
}
