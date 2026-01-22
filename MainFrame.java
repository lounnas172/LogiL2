package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel workspace;  // La zone de travail où les composants et fils seront dessinés

    public MainFrame() {
        setTitle("ArchSimul - Circuit Simulation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeUI();
    }

    public void initializeUI() {
        workspace = new JPanel();
        workspace.setLayout(null);  // Position absolue pour déplacer les composants
        add(workspace, BorderLayout.CENTER);

        // Par exemple, ajouter un bouton pour démarrer la simulation
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

    public JPanel getWorkspace() {
        return workspace;
    }
}
