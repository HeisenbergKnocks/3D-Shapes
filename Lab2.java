// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.

import java.awt.*;
import java.applet.*;


public class Lab2 extends Applet
{

    public void paint(Graphics g)
    {
    	this.setSize(800,600);
    	
        // DRAW CUBE
    	g.drawRect(100, 200, 50, 50);
    	g.drawRect(120, 220, 50, 50);
    	
    	g.drawLine(100, 200, 120, 220);
    	g.drawLine(150, 200, 170, 220);
    	g.drawLine(100, 250, 120, 270);
    	g.drawLine(150, 250, 170, 270);
    
    	
        // DRAW SPHERE
    	g.drawOval(550, 200, 200, 200);
    	
    	g.drawOval(625, 200, 50, 200);
    	g.drawOval(600, 200, 100, 200);
    	g.drawOval(575, 200, 150, 200);
    	
    	g.drawOval(550, 275, 200, 50);
    	g.drawOval(550, 250, 200, 100);
    	g.drawOval(550, 225, 200, 150);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
    	g.drawOval(50, 400, 150, 150); //big circle
    	
    	g.drawLine(50, 475, 200, 475); //horizontal line across
    	g.drawLine(50, 475, 125, 550); //line from left center to bottom center
    	g.drawLine(200, 475, 125, 550); //line from right center to bottom center
    	
    	g.drawOval(94, 475, 62, 62);

    	
        // DRAW APCS
    	g.fillRect(400, 500, 20, 100);
    	g.fillRect(400, 500, 40, 20);
    	g.fillRect(440, 500, 20, 100);
    	g.fillRect(400, 540, 40, 20);
    	
    	g.fillRect(480, 500, 20, 100);
    	g.fillRect(480, 500, 40, 20);
    	g.fillRect(520, 500, 20, 50);
    	g.fillRect(500, 540, 40, 20);
    	
    	g.fillRect(560, 500, 20, 100);
    	g.fillRect(560, 500, 55, 20);
    	g.fillRect(560, 580, 55, 20);
    	
    	g.fillRect(635, 500, 55, 20);
    	g.fillRect(635, 500, 20, 40);
    	g.fillRect(635, 540, 55, 20);
    	g.fillRect(670, 540, 20, 40);
    	g.fillRect(635, 580, 55, 20);
    	
    	
        // DRAW PACMEN FLOWER




    }


}
