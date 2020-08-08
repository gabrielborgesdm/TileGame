package dev.gabe.tilegame.entities.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.gabe.tilegame.Handler;
import dev.gabe.tilegame.gfx.Animation;
import dev.gabe.tilegame.gfx.Assets;

public class Player extends Creature{
	
	//Animations
	private Animation anim, animDown, animTop, animRight, animLeft;

	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 15;
		bounds.y = 33;
		bounds.width = 33;
		bounds.height = 28;
		
		//Animations
		anim = new Animation(180, Assets.player);
		animDown = new Animation(180, Assets.playerDown);
		animTop = new Animation(180, Assets.playerTop);
		animRight = new Animation(180, Assets.playerRight);
		animLeft = new Animation(180, Assets.playerLeft);
	}
	
	@Override
	public void tick() {
		//Animations
		anim.tick();
		animTop.tick();
		animDown.tick();
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
		//g.fillRect((int) (x - handler.getGameCamera().getxOffset() + bounds.x), (int) (y - handler.getGameCamera().getyOffset() + + bounds.y), bounds.width, bounds.height);

	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove > 0) {
			return animRight.getCurrentFrame();			
		} else if(xMove < 0) {
			return animLeft.getCurrentFrame();	
		} else if(yMove > 0){
			return animDown.getCurrentFrame();
		} else if(yMove < 0){
			return animTop.getCurrentFrame();
		} else {
			return anim.getCurrentFrame();
		}
	}


}
