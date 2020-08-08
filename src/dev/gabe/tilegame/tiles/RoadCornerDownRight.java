package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCornerDownRight extends Tile{

	public RoadCornerDownRight( int id) {
		super(Assets.roadCornerDownRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
