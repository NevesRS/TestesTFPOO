package com.teste.View;

import javax.swing.*;
import java.awt.*;

public class ListarTrem extends JPanel {
    public ListarTrem() {
        setLayout(new GridLayout(3, 1));

        // Campo de texto: *Trens criados:*
        JLabel labelTrensCriados = new JLabel("Trens criados:");
        labelTrensCriados.setHorizontalAlignment(SwingConstants.CENTER);

        // Container de 900x40 com as informações
        JPanel containerInfo = new JPanel(new GridLayout(1, 2));
        containerInfo.setPreferredSize(new Dimension(900, 40));

        // Adicionando componentes no container de informações
        JLabel labelIDTrem = new JLabel("ID do trem:");
        JTextField textFieldID = new JTextField();

        containerInfo.add(labelIDTrem);
        containerInfo.add(textFieldID);

        add(labelTrensCriados);
        add(containerInfo);
    }
}
