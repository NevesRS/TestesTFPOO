package com.example.View;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {
    private static JPanel jPanel;
    private static JFrame jframe;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;

    public static void main(String[] args) {
        CriaTrem panelCriarTrem = new CriaTrem();
        jframe = instanciaTela();
        jframe.setVisible(true);

        button1.addActionListener(e -> {
                jPanel.removeAll(); // Remove todos os componentes do painel atual
                jPanel.add(panelCriarTrem.instanciaTela()); // Adiciona o novo painel à janela
                jPanel.revalidate(); // Atualiza o layout do painel
                jPanel.repaint(); // Redesenha o painel
                jframe.setTitle("Criar trem");
            
        });
        
        button4.addActionListener(a -> {
            int option = JOptionPane.showConfirmDialog(jframe, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    
    }

    public static JFrame instanciaTela() {
        jframe = new JFrame("Home");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(900, 600);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);

        // Carregar o ícone da aplicação
        ImageIcon icon = new ImageIcon("demo\\src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");

        // Definir o ícone para o JFrame
        jframe.setIconImage(icon.getImage());

        jPanel = new JPanel(new FlowLayout()); // Usando FlowLayout para o jPanel principal
        jPanel.setBackground(new Color(63, 55, 55));
        jPanel.setPreferredSize(new Dimension(900, 600));

        JPanel panelPrincipal = new JPanel(new GridBagLayout()); // Usando GridBagLayout para o segundo jPanel
        panelPrincipal.setBackground(new Color(63, 55, 55));
        panelPrincipal.setPreferredSize(new Dimension(400, 575));

        // Carregando a imagem a partir do caminho específico
        ImageIcon imageIcon = new ImageIcon("demo\\src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");
        
        Image image = imageIcon.getImage();
        JLabel labelImagem = new JLabel(new ImageIcon(image));

        button1 = new JButton("Criar trem");
        button2 = new JButton("Editar trem");
        button3 = new JButton("Listar trens");
        button4 = new JButton("Sair");

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

        gbc.gridy = 4; 
        panelPrincipal.add(button4, gbc);

        jPanel.add(panelPrincipal);

        button1.setPreferredSize(new Dimension(200, 25));
        button2.setPreferredSize(new Dimension(200, 25));
        button3.setPreferredSize(new Dimension(200, 25));
        button4.setPreferredSize(new Dimension(200, 25));

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 12);
        Color cor = new Color(255, 255, 255);

        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setFont(font);
        button1.setForeground(cor);
        button1.setBackground(new Color(99, 98, 98));
        


        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setFont(font);
        button2.setForeground(cor);
        button2.setBackground(new Color(99, 98, 98));

        button3.setBorderPainted(false);
        button3.setFocusPainted(false);
        button3.setFont(font);
        button3.setForeground(cor);
        button3.setBackground(new Color(99, 98, 98));

        button4.setBorderPainted(false);
        button4.setFocusPainted(false);
        button4.setFont(font);
        button4.setForeground(cor);
        button4.setBackground(new Color(99, 98, 98));

        jframe.add(jPanel);
        return jframe;
    }
}