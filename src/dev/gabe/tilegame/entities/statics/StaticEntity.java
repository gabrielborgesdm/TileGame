package dev.gabe.tilegame.entities.statics;

import dev.gabe.tilegame.Handler;
import dev.gabe.tilegame.entities.Entity;

public abstract class StaticEntity extends Entity{
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
