package 设备管理;

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
public class 登陆界面  extends JFrame{
	JTextField text1;
	JPasswordField text2;
	JButton button1,button2;
	char a[];
	String s;
	int i=0;
	public 登陆界面() {
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init(){
		this.setBounds(500,200,400,280);
		this.setResizable(false);
		Font font = new Font("宋体",Font.BOLD,19);
		Font font1 = new Font("楷体",Font.BOLD,26);
		setLayout(new FlowLayout());
		JLabel b=new JLabel("             实验中心设备管理系统            ");
	    b.setForeground(Color.RED);
		b.setFont(font1);
		this.add(b);
		JLabel b7=new JLabel("                                ");
		b7.setFont(font);
		this.add(b7);
		JLabel b1=new JLabel("用户名:");
		b1.setFont(font);
		this.add(b1);
		text1=new JTextField(26);
		text1.setFont(font);
		this.add(text1);
		JLabel b6=new JLabel("                                ");
		b6.setFont(font);
		this.add(b6);
		JLabel b2=new JLabel("密  码:");
		b2.setFont(font);
		this.add(b2);
		text2=new JPasswordField(26);
		text2.setFont(font);
		add(text2);
		JLabel b5=new JLabel("                                ");
		b5.setFont(font);
		this.add(b5);
		button1=new JButton("  登 陆  ");
		button1.setFont(font);
		//button1.setIcon(new ImageIcon(""));
		add(button1);
		button2=new JButton("  退 出   ");
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
					  con=DriverManager.getConnection("jdbc:sqlserver://172.19.158.47:1433;databaseName=设备管理系统;"
					  		+ "user=Lily;password=000000");
					  aql=con.createStatement();
					  PreparedStatement pstmt = con.prepareStatement("select * from lode where 用户名=?;");
					  pstmt.setString(1, text1.getText());
					  rs=pstmt.executeQuery();
                      if((!rs.next())||rs.getString(2)==null){
                    	  JOptionPane.showMessageDialog(text1, "该用户不存在，请重新输入!","提示",JOptionPane.WARNING_MESSAGE);
                      }
                      else{
                    	  if(!rs.getString(2).equals(String.valueOf(text2.getPassword()))){
                    		  
                    		  JOptionPane.showMessageDialog(text1, "用户名或密码有误，请重新输入!","提示",JOptionPane.WARNING_MESSAGE);
                    	  }
                    	  else{
                    		  dispose();
                    		  new 主界面();
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
