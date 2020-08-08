package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCornerTopRight extends Tile{

	public RoadCornerTopRight( int id) {
		super(Assets.roadCornerTopRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
