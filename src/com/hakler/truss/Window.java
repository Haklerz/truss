package com.hakler.truss;

import javax.swing.JFrame;

public class Window extends JFrame {
	private FrameBufferRenderer renderer;

	public Window(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);

		this.renderer = new FrameBufferRenderer(width, height);

		add(renderer);
		pack();
		setLocationRelativeTo(null);

		renderer.createBackBuffer();
	}

	public void start() {
		setVisible(true);

		while (isDisplayable()) {
			renderer.flipFrameBuffers();
		}
	}
}
