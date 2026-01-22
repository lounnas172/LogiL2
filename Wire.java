public class Wire {
    private Component source;
    private Component destination;
    private boolean state; // L'état du fil (0 ou 1)

    public Wire(Component source, Component destination) {
        this.source = source;
        this.destination = destination;
        this.state = false; // L'état initial du fil
    }

    // Méthode pour transmettre un signal
    public void transmitSignal() {
        state = source instanceof LogicGate ? ((LogicGate) source).getOutput() : false;
    }

    // Getter pour la source
    public Component getSource() {
        return source;
    }

    // Getter pour la destination
    public Component getDestination() {
        return destination;
    }

    // Getter pour l'état
    public boolean getState() {
        return state;
    }

    // Setter pour l'état
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Wire [from " + source.getName() + " to " + destination.getName() + ", state=" + state + "]";
    }
}
