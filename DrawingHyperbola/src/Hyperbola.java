

import java.awt.*;

public class Hyperbola {

		// The width and height of the DrawingPanel.
		  public static final int PANEL_SIZE = 512;   // PANEL_SIZE given

		  // Right now this draws an X, but should draw two hyperbolas.
		  public static void main(String[] args) {
		    DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
		    Graphics g = panel.getGraphics();
		   // g.drawLine(0, 0, PANEL_SIZE, PANEL_SIZE);
		    //g.drawLine(0, PANEL_SIZE, PANEL_SIZE, 0);
		  
		  
		
		    for ( int i = 0; i <= PANEL_SIZE ; i++) {  // I set a loop that draw the lines for both left and right begin at 1 and util the PANEL_SIZE has reached, increase by 1.
		   
		    	
		    	
		    	// Implement form g.drawline ( x,y,width,height)
		    
		   g.drawLine(0 , i*32, i*32,PANEL_SIZE); // This is left side of the hyperbola, The y-axis is increasing by 32 and the width increasing by 32
			//g.setColor(Color.RED);
		  
		   
		   g.drawLine(i*8,0, PANEL_SIZE, i*8); // This is the right side of the hyperbola, The X-axis is increasing by 8 and the heigh increase by 8
			//g.setColor(Color.GREEN);
		   
		    
		   
		  
		    /*   g.drawLine (0, 0, 0, 512);
		    g.setColor(Color.RED);
		   
		    
		    g.drawLine (0, 32,32, 512);
		    g.setColor(Color.BLUE); 
		    g.drawLine (0, 64 ,64, 512);
		    g.setColor(Color.BLACK);
		    g.drawLine (0, 96, 96, 512);
		    g.setColor(Color.GREEN);
		    g.drawLine (0, 128,128, 512);
		    g.setColor( Color.YELLOW);*/
		
		  
		  }
}
}