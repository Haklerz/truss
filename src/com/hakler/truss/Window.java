package com.hakler.truss;

import javax.swing.JFrame;

public class Window {

    public Window(String title, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.add(new FrameBuffer(width, height));
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

}
