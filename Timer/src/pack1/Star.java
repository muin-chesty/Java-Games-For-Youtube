package pack1;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
	
	
	public int xPos;
	public int yPos;
	
	public int width;
	public int height;
	
	private int red;
	private int green;
	private int blue;
	
	private Color color;
	
	public Star ()
	{
		super();
	}
	
	public Star (int xPos, int yPos, int width, int height)
	{
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}
	
	public int randomizeRed()
	{
		 return red = (int) (Math.random() * 255);
	}
	
	public int randomizeGreen()
	{
		return green = (int) (Math.random() * 255);
	}
	
	public int randomizeBlue()
	{
		return blue = (int) (Math.random() * 255);
	}
	
	public int randomizeBlue(int limit)
	{
		return blue = (int) (Math.random() * limit);
	}
	public void animate()
	{
//		Thread thread = new Thread(()-> {
//			while(true)
//			{
//				color = new Color(randomizeRed(), randomizeGreen(), randomizeBlue());
//			}
//		});
//		thread.start();
		color = new Color(randomizeRed(), randomizeGreen(), randomizeBlue());
	}
	
	public void drawStar(Graphics g)
	{
		animate();
		g.setColor(color);
		g.fillOval(xPos, yPos, width, height);
		g.fillRect(xPos, yPos, width, height);
	}
}
