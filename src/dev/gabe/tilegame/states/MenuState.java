package dev.gabe.tilegame.states;

import java.awt.Graphics;

import dev.gabe.tilegame.gfx.Assets;

public class MenuState extends State{

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, 0, 0, null);
		
	}

}
