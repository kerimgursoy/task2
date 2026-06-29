import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    JTextField textField;
    JLabel text, text2, msg, time;
    RandGame game;

    public GameFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tahmin Et");
        this.setResizable(false);
        this.setSize(420, 240);
        this.setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Kenar boşlukları

        text = new JLabel("1 ile 100 arasında bir tahmin yap");
        text.setAlignmentX(Component.CENTER_ALIGNMENT);

        text2 = new JLabel("Enter'a basarak tahmini göner");
        text2.setAlignmentX(Component.CENTER_ALIGNMENT);

        msg = new JLabel(" ");
        msg.setAlignmentX(Component.CENTER_ALIGNMENT);

        time = new JLabel(" ");
        time.setAlignmentX(Component.CENTER_ALIGNMENT);

        textField = new JTextField();
        textField.setMaximumSize(new Dimension(100, 40));
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);

        textField.addActionListener(e -> {
            try {
                int n = Integer.parseInt(textField.getText());
                game.guess(n);
                textField.setText("");
            } catch (Exception ignored) { }
        });

        mainPanel.add(text);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(text2);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(msg);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(time);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(textField);

        this.add(mainPanel);
        this.setVisible(true);
    }
}