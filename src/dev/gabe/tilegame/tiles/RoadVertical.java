package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadVertical extends Tile{

	public RoadVertical( int id) {
		super(Assets.roadVertical, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
