package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCenterLeft extends Tile{

	public RoadCenterLeft( int id) {
		super(Assets.roadCenterLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
