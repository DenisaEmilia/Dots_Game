import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Challange3 implements ActionListener{

	JFrame frame = new JFrame();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	 JButton back = new JButton("Back");
	 JButton reset = new JButton("Reset");
		JPanel panel=new Challange3_Panel();
	 
	 Challange3(){
	  
		 
		 
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(800,600);
		  frame.setLayout(new BorderLayout(1,1));
		  
		  
		  p1.setPreferredSize(new Dimension(150,50));
		  p1.setBackground(Color.BLACK);
		  p1.setLayout(new GridBagLayout());
		  GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          gbc.anchor = GridBagConstraints.NORTH;
          
          gbc.anchor = GridBagConstraints.CENTER;
          //gbc.fill = GridBagConstraints.VERTICAL;
          back.setPreferredSize(new Dimension(100,50));
          reset.setPreferredSize(new Dimension(100,50));
          
          back.setBackground(new Color(0x819ca9));
          reset.setBackground(new Color(0x819ca9));
          
          back.setFocusable(false);
  	      reset.setFocusable(false);
 
  	      back.addActionListener(this);
  	      reset.addActionListener(this);
  	    
          p1.add(back, gbc);
          p1.add(reset, gbc);
          panel.setBackground(new Color(0x1a2c38));
          
		 
		  frame.add(p1,BorderLayout.WEST);
		  frame.add(panel,BorderLayout.CENTER);
			frame.setVisible(true);
	  
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 
		 if(e.getSource()==back)
		 { frame.dispose();
		        User_interface myWindow = new User_interface();}
		 
		 if(e.getSource()==reset)
		 { frame.dispose();
		        Challange3 myWindow = new Challange3();}
		 
	}
}
