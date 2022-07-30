import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class User_interface implements ActionListener{

	 JFrame frame = new JFrame();
	 JButton c1 = new JButton("Challange 1");
	 JButton c2 = new JButton("Challange 2");
	 JButton c3 = new JButton("Challange 3");
	 JButton c4 = new JButton("Challange 4");
	 User_interface(){
	  
	 // myButton.setBounds(100,160,200,40);

	  c1.setFocusable(false);
	  c1.addActionListener(this);
	  
	
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(600,600);
	  frame.setLayout(new BorderLayout(1,1));
	
	  frame.setVisible(true);
	    JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		
		panel1.setBackground(new Color(0x29434e));
		panel2.setBackground(new Color(0x546e7a));
	
		
		
				
		panel1.setPreferredSize(new Dimension(100,50));
		panel2.setPreferredSize(new Dimension(150,100));
		
		//------------- sub panels --------------------
		
		
		c2.setFocusable(false);
		c3.setFocusable(false);
		c2.setPreferredSize(new Dimension(200,50));
		c3.setPreferredSize(new Dimension(200,50));
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		 c4.setFocusable(false);
		 c4.addActionListener(this);
		 c4.setPreferredSize(new Dimension(200,50));
		 c4.addActionListener(this);

		
		  panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
          panel2.setLayout(new GridBagLayout());

          GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          gbc.anchor = GridBagConstraints.NORTH;

          panel2.add(new JLabel("<html><h1><strong><i>Dots Game</i></strong></h1><hr></html>"), gbc);

          gbc.anchor = GridBagConstraints.CENTER;
          //gbc.fill = GridBagConstraints.VERTICAL;
          

          JPanel buttons = new JPanel(new GridBagLayout());
          c1.setPreferredSize(new Dimension(200,50));
          c1.setBackground(new Color(0x819ca9));
          c2.setBackground(new Color(0x819ca9));
          c3.setBackground(new Color(0x819ca9));
          c4.setBackground(new Color(0x819ca9));
          buttons.add(c1, gbc);
          buttons.add(c2, gbc);
          buttons.add(c3, gbc);
          buttons.add(c4, gbc);

          gbc.weighty = 1;
          panel2.add(buttons, gbc);
		//panel2.add(box);

	
		//------------- sub panels --------------------
	
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		

	  
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==c1)
		 { frame.dispose();
		        Challange1 myWindow = new Challange1();}
		 
		 if(e.getSource()==c2)
		 { frame.dispose();
		       Challange2 myWindow = new Challange2();}

	
	
	if(e.getSource()==c3)
	 { frame.dispose();
	       Challange3 myWindow = new Challange3();}


	
	if(e.getSource()==c4)
	 { frame.dispose();
	        new Challange4();}

}


	
}
	

