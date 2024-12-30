import javax.swing.*;
import java.awt.*;

public class GameGUI extends JFrame {
    private JLabel resultLabel;
    private GameLogic gameLogic;

    public GameGUI(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        setTitle("Rock Paper Scissors");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add components
        JButton rockButton = new JButton("Rock");
        JButton paperButton = new JButton("Paper");
        JButton scissorsButton = new JButton("Scissors");
        resultLabel = new JLabel("Wins: 0, Losses: 0, Ties: 0");

        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        // Add action listeners
        rockButton.addActionListener(e -> playGame("Rock"));
        paperButton.addActionListener(e -> playGame("Paper"));
        scissorsButton.addActionListener(e -> playGame("Scissors"));
    }

    private void playGame(String playerChoice) {
        String result = gameLogic.play(playerChoice);
        resultLabel.setText("Wins: " + gameLogic.getWins() + ", Losses: " + gameLogic.getLosses() + ", Ties: " + gameLogic.getTies());
        JOptionPane.showMessageDialog(this, result);
    }
}
