package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class RoadCenterDown extends Tile{

	public RoadCenterDown( int id) {
		super(Assets.roadCenterDown, id);
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

}
