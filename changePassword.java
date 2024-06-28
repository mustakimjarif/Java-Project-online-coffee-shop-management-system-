import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class changePassword {

	String fileIs, otp;
    
	String user_username, user_password, user_email, user_phone, user_gender, user_name;
    public changePassword(){
        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setTitle("CHANGE PASSWORD");
        frame.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //// Container creation
		Container p1 = new Container();
		p1 = frame.getContentPane();
		p1.setLayout(null);

        // Create TextField		
		JTextField tf = new JTextField();
        tf.setBounds(700, 260, 245, 40);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tf.setForeground(Color.BLACK);
		tf.setOpaque(false);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		new TextPrompt("new password", tf);
		p1.add(tf);


        // Create Button 		
		JButton b1 = new JButton("Change Password");
		b1.setBounds(737,310,200,30);;
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		b1.setForeground(Color.WHITE);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b1);


        ImageIcon Newpass_Background = new ImageIcon("Images\\OTP 2.jpg");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        p1.add(bg_label);


		// Delete .clss file 
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
		

		//ActionListener for Change Password button
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				String password = tf.getText();
				if( (password.length()<6) || (password.length()>10) )
				{
					JOptionPane.showMessageDialog(null, "Password must be 6 to 10 character","Password Warning",JOptionPane.WARNING_MESSAGE);
				}
				else{
					
			//Getting username from file, whice password will be change
					try{
						File admin_file = new File("TXT FILES\\OTP.txt");		
						Scanner scanFile = new Scanner(admin_file); //Scan File
							
						while(scanFile.hasNext()){
							otp=scanFile.next();
							fileIs=scanFile.next();
							break;
						}
						scanFile.close();
							
					}catch(Exception f){
						System.out.println("OTP File has problem in OTP Panel");
					}
						
			//Getting the usernames file
						String User_Information_File_Path="TXT FILES/User Information/User--"+fileIs+".txt";
							
						try{
							File user_file = new File(User_Information_File_Path);		
							Scanner scanFile = new Scanner(user_file);//Scan File
							
							while(scanFile.hasNext()){
								user_username=scanFile.next();
								user_password=scanFile.next();
								user_email=scanFile.next();
								user_phone=scanFile.next();
								user_gender=scanFile.next();
								user_name=scanFile.next()+" "+scanFile.next();
								break;
							}
							scanFile.close();
						}catch(Exception f)		{System.out.println("User File Problem in Username Panel");}
					
			//Got the File
			//Re-Write the file with new password
					
					try{
							String userfile="TXT FILES/User Information/User--"+fileIs+".txt";
							Formatter formatter=new Formatter(userfile);
							
							formatter.format("%s\r\n", user_username);
							formatter.format("%s\r\n", password);
							formatter.format("%s\r\n", user_email);
							formatter.format("%s\r\n", user_phone);
							formatter.format("%s\r\n", user_gender);
							formatter.format("%s\r\n", user_name);
							
							formatter.close();	
						}catch(Exception f)		{System.out.println(f);}


						
						frame.setVisible(false);
					new LoginPage();
				}
			} 
		});

		
		/* b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			f1.setVisible(false);
			new LoginPage();
			JOptionPane.showMessageDialog(null,"Your Password is Changed","Change Password", -1,new ImageIcon("E:\\3'rd SEMESTER\\FINAL - TERM\\JAVA\\MyProject\\Images\\tick.png"));
        }}); */
		
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
