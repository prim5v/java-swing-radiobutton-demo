import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JLabel imageLabel;

    public RadioButtonDemo() {

        setTitle("RadioButtonDemo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Left panel for radio buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5,1));

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        leftPanel.add(birdButton);
        leftPanel.add(catButton);
        leftPanel.add(dogButton);
        leftPanel.add(rabbitButton);
        leftPanel.add(pigButton);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        add(leftPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (birdButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/bird.jfif"));
            JOptionPane.showMessageDialog(this, "You selected Bird");
        }

        if (catButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/cat.jfif"));
            JOptionPane.showMessageDialog(this, "You selected Cat");
        }

        if (dogButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/dog.jfif"));
            JOptionPane.showMessageDialog(this, "You selected Dog");
        }

        if (rabbitButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/rabbit.jfif"));
            JOptionPane.showMessageDialog(this, "You selected Rabbit");
        }

        if (pigButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/pig.jfif"));
            JOptionPane.showMessageDialog(this, "You selected Pig");
        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo();
        });

    }
}