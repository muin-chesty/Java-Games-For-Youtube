package pack1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player {
	
	private int xPos;
	private int yPos;
	private int height;
	private int width;
	
	private Color color;
	
	public Player(int xPos, int yPos, int height, int width)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.width = width;
	}
	
	public void setXSpeed(int speed) 
	{

				this.xPos += speed;
			
	}
	
	public void setYSpeed(double speed)
	{
		this.yPos += speed;
	}
	
	public boolean hasCollected(Coin coin)
	{
		Rectangle coinRect = new Rectangle(coin.xPos, coin.yPos, coin.width + 1, coin.height + 1);
		Rectangle playerRect = new Rectangle(xPos, yPos, width + 1, height + 1);
		
		if(coinRect.intersects(playerRect))
		{
			coin.xPos = -1000;
			coin = null;
			Level_1.score++;
			return true;
		}
		return false;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(new Color(126,252,100));
		g.fillOval(xPos, yPos, width, height);
	}
	

}
