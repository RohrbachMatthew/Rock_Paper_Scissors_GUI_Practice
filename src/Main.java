import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameLogic gameLogic = new GameLogic();
            GameGUI frame = new GameGUI(gameLogic);
            frame.setVisible(true);
        });
    }
}