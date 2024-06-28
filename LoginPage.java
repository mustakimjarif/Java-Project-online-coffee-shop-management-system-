import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class LoginPage {

	String user_username, user_password;
	static int invalidCount = 0,position = 100; 
	int fileNo, fileIs;

    public LoginPage(){

        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("LOGIN PAGE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container creation
		Container p1 = new Container();
		p1 = frame.getContentPane();
		p1.setLayout(null);

		// TextField Creation
		JTextField tf = new JTextField();
		new TextPrompt("Username", tf);
        tf.setBounds(155, 282, 215, 30);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		tf.setBackground(Color.YELLOW);
		tf.setForeground(Color.BLACK);
		tf.setOpaque(false);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		p1.add(tf);
		
		JPasswordField pf = new JPasswordField();
		new TextPrompt("Password", pf);
        pf.setBounds(155, 353, 180, 28);
        pf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		pf.setBackground(Color.YELLOW);
		pf.setOpaque(false);
		pf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		p1.add(pf);

        // Button Creation
        JButton b2= new JButton("Forgot Password?");
		b2.setBounds(280,380,135,18);;
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		b2.setForeground(Color.RED);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p1.add(b2);

		JButton b3 = new JButton("Sign in");
        b3.setBounds(200, 410, 100, 25);
        b3.setFont(new Font("Bell MT", Font.BOLD, 15));
		b3.setBackground(new Color(216,154,93));
		b3.setForeground(Color.BLACK);
		b3.setFocusPainted(false);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b3);
		
		JButton b5 = new JButton();
        b5.setBounds(50, 480, 90, 30);
        b5.setFont(new Font("Bell MT", Font.BOLD, 20));
		b5.setBackground(Color.CYAN);
		b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
        p1.add(b5);

		JButton b4 = new JButton("Sign Up");
        b4.setBounds(720, 0, 350, 30);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
        b4.setFont(new Font("Bell MT", Font.BOLD, 20));
		b4.setForeground(new Color(142,58,22));
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b4);

		// Hide Button 
		JButton hide = new JButton(new ImageIcon("Images\\hide.png"));
		hide.setBounds(350,357,30,20);
		hide.setVisible(true);
		hide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		hide.setContentAreaFilled(false);
		hide.setFocusPainted(false);
		hide.setBorderPainted(false);
		p1.add(hide);
	
		//Unhide Icon 
		JButton unhide = new JButton(new ImageIcon("Images\\Unhide.png"));
		unhide.setBounds(350,357,30,20);
		unhide.setVisible(false);
		unhide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		unhide.setContentAreaFilled(false);
		unhide.setFocusPainted(false);
		unhide.setBorderPainted(false);
		p1.add(unhide);
	
		hide.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent a){
			pf.setEchoChar((char) 0);
			hide.setVisible(false);
			unhide.setVisible(true);
			pf.requestFocusInWindow();			
		  } 
		});
	
	
		unhide.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent a){
			pf.setEchoChar('*');  //display password
			unhide.setVisible(false);
			hide.setVisible(true);
			pf.requestFocusInWindow();
		  } 
		});


		
		//Set Background Image		
        ImageIcon Newpass_Background = new ImageIcon("Images\\loginPage.png");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        p1.add(bg_label);
		


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

		//ActionListener for Forgot Password Button
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				frame.setVisible(false);
				try{
				new OTP();
				}catch(Exception fd)
				{
					System.out.println("Login Panel user gui call problem");
				}
			} 
		});
		


		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new OTP();
        }});
		
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b2.setBackground(Color.LIGHT_GRAY);
				b2.setForeground(Color.CYAN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				b2.setBackground(Color.CYAN);
				b2.setForeground(Color.RED);
			}
		});
	
	

		b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new AccountCreate();
        }});

		b4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b4.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				b4.setForeground(new Color(142,58,22));
			}
		});
		
	 	b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new LoginPage();
			System.exit(0);
        }});

		b5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				b5.setForeground(Color.BLACK);
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				b5.setForeground(Color.CYAN);
			}
		}); 
		
		
	//ActionListener for Login Button

	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
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
				fileNo=fileNo-1;
							
			}catch(Exception f)		{System.out.println("User file no reading problem in login panel");}


			String user=tf.getText();
			String pass=new String(pf.getPassword());
			boolean user_access=false;




			//Get User Information
				
			for(int i=1; i<=fileNo; i++)
			{
				String User_Information_File_Path="TXT FILES\\User Information\\User--"+i+".txt";
					
				try{
					File user_file = new File(User_Information_File_Path);		
					Scanner scanFile = new Scanner(user_file);//Scan File
					
					while(scanFile.hasNext()){
						user_username=scanFile.next();
						user_password=scanFile.next();
						break;
					}
					scanFile.close();
						
						
					if((user.equals(user_username)) && (pass.equals(user_password)))
					{
						fileIs=i;
						break;
					}
				}catch(Exception f)		{System.out.println("User File Problem in Login Panel");}
			}
				
			if((user.equals(user_username)) && (pass.equals(user_password)))
			{
				user_access=true;
			}
			else{
				user_access=false;
			}



