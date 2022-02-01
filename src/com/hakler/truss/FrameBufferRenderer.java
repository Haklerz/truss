package com.hakler.truss;

import java.awt.Canvas;
import java.awt.Color;

public class FrameBufferRenderer extends Canvas {

    public FrameBufferRenderer(int width, int height) {
        super(DefaultGraphicsConfiguration.getInstance());

        setIgnoreRepaint(true);
        setBackground(Color.BLACK);
        setSize(width, height);
    }
    
}
