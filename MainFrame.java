import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel workspace;

    public MainFrame() {
        setTitle("ArchSimul - Circuit Simulation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initializeUI() {
        workspace = new JPanel();
        workspace.setLayout(null);
        add(workspace, BorderLayout.CENTER);

        JButton simulateButton = new JButton("Simuler");
        simulateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code pour démarrer la simulation
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(simulateButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public void initializeUI(CircuitController controller) {
        initializeUI();
    }

    public void updateCircuitView(Circuit circuit) {
        workspace.repaint();
    }

    public JPanel getWorkspace() {
        return workspace;
    }
}
