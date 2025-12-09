
package br.edu.ifms.cinema.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Cinema Manager - Tela Principal");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnSessoes = new JButton("Abrir Sessões");

        btnSessoes.addActionListener(e -> {
            SessaoView tela = new SessaoView();
            tela.setVisible(true);
        });

        setLayout(new BorderLayout());
        add(btnSessoes, BorderLayout.CENTER);
    }
}
