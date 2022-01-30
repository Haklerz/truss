package com.hakler.truss;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Window {
    public Window(String title, int width, int height) {
        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Canvas canvas = new Canvas(GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getDefaultScreenDevice()
            .getDefaultConfiguration());

        canvas.setIgnoreRepaint(true);
        canvas.setBackground(Color.BLACK);
        canvas.setSize(width, height);
        
        frame.add(canvas);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
