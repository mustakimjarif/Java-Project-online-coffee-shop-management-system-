import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class WelcomePage {
  

    public WelcomePage(){
		
        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setTitle("WElCOME PAGE");
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Container creation
		Container panel = new Container();
		panel=frame.getContentPane();
		panel.setLayout(null);


		JButton coffee_item = new JButton();
        coffee_item.setBounds(255, 390, 110, 170);
		coffee_item.setForeground(Color.BLACK);
        coffee_item.setFont(new Font("Bell MT", Font.BOLD, 20));
        coffee_item.setContentAreaFilled(false);
		coffee_item.setBorderPainted(false);
        coffee_item.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(coffee_item);


		JButton chocolate_item = new JButton();
        chocolate_item.setBounds(440, 390, 110, 170);
		chocolate_item.setForeground(Color.BLACK);
        chocolate_item.setFont(new Font("Bell MT", Font.BOLD, 20));
        chocolate_item.setContentAreaFilled(false);
		chocolate_item.setBorderPainted(false);
        chocolate_item.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(chocolate_item);


		JButton drinks_item = new JButton();
        drinks_item.setBounds(622, 390, 110, 170);
		drinks_item.setForeground(Color.BLACK);
        drinks_item.setFont(new Font("Bell MT", Font.BOLD, 20));
        drinks_item.setContentAreaFilled(false);
		drinks_item.setBorderPainted(false);
        drinks_item.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(drinks_item);
		
		JButton about_us = new JButton("About Us");
		about_us.setContentAreaFilled(false);
		about_us.setBorderPainted(false);
		about_us.setFont(new Font("Times New Roman", Font.BOLD, 15));
		about_us.setBounds(730, 0, 100, 25);
		about_us.setForeground(new Color(142,58,22));
		about_us.setFocusPainted(false);
		about_us.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(about_us);

		JButton logout = new JButton("Logout");
		logout.setContentAreaFilled(false);
		logout.setBorderPainted(false);
		logout.setFont(new Font("Times New Roman", Font.BOLD, 15));
		logout.setBounds(870, 0, 100, 25);
		logout.setForeground(new Color(142,58,22));
		logout.setFocusPainted(false);
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(logout);
	
		//Set Background Image
		
        ImageIcon Newpass_Background = new ImageIcon("Images\\WelcomePage.png");
    
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


		
		  coffee_item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new HomePage();
        }});


		drinks_item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new drinksItem();
        }});



		chocolate_item.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new ChocolateItem();
        }});

		about_us.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new about_us();
        }});

		logout.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new LoginPage();
        }});



		about_us.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				about_us.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				about_us.setForeground(new Color(142,58,22));
			}
		});


		
		
		

		
		logout.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				logout.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				logout.setForeground(new Color(142,58,22));
			}
		}); 
		

		frame.setVisible(true);
        frame.setResizable(false);
		
		
		
    }
    
}