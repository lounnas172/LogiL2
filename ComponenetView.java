package view;

import model.Component;
import javax.swing.*;
import java.awt.*;

public class ComponentView {
    private Component model;  // Le modèle de composant associé
    private JLabel icon;  // L'icône ou le symbole représentant le composant

    public ComponentView(Component model) {
        this.model = model;
        this.icon = new JLabel(model.getName());
    }

    public void updatePosition(int x, int y) {
        icon.setLocation(x, y);
    }

    public void draw(Graphics g) {
        // Exemple de dessin basique d'un composant : un rectangle
        g.setColor(Color.BLUE);
        g.fillRect(model.getPosition()[0], model.getPosition()[1], 50, 30);  // Dessine un rectangle à la position du composant
    }

    public JLabel getIcon() {
        return icon;
    }
}
