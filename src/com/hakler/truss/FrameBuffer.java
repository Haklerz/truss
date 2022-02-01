package com.hakler.truss;

import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class FrameBuffer {

    private BufferedImage image;

    public FrameBuffer(int width, int height) {
        image = DefaultGraphicsConfiguration.getInstance()
                .createCompatibleImage(width, height, Transparency.OPAQUE);
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }
}
