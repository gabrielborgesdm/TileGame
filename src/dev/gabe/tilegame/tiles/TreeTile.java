package dev.gabe.tilegame.tiles;

import dev.gabe.tilegame.gfx.Assets;

public class TreeTile extends Tile{

	public TreeTile( int id) {
		super(Assets.tree, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
