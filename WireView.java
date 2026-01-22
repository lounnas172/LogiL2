import java.awt.*;

public class WireView {
    private Wire model;

    public WireView(Wire model) {
        this.model = model;
    }

    public void drawLine(Graphics g) {
        // Dessine une ligne représentant un fil entre deux composants
        int[] sourcePos = model.getSource().getPosition();
        int[] destPos = model.getDestination().getPosition();
        g.setColor(Color.BLACK);
        g.drawLine(sourcePos[0], sourcePos[1], destPos[0], destPos[1]);
    }
}
