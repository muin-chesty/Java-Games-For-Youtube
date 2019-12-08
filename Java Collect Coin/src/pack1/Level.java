package pack1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level extends JPanel{
	
	public final int widthOfLevel = 1000;
	public final int heightOfLevel = 600;
	private int amountOfStars = 100;
	private final int initPlayerX = 2;
	private final int initPlayerY = 2;
	private final int widthOfPlayer = 20;
	private final int heightOfPlayer = 20;
	
	private JFrame window = new JFrame();
	private Star stars[] = new Star[amountOfStars];
	
	private Player superMario = new Player(initPlayerX, initPlayerY, widthOfPlayer, heightOfPlayer, Color.GREEN, this);
	
	
	private int randomX()
	{
		return (int) (Math.random() * widthOfLevel);
	}
	
	private int randomY()
	{
		return (int) (Math.random() * heightOfLevel);
	}
	
	public void initStars()
	{
		for(int i = 0; i < amountOfStars; i++)
			{
				stars[i] = new Star(randomX(), randomY());
				
			}
	}
	
	private void drawStar(Graphics g)
	{
		for(int i = 0; i < amountOfStars; i++)
			stars[i].drawStar(g);
	}
	public Level()
	{
		initStars();
		window.add(this);
		
		window.setSize(widthOfLevel, heightOfLevel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		this.setBackground(Color.BLACK);
		drawStar(g);
		superMario.drawFacingLeft(g);
		
		
		this.repaint();
	}

}
