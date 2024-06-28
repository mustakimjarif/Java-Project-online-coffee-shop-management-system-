import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class about_us {

    public about_us(){

        JFrame frame = new JFrame();
        ImageIcon img = new ImageIcon("Images\\brand.png");
        frame.setIconImage(img.getImage());
        frame.setBounds(250, 110, 1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("ABOUT US");
        frame.setFont(new Font("Times New Roman", Font.BOLD, 15));

        //// Container creation

		Container panel = new Container();
		panel=frame.getContentPane();
		panel.setLayout(null);

		// Delete Dot Class File 

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


        // button set

        JButton back_Button = new JButton();
        back_Button.setBounds(20, 25, 30, 25);
		back_Button.setContentAreaFilled(false);
		back_Button.setBorderPainted(false);
        back_Button.setFont(new Font("Bell MT", Font.BOLD, 20));
		back_Button.setForeground(new Color(142,58,22));
		back_Button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(back_Button);



        //Set Background Image
		
        ImageIcon Newpass_Background = new ImageIcon("Images\\Untitled-2.jpg");
    	JLabel bg_label = new JLabel(Newpass_Background);
        bg_label.setBounds(0,0,986,563);
        panel.add(bg_label);


        back_Button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new WelcomePage();
        }});


    frame.setVisible(true);
    frame.setResizable(false);

    }
    
}
