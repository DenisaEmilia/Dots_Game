import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Challange4_Panel extends JPanel implements MouseListener, ActionListener{
	
	int startx, starty;
	
	int x=99;
	String numar;
	int y;
	
	JPanel p3=new JPanel();

	JPanel p3_1=new JPanel();

	JPanel p3_2=new JPanel();
	
	
	  JTextField Text1 = new JTextField("Numbers of Columns");
	  JTextField Text3 = new JTextField("Numbers form 1-12");
	  JTextField Text2=new JTextField();
	  JTextField Text4=new JTextField();

	  int board[][]=new int[x][x];

	
	int Unit_size=50;
	int True_width,True_height;
	 Challange4_Panel()
	   {
			this.setFocusable(true);

			  this.setBackground(new Color(0x2C363F));
			  this.setPreferredSize(new Dimension(150,100));
			  this.addMouseListener(this);
			  //this.addMouseMotionListener(this);
			  this.setVisible(true);
			  
			  this.setLayout(new BorderLayout(1,1));
			  

			  p3.setFocusable(true);

			  p3.setBackground(new Color(0x1DD3B0));
			  p3.setPreferredSize(new Dimension(150,100));
			  p3.addMouseListener(this);
			  //this.addMouseMotionListener(this);
			  p3.setVisible(true);
			  p3.setLayout(new GridLayout(1,1));
			  
			  
			  p3_1.setFocusable(true);

			  p3_1.setBackground(new Color(0xAFFC41));
			  p3_1.setPreferredSize(new Dimension(150,100));
			  p3_1.addMouseListener(this);
			  //this.addMouseMotionListener(this);
			  p3_1.setVisible(true);
			  
			  
			  

			  Text2.setBounds(50,100, 200,30); 
			  
			  
			  Text3.setBounds(50,100, 200,30); 
			  Text3.setEditable(false);
			 
			  Text4.setBounds(50,100, 200,30); 
			  
			  
			  
			  
			  GridBagConstraints gbc1 = new GridBagConstraints();
	          gbc1.gridwidth = GridBagConstraints.REMAINDER;
	          gbc1.anchor = GridBagConstraints.EAST;
	          
	          gbc1.anchor = GridBagConstraints.CENTER;
	          //gbc.fill = GridBagConstraints.VERTICAL;
	          Text1.setPreferredSize(new Dimension(110,20));
	          Text2.setPreferredSize(new Dimension(50,50));
	          Text3.setPreferredSize(new Dimension(110,20));
	          Text4.setPreferredSize(new Dimension(50,50));
	          
	          Text1.setBackground(new Color(0xF5C396));
	          Text2.setBackground(new Color(0xF5C396));
	          
	          Text2.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) {
	    	      char c = e.getKeyChar();
	    	      if (!((c >= '0') && (c <= '9') ||
	    	         (c == KeyEvent.VK_BACK_SPACE) ||
	    	         (c == KeyEvent.VK_DELETE))) {
	    	        //getToolkit().beep();
	    	        e.consume();
	    	      }
	    	    
	    	  }});
	          
	          Text3.setBackground(new Color(0xF09D51));
	          Text4.setBackground(new Color(0xF09D51));

	          
	          Text2.addActionListener(this);
	          Text4.addActionListener(this);
	          Text4.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) {
	    	      char c = e.getKeyChar();
	    	      if (!((c >= '0') && (c <= '9') ||
	    	         (c == KeyEvent.VK_BACK_SPACE) ||
	    	         (c == KeyEvent.VK_DELETE))) {
	    	        //getToolkit().beep();
	    	        e.consume();
	    	      }
	    	    
	    	  }});
			  p3_1.add(Text1);
			  p3_1.add(Text2);
			  
			  
			  
			  
			  p3_2.setFocusable(true);

			  p3_2.setBackground(Color.green);
			  p3_2.setPreferredSize(new Dimension(150,100));
			  p3_2.addMouseListener(this);
			  //this.addMouseMotionListener(this);
			  p3_2.setVisible(true);
			  
			  p3_2.add(Text3);
			  p3_2.add(Text4);
              
			  p3.add(p3_1);
			  p3.add(p3_2);
			  this.add(p3,BorderLayout.SOUTH);
			  
			 
			  
	   }
	 

	 
	 public void paintComponent(Graphics g) {
   	  super.paintComponent(g);
   	   
   	 
		Text4.setEditable(true);
   	  
   	  draw_matrix(g);
   	  
   	  
   	for (int a = 0; a < x; a++) {
		for (int b = 0; b < x; b++)

		{
			int number;
			int color_board;

			if (board[a][b] < 0)
				color_board = -board[a][b];
			else
				color_board = board[a][b];

			if (color_board == 1) {
				number=1;
				Paint p1=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
				p1.setUnit_Size(Unit_size);
				p1.draw_dots(g);
			}
				
				if (color_board == 2) {
					number=2;
					Paint p2=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p2.setUnit_Size(Unit_size);
					p2.draw_dots(g);
				}
				
				if (color_board == 3) {
					number=3;
					Paint p3=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p3.setUnit_Size(Unit_size);
					p3.draw_dots(g);
				}
				
				if (color_board == 4) {
					number=4;
					Paint p4=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p4.setUnit_Size(Unit_size);
					p4.draw_dots(g);
				}
				
				if (color_board == 5) {
					number=5;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 6) {
					number=6;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 7) {
					number=7;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 8) {
					number=8;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				
				if (color_board == 9) {
					number=9;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				
				if (color_board == 10) {
					number=10;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 11) {
					number=11;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 12) {
					number=12;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
				
				if (color_board == 99) {
					number=99;
					Paint p5=new Paint(Unit_size * (b), Unit_size * (a), Unit_size,number);
					p5.setUnit_Size(Unit_size);
					p5.draw_dots(g);
				}
			     
				

			}
   	}
   	  
	    
     }


	 public void draw_matrix(Graphics g)
	  	{
		 
		 if(x<40) {
		               
		 //System.out.println(True_width+True_height);
		 True_width=this.getWidth();
	   	  True_height=this.getHeight()-p3.getHeight();
	   	  
			//System.out.println(True_width+" "+True_height);

	   	  
	   	 try { if(True_width<True_height)
	   		  Unit_size=(int)(True_width/x);
	   	  else
	   		  Unit_size=(int)(True_height/x);
	   	 }
	   	 catch(ArithmeticException e)
	   	 {
	   		 Unit_size=50;
	   	 }

	    	  g.setColor(Color.white);
	  		for (int i = 0; i < x+1; i++) {
	    		 //System.out.println("aici");

	  			g.drawLine(i * Unit_size, 0, i * Unit_size, this.getHeight());
	  			g.drawLine(0, i * Unit_size, this.getWidth(), i * Unit_size);
	  			
	  			
	  		}
	  		
		 }
	  		
	  		
	  		repaint();
	         
	  		
	  		 
	  	}
	   
	

     
public Boolean Check_Points(int i,int j)
{
     if(i+1<x && board[i+1][j]!=0)
    	 return false;
     if(j+1<x && board[i][j+1]!=0)
    	 return false;
     if(i-1>-1 && board[i-1][j]!=0)
    	 return false;
     if(j-1>-1 && board[i][j-1]!=0)
    	 return false;
  
     
     return true;
}



    


	@Override
	public void mouseClicked(MouseEvent e) {
          
		
	}








	@Override
	public void mousePressed(MouseEvent e) {
		boolean selected = false;
		int mouseX = e.getX();
		int mouseY = e.getY();

		startx = (int) (mouseX / Unit_size);
		starty = (int) (mouseY / Unit_size);
		
		if(startx<x && starty<x && board[starty][startx]==0 && Check_Points(starty,startx)==true)
			{board[starty][startx]=y;
			System.out.println(startx+" "+starty);
			}
			
			
			
			
			repaint();
			
		
	}
		
	








	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}








	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}








	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	  
	   


	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Text2)
        {
        numar=Text2.getText();
        try
		{x=Integer.parseInt(numar);
		}
	 catch(NumberFormatException e1)
	 {
		 System.out.println("aici");
		 x=1;
	 }
        }
        
        
        
        if(e.getSource()==Text4)
        {
        numar=Text4.getText();
        try
        {   
   		
   		 //Text4.setText(" ");

        	y=Integer.parseInt(numar);
        	
        	if(y>12 || y<0)
        		y=0;
        	
        	for(int i=0;i<x;i++)
			{
				for(int j=0;j<x;j++)
				{
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
        		
		}
	 catch(NumberFormatException e1)
	 {
		 System.out.println("aici");
		 
		Text4.setEditable(false);
		 y=0;
	 }
        }
		
		
		
	}

      
    
    		  
    		  
    		  
  
    	  
    	  
    	

      
      
      
     
      }  

      
    


