import javax.swing.*;
import java.awt.*;

public class ComponentView {
    private Component model;
    private JLabel icon;

    public ComponentView(Component model) {
        this.model = model;
        this.icon = new JLabel(model.getName());
    }

    public void updatePosition(int x, int y) {
        icon.setLocation(x, y);
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(model.getPosition()[0], model.getPosition()[1], 50, 30);
    }

    public JLabel getIcon() {
        return icon;
    }
}
