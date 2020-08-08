package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCenterRight extends Tile{

	public RoadCenterRight( int id) {
		super(Assets.roadCenterRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
