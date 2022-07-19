package com.hakler.truss;

import java.awt.Transparency;
import java.awt.image.BufferedImage;

public class FrameBuffer {
	private BufferedImage image;
	private int width, height;

	public FrameBuffer(int width, int height) {
		this.image = DefaultGraphicsConfiguration.getInstance()
				.createCompatibleImage(width, height, Transparency.OPAQUE);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BufferedImage asBufferedImage() {
		return image;
	}
}
