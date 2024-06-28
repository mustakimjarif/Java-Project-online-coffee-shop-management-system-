//Mail Classes
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class OTP {
	int fileNo, fileIs;
	String otp;

//User Info
	String user_username, user_password, user_email, user_phone, user_name, user_gender;
    
    public OTP(){

        JFrame f1 = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        f1.setIconImage(img.getImage());
        f1.setBounds(250, 110, 1000, 600);
		f1.setLocationRelativeTo(null);
		f1.setTitle("OTP SETUP");
        f1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //// Container creation
		Container p1 = new Container();
		p1=f1.getContentPane();
		p1.setLayout(null);

        // JTextField Creation         
        JTextField tf = new JTextField();
        tf.setBounds(700, 258, 200, 40);
        tf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tf.setBackground(null);
		tf.setForeground(Color.BLACK);
		tf.setOpaque(false);
		tf.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		new TextPrompt("username", tf);
		p1.add(tf);

        JButton b1 = new JButton("GET OTP");
        b1.setBounds(755, 315, 90, 25);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 10));
        b1.setForeground(Color.RED);
        b1.setBackground(Color.CYAN);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b1);

		JButton b2 = new JButton();
        b2.setBounds(15, 495, 50, 25);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setForeground(null);
        b2.setBackground(Color.CYAN);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p1.add(b2);


        ImageIcon Newpass_Background = new ImageIcon("Images\\otp.jpg");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        p1.add(bg_label);

		
        f1.addWindowListener(new WindowAdapter(){
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
			  
			  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  
			  }else{
			  f1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			  }
			}
		}
	); 

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
						
		}catch(Exception f)		{System.out.println(" user file No Reading Problem in otp Panel");}







		//back Button Listener
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				f1.setVisible(false);
				new LoginPage();
				
			}
		});

		//ActionListener for Get OTP Button
		 b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent w){

				//Get User Information
				
				String user=tf.getText();
				
				for(int i=1; i<=fileNo; i++)
				{
					String User_Information_File_Path="TXT FILES/User Information/User--"+i+".txt";
						
					try{
						File user_file = new File(User_Information_File_Path);		
						Scanner scanFile = new Scanner(user_file);//Scan File
						
						while(scanFile.hasNext()){
							user_username=scanFile.next();
							user_password=scanFile.next();
							user_email=scanFile.next();
							break;
						}
						scanFile.close();
							
							
						if(user.equals(user_username))
						{
							fileIs=i;
							break;
						}
					}catch(Exception f)		{System.out.println("User File Problem in Username Panel");}
				}

				if(user.equals(user_username))
				{
			//Writing OTP in File
					try{
						Formatter formatter=new Formatter("TXT FILES\\OTP.txt");
						
						otp = generateOtp(4); //Getting OTP
						
						formatter.format("%s\r\n", otp);
						formatter.format("%s\r\n", ""+fileIs);
						formatter.close();	
						
					}catch(Exception f)		{System.out.println(f);}
					
			//Sending email in user Account
					try{
						Mail mail = new Mail();
						mail.setupServerProperties();
						mail.draftEmail(user_email,"Coffee Shope OTP", "Your One Time Password is "+otp);
						mail.sendEmail();						
					}catch(Exception tata){
						System.out.println("mail send problem");
					}
			
			
			

					JOptionPane.showMessageDialog(null, "An OTP has been send to "+user_email," OTP send to email account",-1,new ImageIcon("Images\\Successful_Icon.png"));
					
					f1.setVisible(false);
					new OTPsubmit();
				 
					
				}
				else{
					JOptionPane.showMessageDialog(null,"Enter a valid Username","Username NOT Found",JOptionPane.WARNING_MESSAGE);
				}
			}
		});


    	/*  b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			f1.setVisible(false);
			new OTPsubmit();
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

		f1.setVisible(true);
        f1.setResizable(false);
    }

	private String generateOtp(int otpLength){
		SplittableRandom split = new SplittableRandom();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<otpLength; i++){
			sb.append(split.nextInt(0,10));
		}
		return sb.toString();
	}
}
