package dev.gabe.tilegame.entities.statics;

import dev.gabe.tilegame.gfx.Assets;
import dev.gabe.tilegame.tiles.Tile;

public class TreeTile extends Tile{

	public TreeTile( int id) {
		super(Assets.tree, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
