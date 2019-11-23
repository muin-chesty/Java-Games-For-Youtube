package pack1;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
	private int xPos;
	private int yPos;
	
	private int width;
	private int height;
	
	private int red;
	private int green;
	private int blue;
	
	public Star()
	{
		super();
	}
	
	public Star(int xPos, int yPos, int width, int height)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}
	
	public void randomizeColour()
	{
		// Will be defined
	}
	
	public Color randomizeColor()
	{
		// Will be defined
		return Color.black;
		
	}
	// 0-255
	public int randomizeColor(int limit)
	{
		// Will be defined
		return 0;
	}
	
	public void drawStar(Graphics g)
	{
		
	}
	
	
}

