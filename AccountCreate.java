import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class AccountCreate {

	int fileNo=1;

    public AccountCreate(){

        JFrame f1 = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        f1.setIconImage(img.getImage());
        f1.setBounds(250, 110, 1000, 600);
		f1.setLocationRelativeTo(null);
		f1.setTitle("ACCOUNT CREATE");
        f1.setFont(new Font("Times New Roman", Font.BOLD, 15));

		// Delete Dot Class File 

        f1.addWindowListener(new WindowAdapter(){
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
				
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  
			  }else{
				f1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			  }
			}
		  }
		);

        // Container creation

		Container p1 = new Container();
		p1=f1.getContentPane();
		p1.setLayout(null);

        // JTextField Create

        // First Name 

        JTextField tf = new JTextField();
        tf.setBounds(625, 78, 130, 30);
        tf.setBackground(Color.WHITE);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf.setForeground(Color.BLACK);
        tf.setOpaque(false);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt("First Name", tf);
        p1.add(tf); 

        // Last Name 

        JTextField tf1 = new JTextField();
        tf1.setBounds(825, 78, 130, 30);
        tf1.setBackground(Color.WHITE);
        tf1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf1.setForeground(Color.BLACK);
		tf1.setOpaque(false);
		tf1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt("Last Name", tf1);
        p1.add(tf1); 

       
       
        // For E-Mail Set 

        JTextField tf2 = new JTextField();
        tf2.setBounds(625, 165, 330, 30);
        tf2.setBackground(Color.WHITE);
        tf2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf2.setForeground(Color.BLACK);
		tf2.setOpaque(false);
		tf2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt("ex- (yourName@example.com)", tf2);
        p1.add(tf2);

        // For Mobile Number Set

        JTextField tf3 = new JTextField();
        tf3.setBounds(630, 240, 260, 30);
        tf3.setBackground(Color.WHITE);
        tf3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf3.setForeground(Color.BLACK);
		tf3.setOpaque(false);
		tf3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt(("ex-(018-********"), tf3);
        p1.add(tf3);
        

        // Radio-Button Set

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(650,312, 90, 30);
        r1.setForeground(Color.BLACK);
		r1.setSelected(true);
		r1.setFocusPainted(false);
        r1.setFont(new Font("Times New Roman",Font.BOLD,15));
		r1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        r1.setContentAreaFilled(false);
		r1.setBorderPainted(false);
        p1.add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(820, 316, 120, 20);
        r2.setForeground(Color.BLACK);
		r2.setFocusPainted(false);
        r2.setFont(new Font("Times New Roman",Font.BOLD,15));
		r2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        r2.setContentAreaFilled(false);
		r2.setBorderPainted(false);
        p1.add(r2);

		ButtonGroup gender_grp = new ButtonGroup();
		gender_grp.add(r1);
		gender_grp.add(r2);

        JTextField tf4 = new JTextField();
        tf4.setBounds(630, 375, 100, 30);
        tf4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf4.setForeground(Color.BLACK);
		tf4.setOpaque(false);
		tf4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt(("user(a-z)"), tf4);
        p1.add(tf4);

        JTextField tf5 = new JTextField();
        tf5.setBounds(820, 375, 100, 30);
        tf5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf5.setForeground(Color.BLACK);
		tf5.setOpaque(false);
		tf5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        new TextPrompt(("password"), tf5);
        p1.add(tf5);

        // Button Set

        JButton b1 = new JButton("Confirm");
        b1.setBounds(740, 420, 90, 25);
        b1.setFont(new Font("Bell MT", Font.BOLD, 15));
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.BLACK);
		b1.setFocusPainted(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b1);

		JButton b2 = new JButton("Log in");
        b2.setBounds(855, 448, 90, 25);
        b2.setFont(new Font("Bell MT", Font.BOLD, 13));
		b2.setForeground(Color.RED);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b2);


		// set gif

		ImageIcon Newpass_Background2 = new ImageIcon("Images\\cup.gif");
    	JLabel bg_label2 = new JLabel(Newpass_Background2);
        bg_label2.setBounds(0,170,420,320);
        p1.add(bg_label2);


        // Set BackGround
        ImageIcon Newpass_Background = new ImageIcon("Images\\AccountCreate (1).jpg");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        p1.add(bg_label);


        
    // Back to Login Button ActionListener 

	 b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			f1.setVisible(false);
			new LoginPage();
        }});
		
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
			//	b2.setBackground(Color.LIGHT_GRAY);
				b2.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
			//	b2.setBackground(Color.CYAN);
				b2.setForeground(Color.RED);
			}
		}); 



