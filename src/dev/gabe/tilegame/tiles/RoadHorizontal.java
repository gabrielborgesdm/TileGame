package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadHorizontal extends Tile{

	public RoadHorizontal( int id) {
		super(Assets.roadHorizontal, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
