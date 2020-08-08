package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCenterTop extends Tile{

	public RoadCenterTop( int id) {
		super(Assets.roadCenterTop, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
