import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Challange3_Panel extends JPanel implements MouseListener, MouseMotionListener{
	
	//the matrix from csv file
	int[][] matrix_integer=new int[43][43];
	//initial dimensions
	int width_panel=800;
	int height_panel=800;
    int Unit_size=50;
	boolean bad_routed=false;
	int bad[]= {0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	//allow to extract the matrix just once
    boolean allow=true;
    
    //an object is selected
    boolean selected=false;
    
   
	
	//coordonates
	
	int startx,starty,culoare,pointx,pointy;
	
	int x_STOP, y_STOP;
    
	//constructor
	 Challange3_Panel()
	   {
			this.setFocusable(true);

			  this.setBackground(Color.red);
			  this.setPreferredSize(new Dimension(150,100));
			  this.addMouseListener(this);
			  this.addMouseMotionListener(this);
			  this.setVisible(true);
			  
			  
	   }

	 //Matrix extract
	 public void Matrix()
	   {
		 
	   List<String[]> rowList = new ArrayList<String[]>();
		try (BufferedReader br = new BufferedReader(new FileReader("Step_Three.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] lineItems = line.split(",");
		        rowList.add(lineItems);
		    }
		    br.close();
		}
		catch(Exception e){
			System.out.println("Boss nu i bine");
    		}
		
		
		int n=rowList.size();
		String [][] matrix = new String[rowList.size()][];
		for (int i = 0; i <41 ; i++) {
		    String[] row = rowList.get(i);
		    matrix[i] = row;
		}
	
		System.out.println();
		
		
		
		
	//I transform the String matrix in an integer one
		for(int i=0;i<41;i++)
		{
			for(int j=0;j<41;j++)
				
			{
				try {
				matrix_integer[i][j]=Integer.parseInt(matrix[i][j]);
				//matching[matrix_integer[i][j]]++;
				//System.out.print(matrix_integer[i][j]+"  ");
				}
				catch(NumberFormatException z)
				{
					matrix_integer[i][j]=99;
					x_STOP=i;
					y_STOP=j;
					
					
					
					
				}
				
				
				
			}
				
			//System.out.println();
		}
		
		matrix_integer[x_STOP-1][y_STOP]=98;
		matrix_integer[x_STOP][y_STOP-1]=98;
		matrix_integer[x_STOP+1][y_STOP]=98;
		matrix_integer[x_STOP][y_STOP+1]=98;
		matrix_integer[x_STOP+1][y_STOP+1]=98;
		matrix_integer[x_STOP-1][y_STOP-1]=98;
		matrix_integer[x_STOP+1][y_STOP-1]=98;
		matrix_integer[x_STOP-1][y_STOP+1]=98;
		
		/*for(int i=0;i<41;i++)
		{
			for(int j=0;j<41;j++)
				System.out.print(matrix_integer[i][j]+" ");
			System.out.println();
		}
		 
		
	   }
	   */
}
	   
	 
	
	 

      public void paintComponent(Graphics g) {
    	  super.paintComponent(g);
    	  if(allow==true)
    	  {
    		  Matrix();
    		  allow=false;
    	  }
    	  
    	  //drawing the matrix s lines
    	  
			
    	  //matrix.setUnit_size(Unit_size);
    	 
    	  width_panel=this.getWidth();
			 height_panel=this.getHeight();
			 
			if(width_panel<height_panel)
			   Unit_size=(int)width_panel/41;
			else
				Unit_size=(int)height_panel/41;
			
			//System.out.println(Unit_size+" "+width_panel+" "+height_panel);
			
    	  draw_matrix(g);
    	 
    	  for (int a = 0; a < 41; a++) {
				for (int b = 0; b < 41; b++)

				{
					int number;
					int color_board;

					if (matrix_integer[a][b] < 0)
						color_board = -matrix_integer[a][b];
					else
						color_board = matrix_integer[a][b];

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
    	                poorly_routed(g);

    	              
      }
    	  
    	  
    	  
	    


      
      public void draw_matrix(Graphics g)
  	{
    	 
			
    	  g.setColor(Color.white);
  		for (int i = 0; i < 42; i++) {
  			g.drawLine(i * Unit_size, 0, i * Unit_size, this.getHeight());
  			g.drawLine(0, i * Unit_size, this.getWidth(), i * Unit_size);
  			
  			
  		}
         
  		
  		 
  	}
      
      public void poorly_routed(Graphics g)
      {
    	  
    	  
    	  for(int i=0;i<41;i++)
    	  {
    		  for(int j=0;j<41;j++)
    			  
    			  if(matrix_integer[i][j]!=0 && matrix_integer[i][j]<98 )
    			  {
    				  int number=matrix_integer[i][j];
    				  
    				  if(i+1<41 && matrix_integer[i+1][j]!=matrix_integer[i][j] && matrix_integer[i+1][j]!=0 && matrix_integer[i+1][j]<98 )
    				  {
    					  bad[matrix_integer[i+1][j]]=matrix_integer[i][j];
    					  if(matrix_integer[i+1][j]<matrix_integer[i][j])
    					  { 
    						  Paint p5=new Paint(Unit_size * (j), Unit_size * (i), Unit_size,number);
							p5.setUnit_Size(Unit_size);
							
							p5.draw_routs(g);
    					  }
    				  }
    				  
    				  if(i-1>=0 && matrix_integer[i-1][j]!=matrix_integer[i][j] && matrix_integer[i-1][j]!=0 && matrix_integer[i-1][j]<98 )
    				  {
    					  bad[matrix_integer[i-1][j]]=matrix_integer[i][j];
    					  if(matrix_integer[i-1][j]<matrix_integer[i][j])
    					  { 
    						  Paint p5=new Paint(Unit_size * (j), Unit_size * (i), Unit_size,number);
							p5.setUnit_Size(Unit_size);
							
							p5.draw_routs(g);
    					  }
    				  }
    				  
    				  
    				  if(j+1<41 && matrix_integer[i][j+1]!=matrix_integer[i][j] && matrix_integer[i][j+1]!=0 && matrix_integer[i][j+1]<98 )
    				  {
    					  bad[matrix_integer[i][j+1]]=matrix_integer[i][j];
    					  if(matrix_integer[i][j+1]<matrix_integer[i][j])
    					  { 
    						  Paint p5=new Paint(Unit_size * (j), Unit_size * (i), Unit_size,number);
							p5.setUnit_Size(Unit_size);
							
							p5.draw_routs(g);
    					  }
    				  }
    				  
    				  if(j-1>=0 && matrix_integer[i][j-1]!=matrix_integer[i][j] && matrix_integer[i][j-1]!=0 && matrix_integer[i][j-1]<98  )
    				  {
    					  bad[matrix_integer[i][j-1]]=matrix_integer[i][j];
    					  if(matrix_integer[i][j-1]<matrix_integer[i][j])
    					  {
    						  Paint p5=new Paint(Unit_size * (j), Unit_size * (i), Unit_size,number);
							p5.setUnit_Size(Unit_size);
							
							p5.draw_routs(g);
    					  }
    				  }
    			  }
    		  
    		  
    		  
    		  
    	  }
    	  
    	  BAD_Routed();

      }
      
      
      public void BAD_Routed()
      {
    	  
    	  
    	  int nr=0;
    	  for(int i=0;i<13;i++)
    	  {
    		  if(bad[i]!=0)
    		  { 
    			  nr++;
    			  int  copy=bad[i];
    			  System.out.print("Routed "+nr+":  " +copy+" " );
    			  
    			  
    			  bad_routed=true;
    			  for(int j=0;j<13;j++)
    			  {
    				  if(copy==bad[j])
    					  {System.out.print(j+" ");
    					      bad[j]=0;
    					  }
    				  
    			  }
    			  
    			  System.out.println();

    			  
    			  //bad[i]=0;
    				  
    		  }
    		 
    	  }
    	  

      }
    

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		boolean selected = false;
		int mouseX = e.getX();
		int mouseY = e.getY();

		startx = (int) (mouseX / Unit_size);
		starty = (int) (mouseY / Unit_size);
		culoare = matrix_integer[starty][startx];
		if (matrix_integer[starty][startx] != 0) {
			selected = true;

			System.out.println(selected);

		} else
			{selected = false;
			//System.out.println(selected);
			System.out.println(selected);

			}
         
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		pointx = (int) (e.getX() / Unit_size);
		pointy = (int) (e.getY() / Unit_size);
		
		int match=0;
			

		
		
		
		if(pointx+1<41 )
		  {if(matrix_integer[pointy][pointx] == -matrix_integer[pointy][pointx + 1])
			  match=1;
		  }
		else
			if(matrix_integer[pointy][pointx] == -matrix_integer[pointy][pointx-1])
			{ match=1;
			  //col=board[pointy][pointx-1];
			}
			
		
		if(pointx-1>0)
		  {if(matrix_integer[pointy][pointx] == -matrix_integer[pointy][pointx - 1])
			  match=1;
		  }
		else
			if(matrix_integer[pointy][pointx] == -matrix_integer[pointy][pointx+1])
				  match=1;
		
		if(pointy-1>0 )
		  {if(matrix_integer[pointy][pointx] == -matrix_integer[pointy+1][pointx])
			  match=1;
		  }
		else
			if(matrix_integer[pointy][pointx] == -matrix_integer[pointy+1][pointx])
				  match=1;
			

		if(pointy+1<41 )
		  {if(matrix_integer[pointy][pointx] == -matrix_integer[pointy+1][pointx])
			  match=1;
		  }
		else
			if(matrix_integer[pointy][pointx] == matrix_integer[pointy-1][pointx])
				  match=1;
		
		
		
		
		
	
		
	

		if (match==0) { 
			for (int i = 0; i < 41; i++) {
				for (int j = 0; j < 41; j++)

					if (matrix_integer[i][j] < 0)
				      	{matrix_integer[i][j] = 0;
				      	
				      	
				      	}
					
					
				
			}
		} else {
			//number_match--;
			for (int i = 0; i < 41; i++) {
				for (int j = 0; j < 41; j++)

					if (matrix_integer[i][j] < 0)
						matrix_integer[i][j] = culoare;
				
				
			}
		}
		
	
		repaint();
				
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
	public void mouseDragged(MouseEvent e) {
		pointx = (int) (e.getX() / Unit_size);
		pointy = (int) (e.getY() / Unit_size);

		
	
		
		while (pointx == startx + 1 ) {
			if (matrix_integer[pointy][pointx] == 0) {
				matrix_integer[pointy][pointx] = -culoare;
			}
			startx = startx + 1;
			 
		}

		while (pointx == startx - 1  ) {
			if (matrix_integer[pointy][pointx] == 0) {
				matrix_integer[pointy][pointx] = -culoare;

			}
			startx = startx - 1;
			 
		}

		while (pointy == starty - 1) {
			if (matrix_integer[pointy][pointx] == 0) {
				matrix_integer[pointy][pointx] = -culoare;

			}
			starty = starty - 1;
			
		}

		while (pointy == starty + 1 ) {
			if (matrix_integer[pointy][pointx] == 0) {
				matrix_integer[pointy][pointx] = -culoare;

			}
			starty = starty + 1;
			 
		}
	  
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
