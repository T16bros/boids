package main;

import util.Window;
import util.Loop;

import java.awt.Graphics2D;

public class run extends Loop {
	
	public Window window;

	public int width;
	public int height;
	public int amount = 1;

	public Boid[] boids;

	public run(Window window) {
		this.window = window;
		this.width = window.width;
		this.height = window.height;
		this.canvas = window.getCanvas();

		init();
		start();
	}

	public void init() {
		
		boids = new Boid[amount];
		
		for (int i = 0; i < amount; i++) {
			boids[i] = new Boid(width, height);
		}

	}

	public void update() {
		
	}

	public Graphics2D render(Graphics2D g) {
		g.clearRect(0, 0, width, height);

		for (Boid boid : boids) {
			boid.update();
			g = boid.show(g);
		}

		return g;
	}

}
