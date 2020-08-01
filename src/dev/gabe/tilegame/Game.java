package dev.gabe.tilegame;

import dev.gabe.tilegame.display.Display;

public class Game implements Runnable {
	
	private Display display;
	public int width, height;
	
	private boolean running = false;
	private Thread thread;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		
		display = new Display(title, width, height);
	}
	
	private void init() {
		
	}
	
	private void tick() {
		//tick can also be called update
	}
	
	private void render() {
		
	}

	public void run() {
		init();
		
		while(running) {
			tick();
			render();
		}
		
		stop();
	}
	
	public synchronized void start() {
		if(running) return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

