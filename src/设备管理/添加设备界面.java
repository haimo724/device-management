package 设备管理;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.*;

public class 添加设备界面 extends JFrame {
    Connection con;
	Statement aql;
	ResultSet rs;
	JComboBox<String>comBox,comBox1;
	Box basebox,box1,box2;
	JLabel label1=new JLabel("设备编号：");
	JLabel label2=new JLabel("设备名称：");
	JLabel label3=new JLabel("设备类型：");
	JLabel label4=new JLabel("是否报损：");
	JLabel label5=new JLabel("    单价：");
	JLabel label6=new JLabel("生产产家：");
	JLabel label7=new JLabel("购买日期：");
	JLabel label8=new JLabel("  购买人：");
	JTextField text1=new JTextField(13);
	JTextField text2=new JTextField(10);
	JTextField text3=new JTextField(10);
	JTextField text4=new JTextField(10);
	JTextField text5=new JTextField(10);
	JTextField text6=new JTextField(10);
	JTextField text7=new JTextField(10);
	JTextField text8=new JTextField(10);
    JButton button=new JButton("提交设备");
    Font f=new Font("微软雅黑", Font.PLAIN, 19);
    Font f1=new Font("微软雅黑", Font.PLAIN, 16);
    Font f2=new Font("微软雅黑", Font.PLAIN, 16);
    JPanel jp=new JPanel();
  public 添加设备界面( Connection con) throws SQLException{
	  this.con=con;
	  init();
	  setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
  }
  public void init() throws SQLException{
	  this.setTitle("添加设备");
	  this.setLayout(new java.awt.FlowLayout());
  	  this.setBounds(500, 215, 360, 415);
  	  label1.setFont(f);
  	  label2.setFont(f);
  	  label3.setFont(f);
  	  label4.setFont(f);
  	  label5.setFont(f);
  	  label6.setFont(f);
  	  label7.setFont(f);
  	  label8.setFont(f);
  	  text1.setFont(f1);
  	 text2.setFont(f1);
  	 text3.setFont(f1);
  	 text4.setFont(f1);
  	 text5.setFont(f1);
  	 text6.setFont(f1);
  	 text7.setFont(f1);
  	 text8.setFont(f1);
  	 button.setFont(f2);
  	
  	 comBox=new JComboBox<String>();
	 comBox.setEditable(true);
	 comBox.getEditor().getItem();
	 comBox.setFont(f1);
	 aql=con.createStatement();
		rs=aql.executeQuery("select 设备类型  from  设备类型表");
		while(rs.next()){
			comBox.addItem(rs.getString(1));
	  }
  	  box1=Box.createVerticalBox();
	  box1.add(label1);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label2);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label3);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label4);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label5);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label6);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label7);
	  box1.add(Box.createVerticalStrut(10));
	  box1.add(label8);

	  box2=Box.createVerticalBox();
	  box2.add(text1);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text2);
	  box2.add(Box.createVerticalStrut(10));
	 // box2.add(text3);
	  box2.add(comBox);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text4);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text5);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text6);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text7);
	  box2.add(Box.createVerticalStrut(10));
	  box2.add(text8);

	  basebox=Box.createHorizontalBox();
  	  basebox.add(box1);
  	  basebox.add(Box.createHorizontalStrut(10));
  	  basebox.add(box2);
  	  jp.add(basebox);
  	  this.setLayout(new BorderLayout(10,10));
  	  JPanel jp1=new JPanel();
  	 JPanel jp2=new JPanel();
  	 JLabel lp=new JLabel("        ");
  	 jp2.add(button);
  	  jp1.setLayout(new GridLayout(2,1));
  	  jp1.add(jp2);
  	  jp1.add(lp);
  	  this.add(jp,BorderLayout.CENTER);
  	this.add(jp1,BorderLayout.SOUTH);
  	 this.setVisible(true);
  	 this.setResizable(false);
  	 text1.setText("");
  	 text7.setText("");
  	 text4.setText("否");
  	 text4.setEnabled(false);
	 button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(text1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(text1, "输入不能为空，请重新输入!","提示",JOptionPane.WARNING_MESSAGE);
			}
			else{
			  try {
				aql=con.createStatement();
				PreparedStatement pst = con.prepareStatement("insert into 设备台账表   values(?,?,?,?,?,?,?,?)");
				pst.setString(1, text1.getText());
				pst.setString(2,text2.getText());
				pst.setString(3,comBox.getSelectedItem().toString());
				pst.setString(4, "否");
				pst.setFloat(5, Float.parseFloat(text5.getText()));
				pst.setString(6, text6.getText());
				if(text7.getText().equals("")){
					pst.setDate(7, null);
				}
				else{
				   pst.setDate(7,java.sql.Date.valueOf(text7.getText()));
				}
				pst.setString(8, text8.getText());
				rs=pst.executeQuery();
				//con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				
			}
			 dispose();
			}
			
		}
		 
	 }); 
	  
  	  
  }
}
