package pack1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level_1 extends JPanel implements KeyListener{
	
	private final short WIDTH = 1400;
	private final short HEIGHT = 700;
	private final short amountOfCoins = 100;
	private final int lengthOfStars = 100;
	private final String backgroundImagePath = "bg.png";
	private final String coinImagePath = "coin.png";
	private final int widthOfStar = 1;
	private final int heightOfStar = 2;
	
	private JFrame window = new JFrame("Collect Coin");
	private Star[] stars = new Star[lengthOfStars];
	private Player player = new Player(10,10,15,15);
	Coin[] coins = new Coin[100];
	private int time = 60;
	public static int score = 0;
	
	
	Level_1()
	{
//		this.setForeground(Color.BLACK);
//		this.setBackground(Color.BLACK);


		window.add(this);
		this.setFocusable(true);
		this.addKeyListener(this);
		
		initialiseStars();
		initCoins();
		
		Thread thread = new Thread(()->
		{
			while(time > 0) {
			try {
				Thread.sleep(1000);
				time--;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			window.dispose();
			
		});
		thread.start();
		window.setSize(new Dimension(WIDTH,HEIGHT));
		window.setLocation(0, 0);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public int randomX()
	{
		return (int) ( Math.random() * WIDTH);
	}
	
	public int randomY()
	{
		return (int) ( Math.random() * HEIGHT);
	}
	public void initialiseStars()
	{
		for(int i = 0; i < stars.length; i++)
		{
			stars[i] = new Star(randomX(),randomY(),widthOfStar,heightOfStar);
		}
	}
	public void initCoins()
	{
		for(int i = 0; i < coins.length; i++)
		{
			coins[i] = new Coin(randomX(),randomY(),15,15,player);
		}
	}

	
	public void paint(Graphics g)
	{
		super.paint(g);
		this.setBackground(new Color(stars[0].randomizeBlue(60),0,0));
		ImageIcon img = new ImageIcon(backgroundImagePath);
		//g.drawImage(img.getImage(), 0, 0, null);
		for(short i = 0; i < stars.length ; i++)
			stars[i].drawStar(g);
		for(int i = 0; i < coins.length; i++)
			coins[i].drawCoin(g);
		player.draw(g);
		g.drawString("Time Remaining : "+time, 10, 10);
		g.drawString("Score : "+score, 10, 40);
		
		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			for(int i = 0; i < coins.length; i++)
					coins[i].isCollected();
			player.setXSpeed(5);
			

		}
		else if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			for(int i = 0; i < coins.length; i++)
				coins[i].isCollected();
			player.setXSpeed(-5);

		}
		else if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			for(int i = 0; i < coins.length; i++)
				coins[i].isCollected();
			player.setYSpeed(-5);

		}
		else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			for(int i = 0; i < coins.length; i++)
				coins[i].isCollected();
			player.setYSpeed(5);

		}
		else
		{
			player.setXSpeed(0);
			player.setYSpeed(0);
		}
			
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
//		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
//		{
//			for(int i = 0; i < coins.length; i++)
//					coins[i].isCollected();
//			player.setXSpeed(5);
//			
//
//		}
//		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
//		{
//			for(int i = 0; i < coins.length; i++)
//				coins[i].isCollected();
//			player.setXSpeed(-5);
//
//		}
//		if(arg0.getKeyCode() == KeyEvent.VK_UP)
//		{
//			for(int i = 0; i < coins.length; i++)
//				coins[i].isCollected();
//			player.setYSpeed(-5);
//
//		}
//		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
//		{
//			for(int i = 0; i < coins.length; i++)
//				coins[i].isCollected();
//			player.setYSpeed(5);
//
//		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

		
	}

}
