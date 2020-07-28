package main;

import java.util.Random;
import java.awt.Graphics2D;

public class Boid {

	public int windowWidth;
	public int windowHeight;

	public int x = 0;
	public int y = 200;

	public int vmin = -1;
	public int vmax = 1;

	public int[] velocity = {0, 0};
	public int[] direction = {1, 0};
	
	public Boid(int width, int height) {
		Random random = new Random();

		for (int i = 0; i < 2; i++) {
			velocity[i] = random.nextInt((vmax - vmin) + 1) + vmin;
		}

		windowWidth = width;
		windowHeight = height;
	}

	public void update() {
		x += velocity[0] * direction[0];
		y += velocity[1] * direction[1];
	}

	public Graphics2D show(Graphics2D g) {
		g.drawRect(x, y, 10, 10);

		return g;
	}

}
