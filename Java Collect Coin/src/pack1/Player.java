package pack1;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;
	private int offset = 5;
	private int widthOfEye = 3, heightOfEye = 3;
	
	private Color color;
	
	private Level currentLevel;
	
	public int getSpeed()
	{
		return speed;
	}
	
	public Player(int xPos, int yPos, int width, int height, Color color, Level currentLevel)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
		this.width = width;
		this.height = height;
		
		if(currentLevel != null)
			this.currentLevel = currentLevel;
		else
			System.out.println("Level is null!");
		
	}
	
	public void moveRightAtSpeed(int speed)
	{
		this.speed = speed;
		for (int i = 1; i <= 5; i++)
		{
			if(currentLevel.widthOfLevel >= xPos)
				xPos += speed;
		}
			
	}
	
	public void moveLeftAtSpeed(int speed)
	{
		this.speed = speed;
		for (int i = 1; i <= 5; i++)
		{
			if(xPos > 0)
				xPos -= speed;
		}
			
	}
	
	public void moveUpAtSpeed(int speed)
	{
		this.speed = speed;
		for (int i = 1; i <= 5; i++)
		{
			if(yPos > 0)
				yPos -= speed;
		}
	}
	
	public void moveDownAtSpeed(int speed)
	{
		this.speed = speed;
		for (int i = 1; i <= 5; i++)
		{
			if(currentLevel.heightOfLevel >= yPos)
				yPos += speed;
		}
	}
	
	public void drawFacingRight(Graphics g)
	{

		g.setColor(color);
		g.fillOval(xPos, yPos, width, height);
		g.setColor(Color.YELLOW);
		g.fillRect(xPos + width - offset, yPos + offset, widthOfEye, heightOfEye);
		g.setColor(Color.BLACK);
		g.fillRect(xPos + widthOfEye * 6, yPos - (8 * (heightOfEye - offset)), widthOfEye + 5, heightOfEye - 1);
	}
	public void drawFacingLeft(Graphics g)
	{
		int offset = 5;
		g.setColor(color);
		g.fillOval(xPos, yPos, width, height);
		g.setColor(Color.YELLOW);
		g.fillRect(xPos + offset, yPos + offset, widthOfEye, heightOfEye);
		g.setColor(Color.BLACK);
		g.fillRect(xPos + widthOfEye - 1 , yPos - (8 * (heightOfEye - offset)), widthOfEye + 5, heightOfEye - 1);
	}
}
