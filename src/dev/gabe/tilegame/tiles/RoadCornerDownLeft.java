package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCornerDownLeft extends Tile{

	public RoadCornerDownLeft( int id) {
		super(Assets.roadCornerDownLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
