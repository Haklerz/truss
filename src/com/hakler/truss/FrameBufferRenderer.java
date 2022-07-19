package com.hakler.truss;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class FrameBufferRenderer extends Canvas {
	private FrameBuffer frontBuffer;
	private BufferStrategy backBuffer;

	public FrameBufferRenderer(int width, int height) {
		super(DefaultGraphicsConfiguration.getInstance());

		setIgnoreRepaint(true);
		setSize(width, height);

		this.frontBuffer = new FrameBuffer(width, height);
	}

	public void createBackBuffer() {
		createBufferStrategy(2);
		backBuffer = getBufferStrategy();
	}

	public void flipFrameBuffers() {
		Graphics2D graphics = (Graphics2D) backBuffer.getDrawGraphics();

		graphics.drawImage(frontBuffer.asBufferedImage(), 0, 0,
				frontBuffer.getWidth(), frontBuffer.getHeight(), null);

		graphics.dispose();
		backBuffer.show();
	}
}
