package unifil.br.model;

import javax.swing.*;

public class Interface {
    public static void createInput(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define the panel to hold the components
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        //Label das funçoes
        JLabel label = new JLabel("F(x) = ");
        JLabel x5 = new JLabel("x⁵ +");
        JLabel x4 = new JLabel("x⁴ + ");
        JLabel x3 = new JLabel("x³ + ");
        JLabel x2 = new JLabel("x² + ");
        JLabel x = new JLabel("x + ");
        //Textos internos dos Input
        JTextField x5Input = new JTextField( 15);
        JTextField x4Input = new JTextField( 30);
        JTextField x3Input = new JTextField( 45);
        JTextField x2Input = new JTextField( 60);
        JTextField xInput = new JTextField( 75);
        JTextField indInput = new JTextField( 90);

        panel.setSize(50, 50);
        panel.setLayout(layout);
        panel.add(label);
        panel.add(x5Input);
        panel.add(x5);
        panel.add(x4Input);
        panel.add(x4);
        panel.add(x3Input);
        panel.add(x3);
        panel.add(x2Input);
        panel.add(x2);
        panel.add(xInput);
        panel.add(x);
        panel.add(indInput);


        // Put constraint on components
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, panel);
        //layout.putConstraint(SpringLayout.WEST, text, 5, SpringLayout.EAST, label);
        //layout.putConstraint(SpringLayout.NORTH, text, 5, SpringLayout.NORTH, panel);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
