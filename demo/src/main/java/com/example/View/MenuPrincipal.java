package com.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    public static void main(String[] args) {
        CriaTrem panelCriarTrem = new CriaTrem();
        
        JFrame jframe = new JFrame("Home");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(900, 600);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);

        // Carregar o ícone da aplicação
        ImageIcon icon = new ImageIcon("src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");

        // Definir o ícone para o JFrame
        jframe.setIconImage(icon.getImage());

        JPanel jPanel = new JPanel(new FlowLayout()); // Usando FlowLayout para o jPanel principal
        jPanel.setBackground(new Color(63, 55, 55));
        jPanel.setPreferredSize(new Dimension(900, 600));

        JPanel panelPrincipal = new JPanel(new GridBagLayout()); // Usando GridBagLayout para o segundo jPanel
        panelPrincipal.setBackground(new Color(63, 55, 55));
        panelPrincipal.setPreferredSize(new Dimension(400, 575));

        // Carregando a imagem a partir do caminho específico
        ImageIcon imageIcon = new ImageIcon("src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");
        Image image = imageIcon.getImage();
        JLabel labelImagem = new JLabel(new ImageIcon(image));

        JButton button1 = new JButton("Criar trem");
        JButton button2 = new JButton("Desfazer trem");
        JButton button3 = new JButton("Listar trens");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre componentes
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenchimento horizontal

        panelPrincipal.add(labelImagem, gbc);

        gbc.gridy = 1;
        panelPrincipal.add(button1, gbc);

        gbc.gridy = 2;
        panelPrincipal.add(button2, gbc);

        gbc.gridy = 3;
        panelPrincipal.add(button3, gbc);

        jPanel.add(panelPrincipal);

        // Configura todos os botões com o mesmo tamanho
        Dimension buttonSize = new Dimension(button1.getPreferredSize());
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);

        button1.setBackground(new Color(99, 98, 98));
        button2.setBackground(new Color(99, 98, 98));
        button3.setBackground(new Color(99, 98, 98));

        button1.setBorderPainted(false);
        button1.setFocusPainted(false);

        button2.setBorderPainted(false);
        button2.setFocusPainted(false);

        button3.setBorderPainted(false);
        button3.setFocusPainted(false);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.removeAll(); // Remove todos os componentes do painel atual
                jPanel.add(panelCriarTrem.instanciaTela()); // Adiciona o novo painel à janela
                jPanel.revalidate(); // Atualiza o layout do painel
                jPanel.repaint(); // Redesenha o painel
                jframe.pack(); // Redimensiona o JFrame para o novo conteúdo
            }
        });

        jframe.add(jPanel);
        jframe.pack();
        jframe.setVisible(true);
    }
}
