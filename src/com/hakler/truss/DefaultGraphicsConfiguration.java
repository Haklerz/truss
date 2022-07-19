package com.hakler.truss;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;

public class DefaultGraphicsConfiguration {
	private static GraphicsConfiguration instance;

	public static GraphicsConfiguration getInstance() {
		if (instance == null) {
			instance = GraphicsEnvironment.getLocalGraphicsEnvironment()
					.getDefaultScreenDevice().getDefaultConfiguration();
		}

		return instance;
	}
}
