package com.example.swingapp.vista;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private static final long serialVersionUID = 1L;
	public JButton btnClear, btnExit, btnCurl, btnPing, bntEstadistica, btnDate, btnSocket;
    public JTextField txtInput;

    public ControlPanel() {
        // grid con 3 filas (una por botón)
        setLayout(new GridLayout(3, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        txtInput = new JTextField();
        txtInput.setToolTipText("URL");

        btnSocket = new JButton("Sockets");
        btnDate = new JButton("Date");
        bntEstadistica = new JButton("EstadisticaRed");
        btnPing = new JButton("Ping");
        btnCurl = new JButton("Curl");
        btnClear = new JButton("🧹 Limpiar");
        btnExit  = new JButton("🚪 Salir");

        add(txtInput);
        add(btnSocket);
        add(btnDate);
        add(bntEstadistica);
        add(btnPing);
        add(btnCurl);
        add(btnClear);
        add(btnExit);
    }
}