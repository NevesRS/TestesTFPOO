package com.example.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriaTrem {

    private JPanel panelCriarTrem;
    private JFrame frame;

    public static void main(String[] args) {
        CriaTrem telaCriarTrem = new CriaTrem();
        telaCriarTrem.initialize();
    }

    public void initialize() {
        frame = new JFrame("Criar Trem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        panelCriarTrem = instanciaTela();

        frame.add(panelCriarTrem);
        frame.setVisible(true);
    }

    public JPanel instanciaTela() {
        panelCriarTrem = new JPanel(new GridBagLayout());
        panelCriarTrem.setBackground(new Color(63, 55, 55));
        panelCriarTrem.setPreferredSize(new Dimension(400, 575));

        ImageIcon icon = new ImageIcon("src\\main\\java\\com\\example\\View\\Images\\TremIcon.png");
        JLabel labelImagem = new JLabel(icon);
        labelImagem.setHorizontalAlignment(SwingConstants.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        panelCriarTrem.add(labelImagem, gbc);

        gbc.gridy++;

        JLabel labelID = new JLabel("Digite um ID:");
        labelID.setForeground(Color.BLACK);
        panelCriarTrem.add(labelID, gbc);

        gbc.gridy++;
        JTextField textFieldID = new JTextField(18);
        textFieldID.setPreferredSize(new Dimension(200, 25));
        textFieldID.setForeground(Color.BLACK);
        panelCriarTrem.add(textFieldID, gbc);

        gbc.gridy++;

        JButton button1 = new JButton("Criar trem");
        JButton button2 = new JButton("Voltar ao menu");

        textFieldID.setPreferredSize(new Dimension(200, 25));
        button1.setPreferredSize(new Dimension(200, 25));
        button2.setPreferredSize(new Dimension(200, 25));

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 12);

        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setFont(font);
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(99, 98, 98));

        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setFont(font);
        button2.setForeground(Color.BLACK);
        button2.setBackground(new Color(99, 98, 98));

        // Adicionando a ação para voltar à tela inicial (MenuPrincipal)
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a tela atual
                MenuPrincipal.main(new String[0]); // Abre a tela inicial novamente
            }
        });

        panelCriarTrem.add(button1, gbc);
        gbc.gridy++;
        panelCriarTrem.add(button2, gbc);

        return panelCriarTrem;
    }
}
