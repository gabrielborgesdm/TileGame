package dev.gabe.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.gabe.tilegame.display.Display;
import dev.gabe.tilegame.gfx.Assets;
import dev.gabe.tilegame.gfx.GameCamera;
import dev.gabe.tilegame.input.KeyManager;
import dev.gabe.tilegame.states.GameState;
import dev.gabe.tilegame.states.MenuState;
import dev.gabe.tilegame.states.State;

public class Game implements Runnable {
	
	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	//Input
	private KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void init() {
		display = new Display(title, width, height);
		display.getJFrame().addKeyListener(keyManager);
		Assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		
		menuState = new MenuState(handler);
		gameState = new GameState(handler);
		
		//State.setState(menuState);
		State.setState(gameState);
	}
	
	
	private void tick() {
		//tick can also be called update
		keyManager.tick();
		
		if(State.getState() != null) {
			State.getState().tick();
		}
		
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		
		//Clear Screen
		g.clearRect(0, 0, width, height);
		
		//Draw here!
		
		if(State.getState() != null) {
			State.getState().render(g);
		}
	
		
		//End Drawing
		bs.show();
		g.dispose();
	}

	public void run() {
		//The run method is called whenever the Thread is started
		init();
		
		//prevent game from running at a different speed for different computers
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1) {
				tick();
				render();
				ticks += 1;
				delta--;
			}
			
			if(timer >= 1000000000) {
				System.out.flush();
				System.out.println("Ticks and Frames:" + ticks );
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public synchronized void start() {
		if(running) return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running) return;
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

