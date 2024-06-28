import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class OTPsubmit {

	String otp;
	static int invalidCount;
    
    public OTPsubmit(){
        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setTitle("OTP SETUP");
        frame.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //// Container creation
		Container p1 = new Container();
		p1 = frame.getContentPane();
		p1.setLayout(null);

		
		// Create TextField		
		JTextField tf = new JTextField();
        tf.setBounds(370, 310, 245, 40);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tf.setForeground(Color.BLACK);
		tf.setOpaque(false);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		new TextPrompt("ex-(****)", tf);
		p1.add(tf);


        // Create Button 	
		JButton b1= new JButton("Submit");
		b1.setBounds(430,355,150,30);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b1.setForeground(Color.RED);
		b1.setFocusPainted(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);


        ImageIcon Newpass_Background = new ImageIcon("Images\\OTP 3.jpg");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        p1.add(bg_label);




				
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


			//Submit Button Action Listener
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent u){
				
/////////////////////////////////
				String otp_provided=tf.getText();
				
				
				try{
					File otp_File = new File("TXT FILES\\OTP.txt");		
					Scanner scanFile = new Scanner(otp_File); //Scan File
						
					while(scanFile.hasNext()){
						otp = scanFile.next();
						break;
					}
					scanFile.close();
						
				}catch(Exception f){
					System.out.println("OTP File has problem in OTP Panel");
				}
				
				if(otp_provided.equals(otp))
				{
					
					frame.setVisible(false);
					new changePassword();
				}
				else{
					invalidCount++;
					
					if(invalidCount>5){
						JOptionPane.showMessageDialog(null,"Wrong attempt !! You Have Entered wrong OTP more than 5 times.","WARNING",JOptionPane.WARNING_MESSAGE);
						System.exit(0);
					}
					else{
						JOptionPane.showMessageDialog(null,"Enter a valid OTP","Invalid OTP",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		

		
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b1.setBackground(Color.LIGHT_GRAY);
				b1.setForeground(Color.WHITE);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				b1.setBackground(Color.CYAN);
				b1.setForeground(Color.BLACK);
			}
		});

		frame.setVisible(true);
        frame.setResizable(false);
    }
}
