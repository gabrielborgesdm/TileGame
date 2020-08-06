package dev.gabe.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	//CHARACTER - private static final int width = 59, height = 88;
	
	private static final int width = 64, height = 64;
	private static final int playerWidth = 50, playerHeight = 37;
	
	public static BufferedImage dirt, grass, stone, tree;
	public static BufferedImage[] player, playerRight, playerLeft;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet2.png"));
		SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/character/sheet.png"));
		SpriteSheet invertedPlayerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/character/sheetInverted.png"));
		
		player = new BufferedImage[4];
		player[0] = playerSheet.crop(playerWidth * 0, playerHeight * 0, playerWidth, playerHeight);
		player[1] = playerSheet.crop(playerWidth * 1, playerHeight * 0, playerWidth, playerHeight);
		player[2] = playerSheet.crop(playerWidth * 2, playerHeight * 0, playerWidth, playerHeight);
		player[3] = playerSheet.crop(playerWidth * 3, playerHeight * 0, playerWidth, playerHeight);
		
		playerRight = new BufferedImage[6];
		playerRight[0] = playerSheet.crop(playerWidth * 1, playerHeight * 1, playerWidth, playerHeight);
		playerRight[1] = playerSheet.crop(playerWidth * 2, playerHeight * 1, playerWidth, playerHeight);
		playerRight[2] = playerSheet.crop(playerWidth * 3, playerHeight * 1, playerWidth, playerHeight);
		playerRight[3] = playerSheet.crop(playerWidth * 4, playerHeight * 1, playerWidth, playerHeight);
		playerRight[4] = playerSheet.crop(playerWidth * 5, playerHeight * 1, playerWidth, playerHeight);
		playerRight[5] = playerSheet.crop(playerWidth * 6, playerHeight * 1, playerWidth, playerHeight);
		
		playerLeft = new BufferedImage[6];
		playerLeft[0] = invertedPlayerSheet.crop(playerWidth * 5, playerHeight * 1, playerWidth, playerHeight);
		playerLeft[1] = invertedPlayerSheet.crop(playerWidth * 4, playerHeight * 1, playerWidth, playerHeight);
		playerLeft[2] = invertedPlayerSheet.crop(playerWidth * 3, playerHeight * 1, playerWidth, playerHeight);
		playerLeft[3] = invertedPlayerSheet.crop(playerWidth * 2, playerHeight * 1, playerWidth, playerHeight);
		playerLeft[4] = invertedPlayerSheet.crop(playerWidth * 1, playerHeight * 1, playerWidth, playerHeight);
		playerLeft[5] = invertedPlayerSheet.crop(playerWidth * 0, playerHeight * 1, playerWidth, playerHeight);
		
		
		tree = sheet.crop(width * 1, height * 5, width, height);
		dirt = sheet.crop(width * 5, 0, width, height);
		grass = sheet.crop(width * 2, height * 7, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		
	}
}
