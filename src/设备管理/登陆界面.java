package �豸����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
public class ��½����  extends JFrame{
	JTextField text1;
	JPasswordField text2;
	JButton button1,button2;
	char a[];
	String s;
	int i=0;
	public ��½����() {
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init(){
		this.setBounds(500,200,400,280);
		this.setResizable(false);
		Font font = new Font("����",Font.BOLD,19);
		Font font1 = new Font("����",Font.BOLD,26);
		setLayout(new FlowLayout());
		JLabel b=new JLabel("             ʵ�������豸����ϵͳ            ");
	    b.setForeground(Color.RED);
		b.setFont(font1);
		this.add(b);
		JLabel b7=new JLabel("                                ");
		b7.setFont(font);
		this.add(b7);
		JLabel b1=new JLabel("�û���:");
		b1.setFont(font);
		this.add(b1);
		text1=new JTextField(26);
		text1.setFont(font);
		this.add(text1);
		JLabel b6=new JLabel("                                ");
		b6.setFont(font);
		this.add(b6);
		JLabel b2=new JLabel("��  ��:");
		b2.setFont(font);
		this.add(b2);
		text2=new JPasswordField(26);
		text2.setFont(font);
		add(text2);
		JLabel b5=new JLabel("                                ");
		b5.setFont(font);
		this.add(b5);
		button1=new JButton("  �� ½  ");
		button1.setFont(font);
		//button1.setIcon(new ImageIcon(""));
		add(button1);
		button2=new JButton("  �� ��   ");
		button2.setFont(font);
		add(button2);
		text2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				button1.doClick();
				
			}
			
		});
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Connection con;
				  Statement aql;
				  ResultSet rs;
				  try{
					  con=DriverManager.getConnection("jdbc:sqlserver://172.19.158.47:1433;databaseName=�豸����ϵͳ;"
					  		+ "user=Lily;password=000000");
					  aql=con.createStatement();
					  PreparedStatement pstmt = con.prepareStatement("select * from lode where �û���=?;");
					  pstmt.setString(1, text1.getText());
					  rs=pstmt.executeQuery();
                      if((!rs.next())||rs.getString(2)==null){
                    	  JOptionPane.showMessageDialog(text1, "���û������ڣ�����������!","��ʾ",JOptionPane.WARNING_MESSAGE);
                      }
                      else{
                    	  if(!rs.getString(2).equals(String.valueOf(text2.getPassword()))){
                    		  
                    		  JOptionPane.showMessageDialog(text1, "�û�����������������������!","��ʾ",JOptionPane.WARNING_MESSAGE);
                    	  }
                    	  else{
                    		  dispose();
                    		  new ������();
                    	  }
                      }
					  con.close();
				  }catch(SQLException e1){
					  System.out.println(e1);
				  }
				
			}
			
		});
	}

}
