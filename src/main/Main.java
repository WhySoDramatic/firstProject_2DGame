package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Позволяет окну правильно закрыться, когда user нажимает крестик.
        window.setResizable(false); // Мы не сможем изменить размер окна.
        window.setTitle("Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null); // Окно будет в центре экрана.
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}

