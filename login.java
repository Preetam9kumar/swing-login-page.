import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
	
	public JFrame jFrame;
		public Login(){
		jFrame = new JFrame("________________________Login Page______");
		
		JButton jButton=new JButton("Detail!");
		jButton.setBounds(10, 280, 80, 30);
		
		JButton jButton2=new JButton("Yes");
		jButton2.setBounds(140, 280, 80, 30);
		
		JButton jButton3=new JButton("No");
		jButton3.setBounds(270, 280, 80, 30);
		
		JLabel jLabel=new JLabel("Are You Sure!");
		jLabel.setBounds(140, 230, 200, 30);
		
		JLabel jLabel2=new JLabel("MOST WELCOME!");
		jLabel2.setBounds(120, 40, 100, 30);
		
		JLabel jLabel3=new JLabel("LOGIN...");
		jLabel3.setBounds(145, 90, 100, 30);
		
		JTextField jTextField=new JTextField("Please enter your Password.");
		jTextField.setBounds(80, 180, 200, 30);
		
		JTextField jTextField2=new JTextField("Please enter Username.");
		jTextField2.setBounds(80, 140, 200, 30);
		
		jFrame.add(jTextField);
		jFrame.add(jTextField2);
		jFrame.add(jLabel);
		jFrame.add(jButton);
		jFrame.add(jLabel2);
		jFrame.add(jButton2);
		jFrame.add(jLabel3);   
		jFrame.add(jButton3);
		jButton.addActionListener(this);
		
		jFrame.setLayout(null);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]) {
		Login me=new Login();

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	}

