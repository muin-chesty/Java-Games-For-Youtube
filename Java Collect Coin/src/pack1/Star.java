package pack1;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
	private int xPos;
	private int yPos;
	
	private final int width = 3;
	private final int height = 3;
	
	@Override
	public String toString() {
		return "Star [xPos=" + xPos + ", yPos=" + yPos + ", width=" + width + ", height=" + height + ", red=" + red
				+ ", green=" + green + ", blue=" + blue + "]";
	}



	private int red;
	private int green;
	private int blue;
	
	public Star()
	{
		super();
	}
	
	public Star(int xPos, int yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	private int randomNumber()
	{
		return (int) (Math.random() * 255);
	}
	
	public void randomizeColour()
	{
		// Will be defined
		this.red = randomNumber();
		this.green = randomNumber();
		this.blue = randomNumber();
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
		randomizeColour();
		g.setColor(new Color(this.red, this.green, this.blue));
		
		g.fillOval(xPos, yPos, width, height);
	}
	
	
}

