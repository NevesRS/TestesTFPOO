package com.teste.View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListarTrem extends JPanel {
    public ListarTrem() {
        setLayout(new BorderLayout()); // BorderLayout para o JScrollPane

        JPanel contentPanel = new JPanel(); // Painel para o conteúdo
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS)); // BoxLayout para a disposição vertical

        // Aqui você pode ter um loop para adicionar contêineres para cada trem
        for (int i = 1; i <= 20/* NUMERO DE TRENS */; i++) {
            if(i < 1){
                
            }else{
            JPanel containerTrem = new JPanel(new FlowLayout(FlowLayout.CENTER));
            containerTrem.setMinimumSize(new Dimension(900, 40));
            containerTrem.setPreferredSize(new Dimension(900, 40));
            containerTrem.setBorder(new EmptyBorder(5, 10, 5, 10));
            containerTrem.setBackground(new Color(99, 98, 98));

            // Cria um novo JPanel para conter os componentes
            JPanel innerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            innerPanel.setPreferredSize(new Dimension(800, 45)); // Define o tamanho para 900x30
            innerPanel.setMaximumSize(new Dimension(800, 40));
            innerPanel.setMinimumSize(new Dimension(800, 40));

            // Valores do trem (simulação)
            int idTrem = i;
            int numVagoes = 3; // Obtenha o número de vagões do trem do seu programa
            int numLocomotivas = 4; // Obtenha o número de locomotivas do trem do seu programa

            // Crie os componentes para o trem
            JLabel labelID = new JLabel("ID Trem: " + idTrem);
            JLabel labelVagoes = new JLabel("Vagões: " + numVagoes);
            JLabel labelLocomotivas = new JLabel("Locomotivas: " + numLocomotivas);

            // Crie a imagem da lixeira (simulação)
            ImageIcon lixeiraIcon = new ImageIcon(
                    "TestesPOO\\teste\\src\\main\\java\\com\\teste\\Images\\IconLixeira.png");
            JLabel labelLixeira = new JLabel(lixeiraIcon);

            labelLixeira.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Executa a lógica para excluir o trem correspondente ao clicar na lixeira
                    // Chamar método do programa para excluir o trem com o ID 'idTrem'
                    // excluirTrem(idTrem);
                    containerTrem.setVisible(false); // Oculta o container do trem
                    revalidate(); // Atualiza o layout
                    repaint(); // Redesenha o painel
                }
            });

            innerPanel.add(Box.createRigidArea(new Dimension(20, 0)));
            innerPanel.add(labelID);
            innerPanel.add(Box.createRigidArea(new Dimension(120, 0))); // Espaçamento entre os labels
            innerPanel.add(labelVagoes);
            innerPanel.add(Box.createRigidArea(new Dimension(120, 0))); // Espaçamento entre os labels
            innerPanel.add(labelLocomotivas);
            innerPanel.add(Box.createRigidArea(new Dimension(120, 0))); // Espaçamento entre os labels
            innerPanel.add(labelLixeira);

            containerTrem.add(innerPanel);
            contentPanel.add(containerTrem); // Adiciona o container do trem ao painel de conteúdo
        }

        JScrollPane scrollPane = new JScrollPane(contentPanel); // JScrollPane para o conteúdo
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Desabilita a barra
                                                                                         // horizontal

        add(scrollPane, BorderLayout.CENTER); // Adiciona o JScrollPane ao painel principal
            }
    }
}
