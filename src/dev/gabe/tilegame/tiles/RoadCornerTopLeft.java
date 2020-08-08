package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCornerTopLeft extends Tile{

	public RoadCornerTopLeft( int id) {
		super(Assets.roadCornerTopLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
