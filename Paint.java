import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Paint extends Challange1_Panel{
    
	private int Screen_Width, Screen_Height,Unit_Size,Number;
	
	
	public Paint()
	{
		Screen_Width = 0;
		Screen_Height = 0;
		Unit_Size=0;
		Number=0;
	}

	public Paint(int screen_Width, int screen_Height,int unit_size, int number) {
		super();
		Screen_Width = screen_Width;
		Screen_Height = screen_Height;
		Unit_Size=unit_size;
		Number=number;
		
	}
	
	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		this.Number = number;
	}

	public int getScreen_Width() {
		return Screen_Width;
	}

	public void setScreen_Width(int screen_Width) {
		Screen_Width = screen_Width;
	}

	public int getScreen_Height() {
		return Screen_Height;
	}

	public void setScreen_Height(int screen_Height) {
		Screen_Height = screen_Height;
	}




	public int getUnit_Size() {
		return Unit_Size;
	}

	public void setUnit_Size(int unit_Size) {
		Unit_Size = unit_Size;
	}
	
	
	
	

	
	

	public void draw_dots(Graphics g) {
		
		       switch(Number)
		       {
		       case 1:
	                  g.setColor(new Color(0xc53030));
	                  break;
		       case 2:
	                  g.setColor(new Color(0xd34a4a));
	                  break;
		       case 3:
	                  g.setColor(new Color(0xdb6b6b));
	                  break;
		       case 4:
	                  g.setColor(new Color(0xe9a5a5));
	                  break;
		       case 5:
	                  g.setColor(new Color(0xfdf7f7));
	                  break;
		       case 6:
	                  g.setColor(new Color(0x1a8e7d));
	                  break;
		       case 7:
	                  g.setColor(new Color(0x25cbb2));
	                  break;
		       case 8:
	                  g.setColor(new Color(0x8beadb));
	                  break;
		       case 9:
	                  g.setColor(new Color(0x527ef4));
	                  break;
		       case 10:
	                  g.setColor(new Color(0x3f6ff3));
	                  break;
		       case 11:
	                  g.setColor(new Color(0xf3a744));
	                  break;
		       case 12:
	                  g.setColor(new Color(0xba9f82));
	                  break;
		       case 99:
		    	   g.setColor(new Color(0xFDD835));
	                  break;


		       }
		       
		       

                  g.fillOval(Screen_Width, Screen_Height, Unit_Size, Unit_Size);
                  
                  String nr;
                  if(Number!=99)
                   nr=Integer.toString(Number);
                  else
                	  nr="Z";
                 
                  
                  
                 g.setColor(Color.black);
                  FontMetrics fm = g.getFontMetrics();
                  Rectangle2D rect = fm.getStringBounds("9", g);
                  g.drawString(nr, (int) (Screen_Width  + Unit_Size/2 - rect.getWidth()/2),
                                    (int) (Screen_Height  + Unit_Size/2 + rect.getHeight()/2));
                  

		}
	
	public void draw_routs(Graphics g)
	{
		 switch(Number)
	       {
	       case 1:
                g.setColor(new Color(0xc53030));
                break;
	       case 2:
                g.setColor(new Color(0xd34a4a));
                break;
	       case 3:
                g.setColor(new Color(0xdb6b6b));
                break;
	       case 4:
                g.setColor(new Color(0xe9a5a5));
                break;
	       case 5:
                g.setColor(new Color(0xfdf7f7));
                break;
	       case 6:
                g.setColor(new Color(0x1a8e7d));
                break;
	       case 7:
                g.setColor(new Color(0x25cbb2));
                break;
	       case 8:
                g.setColor(new Color(0x8beadb));
                break;
	       case 9:
                g.setColor(new Color(0x527ef4));
                break;
	       case 10:
                g.setColor(new Color(0x3f6ff3));
                break;
	       case 11:
                g.setColor(new Color(0xf3a744));
                break;
	       case 12:
                g.setColor(new Color(0xba9f82));
                break;
	       case 99:
	    	   g.setColor(new Color(0xFDD835));
                break;


	       }
		
		//g.fillOval(Screen_Width, Screen_Height, Unit_Size, Unit_Size);
		g.fillRect(Screen_Width, Screen_Height, Unit_Size, Unit_Size);
		g.setColor(Color.cyan);
		g.fillRect(Screen_Width-1, Screen_Height-1, Unit_Size-1, Unit_Size-1);
		
		 String nr;
         if(Number!=99)
          nr=Integer.toString(Number);
         else
       	  nr="Z";
        
         
         
        g.setColor(Color.BLUE);
         FontMetrics fm = g.getFontMetrics();
         Rectangle2D rect = fm.getStringBounds("9", g);
         g.drawString(nr, (int) (Screen_Width  + Unit_Size/2 - rect.getWidth()/2),
                           (int) (Screen_Height  + Unit_Size/2 + rect.getHeight()/2));


	}



	
	
	
}