//Get login in account
			if(user_access){
					
				//Writting the user file no to running user file
				try{
					Formatter formatter=new Formatter("TXT FILES\\Running_User_File_NO.txt");
					
					formatter.format("%s", ""+fileIs);
					formatter.close();	
					
				}catch(Exception f)		{System.out.println("writting running user file no problem");}
				
				//writting done
				frame.setVisible(false);
				new WelcomePage();
			}
			else{
				invalidCount++;
				
				if(invalidCount>5){
					JOptionPane.showMessageDialog(null,"Wrong attempt !! You Have Entered wrong Information more than 5 times.","WARNING",JOptionPane.WARNING_MESSAGE);
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "Enter Valid Username or Password","Login Confirmation",JOptionPane.WARNING_MESSAGE);
			}
	}});

	


	//ActionListener for Login Button
	b3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
                  
        //////////////////////////////////////////////////////////////Reading User File NO/////////////////////////////////////////////////////
      String ffilenumber="";
      try{
        File otp_File = new File("TXT FILES\\User_File_No.txt");    
        Scanner scanFile = new Scanner(otp_File);//Scan File
              
        while(scanFile.hasNext()){
          ffilenumber=scanFile.next();
          break;
        }
        scanFile.close();
            
        fileNo= Integer.parseInt(ffilenumber);
        fileNo=fileNo-1;
              
      }catch(Exception f)    {System.out.println("User file no reading problem in login panel");}


      String user = tf.getText();
      String pass=new String(pf.getPassword());
      boolean user_access=false;




      //Get User Information
        
      for(int i=1; i<=fileNo; i++)
      {
          
        try{
          File user_file = new File("TXT FILES\\User Information\\User--"+i+".txt");    
          Scanner scanFile = new Scanner(user_file);//Scan File
          
          while(scanFile.hasNext()){
            user_username=scanFile.next();
            user_password=scanFile.next();
            break;
          }
          scanFile.close();
            
            
          if((user.equals(user_username)) && (pass.equals(user_password)))
          {
            
            break;
          }
        }catch(Exception f)    {System.out.println("User File Problem in Login Panel");}
      }
        
      if((user.equals(user_username)) && (pass.equals(user_password)))
      {
        user_access=true;
      }
      else{
        user_access=false;
      }



        if(user_access==false){
          //position=100; //200 perfect position  
          b3.setBounds(position,410, 100, 25);
          if(position == 100){position=300;}
          else if(position==300){position=100;}

        }else{

          b3.setBounds(200, 410, 100, 25);
          
          b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
              b3.setBackground(Color.LIGHT_GRAY);
              b3.setForeground(Color.CYAN);
            }
      
            public void mouseExited(java.awt.event.MouseEvent evt) {
              b3.setBackground(new Color(216,154,93));
              b3.setForeground(Color.BLACK);
            }
          });
      
        }


        
    }});

//Set Frame as Visible
frame.setVisible(true);
frame.setResizable(false);
EventQueue.invokeLater( () -> tf.requestFocusInWindow() );

    }
}