public class SimulationRunner {

    /**
     * Exécute la simulation du circuit.
     * La méthode `simulate()` est appelée sur chaque composant, puis sur chaque fil du circuit pour propager les signaux.
     * Elle met à jour les états des composants et des fils en fonction de la logique du circuit.
     *
     * @param circuit Le circuit à simuler.
     */
    public void run(Circuit circuit) {
        // Simuler chaque composant du circuit (calculer les sorties des portes logiques)
        for (Component component : circuit.getComponents()) {
            component.simulate(); // Appelle simulate sur chaque composant
        }

        // Propager les signaux à travers les fils (mettre à jour l'état de chaque fil)
        for (Wire wire : circuit.getWires()) {
            wire.transmitSignal(); // Transmet le signal du composant source au composant destination
        }

        // Optionnel: après la simulation, afficher l'état du circuit ou effectuer d'autres actions.
        // Cela pourrait être un appel à une méthode d'affichage dans la classe MainFrame, par exemple.
        // Vous pouvez aussi ajouter des logs ou des vérifications des résultats.
    }

    /**
     * Affiche les résultats de la simulation dans la console (facultatif).
     * Cela peut être utile pour le débogage ou pour voir l'état final des composants et des fils.
     *
     * @param circuit Le circuit à afficher.
     */
    public void displaySimulationResults(Circuit circuit) {
        System.out.println("Simulation Results:");
        for (Component component : circuit.getComponents()) {
            System.out.println(component.toString());
        }

        for (Wire wire : circuit.getWires()) {
            System.out.println(wire.toString());
        }
    }
}
