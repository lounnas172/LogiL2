package model;

import java.util.List;

public class Simulation {

    private Circuit circuit;

    public Simulation(Circuit circuit) {
        this.circuit = circuit;
    }

    // Lancer la simulation sur le circuit
    public void run() {
        for (Component component : circuit.getComponents()) {
            component.simulate();
        }
    }

    // Afficher l'état des composants après la simulation
    public void displaySimulationResults() {
        for (Component component : circuit.getComponents()) {
            if (component instanceof LogicGate) {
                LogicGate gate = (LogicGate) component;
                System.out.println(gate.getName() + " output: " + gate.getOutput());
            }
        }
    }
}
