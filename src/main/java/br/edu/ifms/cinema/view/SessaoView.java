
package br.edu.ifms.cinema.view;

import javax.swing.*;
import java.awt.*;

public class SessaoView extends JFrame {

    public SessaoView() {
        setTitle("Gestão de Sessões - Cinema Manager");
        setSize(700, 500);
        setLocationRelativeTo(null);

        JLabel lblInfo = new JLabel("Aqui serão adicionados cadastros de Filmes, Salas, Clientes e Sessões.");
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);

        add(lblInfo, BorderLayout.CENTER);
    }
}