// Confirm Button ActionListener
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent u){
//////////////////////////////////////////////////////////////Reading User File NO/////////////////////////////////////////////////////
				String filenumber="";
				try{
					File otp_File = new File("TXT FILES\\User_File_No.txt");		
					Scanner scanFile = new Scanner(otp_File);//Scan File
						
					while(scanFile.hasNext()){
						filenumber=scanFile.next();
						break;
					}
					scanFile.close();
					
					fileNo= Integer.parseInt(filenumber);
						
				}catch(Exception f)		{System.out.println("User_File_No problem in account creation");}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				String username,password,email,phone,name,gender;
									
			//Getting User Information
				username = tf4.getText();
				password = tf5.getText();
				email = tf2.getText();
				phone = tf3.getText();
				name = tf.getText()+" "+tf1.getText();
				if(r1.isSelected()){gender="Male";}
				else{gender="Female";}
				
				int Username_Warning=5;
				int Username_Exist_Warning=5;
				int Phone_Warning=5;
				
				//Check Username ok or not
				for(int i=0; i<username.length(); i++)
				{
					if( (username.charAt(i)<97) || (username.charAt(i)>122) ){
						Username_Warning=1;
						break;
					}
				}
				
				//Check Phone Number ok or not
				for(int i=0; i<phone.length(); i++)
				{
					if( (phone.charAt(i)<48) || (phone.charAt(i)>57) ){
						Phone_Warning=1;
						break;
					}
				}


				//Check Username Exist or not			
				String username_exist="";
				for(int i=1; i<=(fileNo-1); i++)
				{
					String User_Information_File_Path="TXT FILES\\User Information\\User--"+i+".txt";
					
					try{
						File user_file = new File(User_Information_File_Path);		
						Scanner scanFile = new Scanner(user_file);//Scan File
						
						while(scanFile.hasNext()){
							username_exist=scanFile.next();
							break;
						}
						scanFile.close();
						
						
						if((username.equals(username_exist)))
						{
							Username_Exist_Warning+=1;
							break;
						}
					}catch(Exception f)		{System.out.println("User File Problem in Sigup Panel");}
				}









				if( (tf.getText().isEmpty()) || (username.isEmpty()) || (password.isEmpty()) || (email.isEmpty()) || (phone.isEmpty()) || (tf1.getText().isEmpty()) )
				{
					if( tf.getText().isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "First Name can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( tf1.getText().isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Last Name can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( email.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Email can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( phone.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Phone Number can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else if( username.isEmpty() )
					{
						JOptionPane.showMessageDialog(null, "Username can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Password can not be empty","Empty Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
				else if(Email_Decision(email))
				{
					JOptionPane.showMessageDialog(null, "Enter a valid Email Address","Email Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if( (phone.length()<11) || (phone.length()>11) || Phone_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid Phone Number","Phone Number Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(Username_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Username contains small Alphabets only","Username Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if(Username_Exist_Warning!=5)
				{
					JOptionPane.showMessageDialog(null, "Username already exist. Try different One","Username Warning",JOptionPane.WARNING_MESSAGE);
				}
				else if( (password.length()<6) || (password.length()>10) )
				{
					JOptionPane.showMessageDialog(null, "Password must be 6 to 10 character","Password Warning",JOptionPane.WARNING_MESSAGE);
				}
///////////////////////////////////////////////////////////User Information Written/////////////////////////////////////////////////////////////////////////////////////////
				else{
					try{
						String User_Information_File_Path="TXT FILES\\User Information\\User--"+fileNo+".txt";
						Formatter formatter=new Formatter(User_Information_File_Path);
						fileNo++;
						
						formatter.format("%s\r\n", username);
						formatter.format("%s\r\n", password);
						formatter.format("%s\r\n", email);
						formatter.format("%s\r\n", phone);
						formatter.format("%s\r\n", gender);
						formatter.format("%s\r\n", name);
						
						
						
						formatter.close();	
					}catch(Exception f)		{System.out.println("Writting user info problem in account creation");}
					
/////////////////////////////////////////////////////////////////////Writting Next User File Number////////////////////////////////////////////////////////////////////////
					try{
						Formatter formatter=new Formatter("TXT FILES\\User_File_No.txt");
							
							
						formatter.format("%s", ""+fileNo);
						formatter.close();	
							
					}catch(Exception f)		{System.out.println("User file no writting problem in accounnt creation");}
					
					JOptionPane.showMessageDialog(null, "Welcome to our Coffee Shop "+tf.getText(),"Successfully Account Created",-1,new ImageIcon("Images\\tick.png"));
					
					f1.setVisible(false);
					new LoginPage();
				}
		}});


                    
				
                    
		
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b1.setBackground(Color.LIGHT_GRAY);
				b1.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				b1.setBackground(Color.CYAN);
				b1.setForeground(Color.BLACK);
			}

            
		});

        // Frame Visibility 
        
        f1.setVisible(true);
        f1.setResizable(false);

    }

    private boolean Email_Decision(String email){
		
		String word=email;
		int countAt=0,countDot=0;
		
		
		
		for(int i=0; i<word.length();i++)
		{
			if(word.charAt(i)=='@')
			{
				countAt++;
			}if(countAt==1 && word.charAt(i)=='.')
			{
				countDot++;
			}
			
		}
		
		if(countAt==1 && countDot==1){
			return false;
		}
		else{
			return true;
		}
		
	}
}
