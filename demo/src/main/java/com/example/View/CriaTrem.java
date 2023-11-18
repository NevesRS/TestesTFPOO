package com.example.View;

import javax.swing.*;
import java.awt.*;

public class CriaTrem {
    public Component instanciaTela() {
        JPanel panelCriarTrem = new JPanel();
        panelCriarTrem.setBackground(Color.BLACK); // Cor de fundo para a tela de criação de trem
        panelCriarTrem.setPreferredSize(new Dimension(400, 300)); // Tamanho da tela de criação de trem
        panelCriarTrem.setLayout(new BorderLayout());

        JLabel labelCriarTrem = new JLabel();
        labelCriarTrem.setHorizontalAlignment(SwingConstants.CENTER);

        // Carregar a imagem de um arquivo local
        ImageIcon icon = new ImageIcon("demo\\src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");
        labelCriarTrem.setIcon(icon);

        panelCriarTrem.add(labelCriarTrem, BorderLayout.CENTER);
        return panelCriarTrem;
    }
}

