package com.hakler.truss;

import javax.swing.JFrame;

public class Window {
    public Window() {
        JFrame frame = new JFrame("Truss");

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
