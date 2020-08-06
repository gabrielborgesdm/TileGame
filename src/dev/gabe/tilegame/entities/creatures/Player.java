package dev.gabe.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.gabe.tilegame.Handler;
import dev.gabe.tilegame.gfx.Animation;
import dev.gabe.tilegame.gfx.Assets;

public class Player extends Creature{
	
	//Animations
	private Animation anim, animRight, animLeft;

	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 24;
		bounds.y = 33;
		bounds.width = 16;
		bounds.height = 32;
		
		//Animations
		anim = new Animation(200, Assets.player);
		animRight = new Animation(200, Assets.playerRight);
		animLeft = new Animation(200, Assets.playerLeft);
	}
	
	@Override
	public void tick() {
		//Animations
		anim.tick();
		animRight.tick();
		animLeft.tick();
		
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEmpty(this);
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		int sprintSpeed = 0;
		
		if(handler.getKeyManager().shift) sprintSpeed = (int) speed;
		if(handler.getKeyManager().up) yMove = -speed - sprintSpeed;
		if(handler.getKeyManager().down) yMove = speed + sprintSpeed;
		if(handler.getKeyManager().left) xMove = -speed - sprintSpeed;
		if(handler.getKeyManager().right) xMove = speed + sprintSpeed;
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove > 0) {
			return animRight.getCurrentFrame();			
		} else if(xMove < 0) {
			return animLeft.getCurrentFrame();	
		} else if(yMove > 0 || yMove < 0){
			return animRight.getCurrentFrame();
		} else {
			return anim.getCurrentFrame();
		}
	}


}
