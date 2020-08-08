package dev.gabe.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64;
	private static final int playerWidth = 64, playerHeight = 64;
	
	public static BufferedImage dirt, grass, stone, tree;
	public static BufferedImage roadVertical, roadHorizontal;
	public static BufferedImage roadCenterDown, roadCenterLeft, roadCenterTop, roadCenterRight;
	public static BufferedImage roadCornerTopLeft, roadCornerTopRight, roadCornerDownLeft, roadCornerDownRight;
	public static BufferedImage[] player, playerDown, playerTop, playerRight, playerLeft;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet2.png"));
		SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/character/character.png"));
		
		player = new BufferedImage[1];
		player[0] = playerSheet.crop(playerWidth * 0, playerHeight * 1, playerWidth, playerHeight);
		
		playerDown = new BufferedImage[3];
		playerDown[0] = playerSheet.crop(playerWidth * 0, playerHeight * 1, playerWidth, playerHeight);
		playerDown[1] = playerSheet.crop(playerWidth * 1, playerHeight * 1, playerWidth, playerHeight);
		playerDown[2] = playerSheet.crop(playerWidth * 2, playerHeight * 1, playerWidth, playerHeight);
		
		playerTop = new BufferedImage[3];
		playerTop[0] = playerSheet.crop(playerWidth * 3, playerHeight * 1, playerWidth, playerHeight);
		playerTop[1] = playerSheet.crop(playerWidth * 4, playerHeight * 1, playerWidth, playerHeight);
		playerTop[2] = playerSheet.crop(playerWidth * 5, playerHeight * 1, playerWidth, playerHeight);
		
		playerRight = new BufferedImage[3];
		playerRight[0] = playerSheet.crop(playerWidth * 0, playerHeight * 3, playerWidth, playerHeight);
		playerRight[1] = playerSheet.crop(playerWidth * 1, playerHeight * 3, playerWidth, playerHeight);
		playerRight[2] = playerSheet.crop(playerWidth * 2, playerHeight * 3, playerWidth, playerHeight);
		
		
		playerLeft = new BufferedImage[3];
		playerLeft[0] = playerSheet.crop(playerWidth * 3, playerHeight * 3, playerWidth, playerHeight);
		playerLeft[1] = playerSheet.crop(playerWidth * 4, playerHeight * 3, playerWidth, playerHeight);
		playerLeft[2] = playerSheet.crop(playerWidth * 5, playerHeight * 3, playerWidth, playerHeight);
		
		tree = sheet.crop(width * 1, height * 5, width, height);
		dirt = sheet.crop(width * 5, 0, width, height);
		grass = sheet.crop(width * 2, height * 7, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		
		roadCenterDown = sheet.crop(width * 5, height * 2, width, height);
		roadCenterLeft = sheet.crop(width * 0, height * 1, width, height);
		roadCenterTop = sheet.crop(width * 3, height * 7, width, height);
		roadCenterRight = sheet.crop(width * 2, height * 6, width, height);
		
		roadCornerTopLeft = sheet.crop(width * 4, height * 2, width, height);
		roadCornerTopRight = sheet.crop(width * 3, height * 6, width, height);
		roadCornerDownLeft = sheet.crop(width * 3, height * 5, width, height);
		roadCornerDownRight = sheet.crop(width * 4, height * 3, width, height);
		
		roadVertical = sheet.crop(width * 1, height * 0, width, height);
		roadHorizontal = sheet.crop(width * 1, height * 1, width, height);
		
		
		
	}
}
