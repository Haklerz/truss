package com.hakler.truss;

import javax.swing.JFrame;

public class Window {

    private JFrame window;

    public Window(String title, int width, int height) {
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        window.add(new FrameBufferRenderer(new FrameBuffer(width, height)));
        window.pack();
        window.setMinimumSize(window.getSize());
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }

}
