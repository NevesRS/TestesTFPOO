package com.example.View;
import javax.swing.*;

public class TelaManager {
    private JFrame frame;

    public void iniciarTela(JFrame tela) {
        if (frame != null) {
            frame.dispose(); // Fecha a tela atual
        }
        frame = tela; // Define a nova tela como a tela atual
        frame.setVisible(true);
    }
}
