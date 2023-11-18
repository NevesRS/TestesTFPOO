package com.example.View;

import javax.swing.*;
import java.awt.*;

public class CriaTrem {
    public static void main(String[] args) {
        
    }

    public Component instanciaTela(){
        JPanel panelCriarTrem = new JPanel();
        panelCriarTrem.setBackground(Color.BLACK); // Cor de fundo para a tela de criação de trem
        panelCriarTrem.setPreferredSize(new Dimension(400, 300)); // Tamanho da tela de criação de trem
        panelCriarTrem.setLayout(new BorderLayout());

        JLabel labelCriarTrem = new JLabel("Tela de Criação de Trem");
        labelCriarTrem.setHorizontalAlignment(SwingConstants.CENTER);
        panelCriarTrem.add(labelCriarTrem, BorderLayout.CENTER);
        return labelCriarTrem;
    }
}
