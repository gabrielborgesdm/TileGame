package dev.gabe.tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.gabe.tilegame.entities.statics.TreeTile;

public class Tile {
	
	//STATIC VARIABLES
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile stoneTile = new StoneTile(2);
	public static Tile treeTile = new TreeTile(3);
	
	public static Tile roadCenterDown = new RoadCenterDown(4);
	public static Tile roadCenterLeft = new RoadCenterLeft(5);
	public static Tile roadCenterTop = new RoadCenterTop(6);
	public static Tile roadCenterRight = new RoadCenterRight(7);
	
	public static Tile roadVertical = new RoadVertical(8);
	public static Tile roadHorizontal = new RoadHorizontal(9);
	
	public static Tile roadCornerTopLeft = new RoadCornerTopLeft(10);
	public static Tile roadCornerTopRight = new RoadCornerTopRight(11);
	public static Tile roadCornerDownLeft = new RoadCornerDownLeft(12);
	public static Tile roadCornerDownRight = new RoadCornerDownRight(13);
	
	
	
	
	//CLASS
	public static final int TILE_WIDTH = 64, TILE_HEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
}
