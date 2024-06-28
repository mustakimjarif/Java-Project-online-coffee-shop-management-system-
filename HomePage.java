import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class HomePage {
    
    public HomePage(){
        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		    frame.setLocationRelativeTo(null);
		    frame.setTitle("HOME PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container creation
		    Container panel = new Container();
		    panel=frame.getContentPane();
		    panel.setLayout(null);
		

        


        // Button setting

        JButton b1 = new JButton("View Details");
        b1.setBounds(135, 264, 150, 15);
        b1.setFont(new Font("Times New Roman",Font.BOLD,10));
        b1.setForeground(Color.BLACK);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    b1.setContentAreaFilled(false);
		    b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        panel.add(b1);

        JButton b2 = new JButton("View Details");
        b2.setBounds(359, 261, 150, 15);
        b2.setFont(new Font("Times New Roman",Font.BOLD,10));
        b2.setForeground(Color.BLACK);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    b2.setContentAreaFilled(false);
		    b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        panel.add(b2);

        JButton b3 = new JButton("View Details");
        b3.setBounds(158, 417, 150, 15);
        b3.setFont(new Font("Times New Roman",Font.BOLD,10));
        b3.setForeground(Color.BLACK);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        panel.add(b3);

        JButton b4 = new JButton("View Details");
        b4.setBounds(366, 417, 150, 15);
        b4.setFont(new Font("Times New Roman",Font.BOLD,10));
        b4.setForeground(Color.BLACK);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        panel.add(b4);

        
        JButton b6 = new JButton();
        b6.setBounds(858, 515, 50, 40);
        b6.setFont(new Font("Times New Roman",Font.BOLD,10));
        b6.setForeground(Color.BLACK);
        b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        panel.add(b6);


        ImageIcon Newpass_Background = new ImageIcon("Images\\Coffee Page.png");
    	  JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        panel.add(bg_label);

        
        frame.setResizable(false);

        frame.addWindowListener(new WindowAdapter(){
          public void windowClosing(WindowEvent we){
            
            int result = JOptionPane.showConfirmDialog (null,"Do you want to Exit?", "Exit Confirmation",JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION){
            
            File folder = new File("C:\\Users\\user\\Desktop\\MyProject");
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
              b1.setForeground(Color.CYAN);
            }
      
            public void mouseExited(java.awt.event.MouseEvent evt) {
              b1.setForeground(Color.BLACK);
            }
          });
		  
		   b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
              b2.setForeground(Color.CYAN);
            }
      
            public void mouseExited(java.awt.event.MouseEvent evt) {
              b2.setForeground(Color.BLACK);
            }
          });
		  
		   b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
              b3.setForeground(Color.CYAN);
            }
      
            public void mouseExited(java.awt.event.MouseEvent evt) {
              b3.setForeground(Color.BLACK);
            }
          });
		  
		   b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
              b4.setForeground(Color.CYAN);
            }
      
            public void mouseExited(java.awt.event.MouseEvent evt) {
              b4.setForeground(Color.BLACK);
            }
          });

        b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			    frame.setVisible(false);
			    new WelcomePage();
          }});

        


//Action Listeners
      b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          try{
            Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
            
            
            formatter.format("%s", "1");
            formatter.close();  
              
          }catch(Exception f)    {System.out.println("Problem in runnung product of nestle coffee");}
          
          frame.setVisible(false);
          new View_details();
        }
      });



      b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          try{
            Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
            
            
            formatter.format("%s", "2");
            formatter.close();  
              
          }catch(Exception f)    {System.out.println("Problem in runnung product of Black coffee");}
          
          frame.setVisible(false);
          new View_details();
        }
      });




      b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          try{
            Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
            
            
            formatter.format("%s", "3");
            formatter.close();  
              
          }catch(Exception f)    {System.out.println("Problem in runnung product of Espresso coffee");}
          
          frame.setVisible(false);
          new View_details();
        }
      });




      b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
          try{
            Formatter formatter=new Formatter("TXT FILES\\Running_Product.txt");
            
            
            formatter.format("%s", "4");
            formatter.close();  
              
          }catch(Exception f)    {System.out.println("Problem in runnung product of Cappuccino cofee");}
          
          frame.setVisible(false);
          new View_details();
        }
      });

      frame.setVisible(true);
          
    }
}
