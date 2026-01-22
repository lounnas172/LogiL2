package controller;

import model.*;
import view.*;
import java.util.ArrayList;
import java.util.List;

public class CircuitController {
    private Circuit circuit;
    private MainFrame frame;

    public CircuitController(Circuit circuit, MainFrame frame) {
        this.circuit = circuit;
        this.frame = frame;
    }

    public void handleComponentAddition(String type, int x, int y) {
        Component component;
        if (type.equals("AND")) {
            component = new LogicGate("AND Gate", x, y, "AND");
        } else if (type.equals("OR")) {
            component = new LogicGate("OR Gate", x, y, "OR");
        } else {
            component = new Component("Simple Component", x, y);
        }
        circuit.addComponent(component);
        updateView();
    }

    public void handleWireCreation(Component source, Component destination) {
        Wire wire = new Wire(source, destination);
        circuit.addWire(wire);
        updateView();
    }

    public void runSimulation() {
        circuit.simulate();
        updateView();
    }

    private void updateView() {
        // Met à jour la vue pour refléter l'état actuel du circuit
        frame.getWorkspace().repaint();
    }
}
