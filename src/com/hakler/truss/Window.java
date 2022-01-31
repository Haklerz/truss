package com.hakler.truss;

import javax.swing.JFrame;

public class Window {

    public Window(String title, int width, int height) {
        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        window.add(new FrameBuffer(width, height));
        window.pack();
        window.setMinimumSize(window.getSize());
        window.setLocationRelativeTo(null);
    }

        frame.setVisible(true);
    }

}
