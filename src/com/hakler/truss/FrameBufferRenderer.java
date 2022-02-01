package com.hakler.truss;

import java.awt.Canvas;
import java.awt.Color;

public class FrameBufferRenderer extends Canvas {

    private FrameBuffer frameBuffer;

    public FrameBufferRenderer(FrameBuffer frameBuffer) {
        super(DefaultGraphicsConfiguration.getInstance());

        setIgnoreRepaint(true);
        setBackground(Color.BLACK);
        setSize(frameBuffer.getWidth(), frameBuffer.getHeight());

        this.frameBuffer = frameBuffer;
    }
    
}
