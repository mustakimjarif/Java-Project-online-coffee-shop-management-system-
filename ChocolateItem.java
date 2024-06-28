import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class ChocolateItem{
	
	public ChocolateItem(){
		
		JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setTitle("CHOCOLATE ITEM");
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/////////// Container creation /////////////

		Container panel = new Container();
		panel=frame.getContentPane();
		panel.setLayout(null); 
		
		JButton b1 = new JButton("View Details");
        b1.setBounds(360, 230, 100, 20);
        b1.setFont(new Font("Times New Roman",Font.BOLD,10));
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
        panel.add(b1);


		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			  try{
				Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
				
				
				formatter.format("%s", "5");
				formatter.close();  
				  
			  }catch(Exception f)    {System.out.println("Problem in runnung product of Mars Chocolate");}
			  
			  frame.setVisible(false);
			  new View_details();
			}
		  });

		JButton b2 = new JButton("View Details");
        b2.setBounds(580, 230, 100, 20);
        b2.setFont(new Font("Times New Roman",Font.BOLD,10));
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.RED);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
        panel.add(b2);

		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			  try{
				Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
				
				
				formatter.format("%s", "6");
				formatter.close();  
				  
			  }catch(Exception f)    {System.out.println("Problem in runnung product of Snickers Chocolate");}
			  
			  frame.setVisible(false);
			  new View_details();
			}
		  });
		

		JButton b3 = new JButton("View Details");
        b3.setBounds(820, 230, 100, 20);
        b3.setFont(new Font("Times New Roman",Font.BOLD,10));
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.RED);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.setFocusPainted(false);
        panel.add(b3);


		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			  try{
				Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
				
				
				formatter.format("%s", "7");
				formatter.close();  
				  
			  }catch(Exception f)    {System.out.println("Problem in runnung product of KitKat Chocolate");}
			  
			  frame.setVisible(false);
			  new View_details();
			}
		  });


		JButton b4 = new JButton("View Details");
        b4.setBounds(380, 405, 100, 20);
        b4.setFont(new Font("Times New Roman",Font.BOLD,10));
        b4.setBackground(Color.YELLOW);
        b4.setForeground(Color.RED);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		b4.setFocusPainted(false);
        panel.add(b4);


		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			  try{
				Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
				
				
				formatter.format("%s", "8");
				formatter.close();  
				  
			  }catch(Exception f)    {System.out.println("Problem in runnung product of Dairy_Milk Chocolate");}
			  
			  frame.setVisible(false);
			  new View_details();
			}
		  });

		JButton b5 = new JButton("View Details");
        b5.setBounds(715, 400, 100, 20);
        b5.setFont(new Font("Times New Roman",Font.BOLD,10));
        b5.setBackground(Color.YELLOW);
        b5.setForeground(Color.RED);
        b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		b5.setFocusPainted(false);
        panel.add(b5);


		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			  try{
				Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
				
				
				formatter.format("%s", "9");
				formatter.close();  
				  
			  }catch(Exception f)    {System.out.println("Problem in runnung product of KinderJoy Chocolate");}
			  
			  frame.setVisible(false);
			  new View_details();
			}
		  });
		
		JButton b6 = new JButton();
        b6.setBounds(867, 509, 40, 30);
        b6.setFont(new Font("Times New Roman",Font.BOLD,20));
        b6.setBackground(Color.YELLOW);
        b6.setForeground(Color.CYAN);
        b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		b6.setFocusPainted(false);
        panel.add(b6);
		
		
		
		ImageIcon Newpass_Background = new ImageIcon("Images\\chocolate.png");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        panel.add(bg_label);

      



		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
			  
			  int result = JOptionPane.showConfirmDialog (null,"Do you want to Exit?", "Exit Confirmation",JOptionPane.YES_NO_OPTION);
			  
			  if (result == JOptionPane.YES_OPTION){
				
				File folder = new File("E:\\3'rd SEMESTER\\FINAL - TERM\\JAVA\\MyProject");
				File fList[] = folder.listFiles();
	
				for (File f : fList) {
				  if (f.getName().endsWith(".class")) {
					f.delete(); 
				  }
				}
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  
			  }else{
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			  }
			}
		  }
		); 
		
		
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				// b1.setBackground(Vivid_Blue);
				b1.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				// b1.setBackground(Aqua);
				b1.setForeground(Color.RED);
			}
		});
		
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				// b2.setBackground(Vivid_Blue);
				b2.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				// b2.setBackground(Aqua);
				b2.setForeground(Color.RED);
			}
		});
		
		b3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				// b3.setBackground(Vivid_Blue);
				b3.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				// b3.setBackground(Aqua);
				b3.setForeground(Color.RED);
			}
		});
		
		b4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				// b4.setBackground(Vivid_Blue);
				b4.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				// b4.setBackground(Aqua);
				b4.setForeground(Color.RED);
			}
		});
		
		b5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b5.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				b5.setForeground(Color.RED);
			}
		});

		
		b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new WelcomePage();
        }});

		frame.setVisible(true);
        frame.setResizable(false);
    }
	
}