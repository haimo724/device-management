package �豸����;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.*;
public class ������  extends JFrame{
    Connection con;
 	Statement aql;
 	ResultSet rs;
 	String  s;
	Font f= new Font("����", Font.PLAIN, 24);
	Font f1= new Font("΢���ź�", Font.PLAIN, 13);
	Font f2= new Font("����", Font.PLAIN, 14);
	JButton button1=new JButton("�豸��ѯ");
	JButton button2=new JButton("���͹���");
	JButton button3=new JButton("�����¼");
	JButton button4=new JButton("ά�޼�¼");
	JButton button5=new JButton("���޲�ѯ");
	JLabel label=new JLabel("ʵ�������豸����ϵͳ");
	JPanel northPanel=new JPanel(); 
	JPanel northPanel2=new JPanel(); 
	JPanel northPanel1=new JPanel(); 
	JPanel  centerPanel=new JPanel();
	JPanel  lan1=new JPanel();
	JPanel lan2=new JPanel();
	JPanel lan3=new JPanel();
	JPanel lan4=new JPanel();
	JPanel lan5=new JPanel();
	JPanel la=new JPanel();
	JPanel la1=new JPanel();
	JPanel la2=new JPanel();
	JLabel label1=new JLabel("�豸��ţ�");
	JLabel label2=new JLabel("�豸���ƣ�");
	JLabel label3=new JLabel("�豸���ͣ�");
	JTextField text1=new JTextField(10);
	JTextField text2=new JTextField(10);
	JTextField text3=new JTextField(10);
	JTextArea area=new JTextArea(17,46);
	JScrollPane js=new JScrollPane(area);
	JButton  ��ѯ=new JButton("��ѯ�豸");
	JButton ���=new JButton("����豸");
	//JButton ɾ��=new JButton("ɾ���豸");
	JLabel label0=new JLabel("                  ");
    CardLayout card=new CardLayout();
    JLabel label4=new JLabel("�豸���ͣ�");
    JLabel label5=new JLabel("   �����ˣ�");
    JLabel labe1=new JLabel("�豸������");
    JLabel labe2=new JLabel("�豸�ܼۣ�");
    JLabel label6=new JLabel("����˵����");
    JTextField text4=new JTextField(23);
    JTextField text5=new JTextField(23);
    JTextField t1=new JTextField(23);
    JTextField t2=new JTextField(23);
    JTextArea area2=new JTextArea(5,23);
    JScrollPane js2=new JScrollPane(area2);
    JButton �������=new JButton("�������");
    JButton ���Ͳ�ѯ=new JButton("��ѯ����");
    JLabel label7=new JLabel("�豸��ţ�");
    JLabel label8=new JLabel("  �����ˣ�");
    JLabel label9=new JLabel("�������ڣ�");
    JTextField text7=new JTextField(23);
    JTextField text8=new JTextField(23);
    JTextField text9=new JTextField(23);
    JButton �����¼=new JButton("�ύ��¼");
    JLabel label10=new JLabel("�豸��ţ�");
    JLabel label11=new JLabel("  ά���ˣ�");
    JLabel label12=new JLabel("ά�����ڣ�");
    JTextField text10=new JTextField(23);
    JTextField text11=new JTextField(23);
    JTextField text12=new JTextField(23);
    JButton ά�޼�¼=new JButton("�ύ��¼");
    JButton ��ѯ����=new JButton("������ѯ");
    JButton ��ѯά��=new JButton("ά�ޱ��ѯ");
    JTextArea area3=new JTextArea(13,36);
    JScrollPane js3=new JScrollPane(area3);
    
    
    public ������() throws SQLException{
       init();	
	   con=DriverManager.getConnection("jdbc:sqlserver://172.19.158.47;databaseName=�豸����ϵͳ;"
	   		 + "user=Lily;password=000000");
	   aql=con.createStatement();
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void init(){
    	this.setTitle("ʵ�������豸����ϵͳ");
    	this.setBounds(410, 130, 600, 500);
    	this.setLayout(new BorderLayout(10,10));
    	text1.setText("");
    	text2.setText("");
    	text3.setText("");
    	area.setFont(new Font("΢���ź�", Font.PLAIN, 13));
    	label.setFont(f);
    	label.setForeground(Color.RED);
    	button1.setFont(f1);
    	button2.setFont(f1);
    	button3.setFont(f1);
    	button4.setFont(f1);
    	button5.setFont(f1);
    	northPanel.setLayout(new GridLayout(2,1));
    	northPanel1.setLayout(new GridLayout(1,5));
    	northPanel1.add(button1);
    	northPanel1.add(button2);
    	northPanel1.add(button3);
    	northPanel1.add(button4);
    	northPanel1.add(button5);
    	northPanel2.add(label);
    	northPanel.add(northPanel2);
    	northPanel.add(northPanel1);
    	this.add(northPanel,BorderLayout.NORTH);
    	label1.setFont(f2);
    	label2.setFont(f2);
    	label3.setFont(f2);
    	area.setEditable(false);
    	���.setFont(new Font("����", Font.PLAIN, 15));
    	��ѯ.setFont(new Font("����", Font.PLAIN, 15));
    	lan1.add(label1);
    	lan1.add(text1);
    	lan1.add(label2);
    	lan1.add(text2);
    	lan1.add(label3);
    	lan1.add(text3);
    	lan1.add(js);
    	lan1.add(��ѯ);
    	lan1.add(label0);
    	lan1.add(���);
    	
    	label4.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label5.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	labe1.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	labe2.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label6.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	text4.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	text5.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	t1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	t2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	area2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	t1.setEditable(false);
    	t2.setEditable(false);
    	//t2.setEnabled(false);
    	la.add(label4);
    	la.add(text4);
    	la.add(label5);
    	la.add(text5);
    	la.add(labe1);
    	la.add(t1);
    	la.add(labe2);
    	la.add(t2);
    	la.add(label6);
    	la.add(js2);
    	���Ͳ�ѯ.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	�������.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	JLabel li=new JLabel("                     ");
    	JLabel li2=new JLabel("                     ");
    	la.add(���Ͳ�ѯ);
    	la.add(li);
    	la.add(�������);
    	lan2.setLayout(new BorderLayout(10,10));
    	li2.setFont(new Font("΢���ź�", Font.PLAIN, 16));
    	la1.add(li2);
    	lan2.add(la1,BorderLayout.NORTH);
    	lan2.add(la,BorderLayout.CENTER);
    	
    	label7.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label8.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label9.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	text7.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	text8.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	text9.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	�����¼.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	Box basebox,box1,box2;
    	box1=Box.createVerticalBox();
    	box1.add(label7);
    	box1.add(Box.createVerticalStrut(21));
    	box1.add(label8);
    	box1.add(Box.createVerticalStrut(21));
    	box1.add(label9);
    	box1.add(Box.createVerticalStrut(21));
    	box2=Box.createVerticalBox();
    	box2.add(text7);
    	box2.add(Box.createVerticalStrut(21));
    	box2.add(text8);
    	box2.add(Box.createVerticalStrut(21));
    	box2.add(text9);
    	box2.add(Box.createVerticalStrut(21));
    	box2.add(�����¼);
    	basebox=Box.createHorizontalBox();
    	basebox.add(box1);
    	basebox.add(Box.createHorizontalStrut(10));
    	basebox.add(box2);
    	la2.add(basebox);
    	la2.add(�����¼);
    	lan3.setLayout(new BorderLayout(10,10));
    	JPanel op=new JPanel();
    	JLabel op1=new JLabel("                 ");
    	op1.setFont(new Font("΢���ź�", Font.PLAIN, 24));
    	op.add(op1);
    	lan3.add(op,BorderLayout.NORTH);
    	lan3.add(la2,BorderLayout.CENTER);
    	
    	label10.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label11.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	label12.setFont(new Font("΢���ź�", Font.PLAIN, 21));
    	text10.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	text11.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	text12.setFont(new Font("΢���ź�", Font.PLAIN, 19));
    	ά�޼�¼.setFont(new Font("΢���ź�", Font.PLAIN, 18));
    	Box basebox1,box3,box4;
    	box3=Box.createVerticalBox();
    	box3.add(label10);
    	box3.add(Box.createVerticalStrut(21));
    	box3.add(label11);
    	box3.add(Box.createVerticalStrut(21));
    	box3.add(label12);
    	box3.add(Box.createVerticalStrut(21));
    	box4=Box.createVerticalBox();
    	box4.add(text10);
    	box4.add(Box.createVerticalStrut(21));
    	box4.add(text11);
    	box4.add(Box.createVerticalStrut(21));
    	box4.add(text12);
    	box4.add(Box.createVerticalStrut(21));
    	box4.add(ά�޼�¼);
    	basebox1=Box.createHorizontalBox();
    	basebox1.add(box3);
    	basebox1.add(Box.createHorizontalStrut(10));
    	basebox1.add(box4);
    	JPanel la3=new JPanel();
    	la3.add(basebox1);
    	la3.add(ά�޼�¼);
    	lan4.setLayout(new BorderLayout(10,10));
    	JPanel op2=new JPanel();
    	JLabel op3=new JLabel("                 ");
    	op3.setFont(new Font("΢���ź�", Font.PLAIN, 24));
    	op2.add(op3);
    	lan4.add(op2,BorderLayout.NORTH);
    	lan4.add(la3,BorderLayout.CENTER);
    	
    	lan5.setLayout(new BorderLayout(5,5));
    	��ѯ����.setFont(new Font("΢���ź�", Font.PLAIN, 17));
    	��ѯά��.setFont(new Font("΢���ź�", Font.PLAIN, 17));
    	JPanel x1=new JPanel();
    	JPanel x2=new JPanel();
    	JPanel x3=new JPanel();
    	x1.setLayout(new GridLayout(1,2));
    	x1.add(��ѯ����);
    	x1.add(��ѯά��);
    	x3.add(js3);
    	JLabel k=new JLabel("������ά�ޱ�");
    	k.setFont(new Font("����", Font.PLAIN, 20));
    	k.setForeground(Color.RED);
    	x2.add(k);
    	area3.setFont(new Font("΢���ź�", Font.PLAIN, 16));
    	lan5.add(x1,BorderLayout.SOUTH);
    	lan5.add(x3, BorderLayout.CENTER);
    	lan5.add(x2, BorderLayout.NORTH);
    	
    	
    	centerPanel.setLayout(card);
    	centerPanel.add("1", lan1);
    	centerPanel.add("2",lan2);
    	centerPanel.add("3",lan3);
    	centerPanel.add("4",lan4);
    	centerPanel.add("5",lan5);
    	this.add(centerPanel,BorderLayout.CENTER);
    	this.setVisible(true);
    	this.setResizable(false);
    	button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(centerPanel, "1");	
			}
    	});
       	button2.addActionListener(new ActionListener(){

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				card.show(centerPanel, "2");	
    			}
        });
       	button3.addActionListener(new ActionListener(){

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				card.show(centerPanel, "3");	
    			}
        });
       	button4.addActionListener(new ActionListener(){

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				card.show(centerPanel, "4");	
    			}
        });
       	button5.addActionListener(new ActionListener(){

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				card.show(centerPanel, "5");	
    			}
        });
       	���.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ����豸����(con);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
       		
       	});
       	��ѯ.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				select();
				
			}
       		
       	});
       	text1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				��ѯ.doClick();
				
			}
       		
       	});
       	text2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				��ѯ.doClick();
				
			}
       		
       	});
       	text3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				��ѯ.doClick();
				
			}
       		
       	});
       	���Ͳ�ѯ.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				leiselect();
				
			}
       	});
      	�������.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				leiinsert();
				
			}
       	});
        text4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				leiselect();
			}
        	
        });
        �����¼.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				 try {
					PreparedStatement pstmt = con.prepareStatement("exec �����¼�ύ   ?,?,?");
					pstmt.setString(1,text7.getText());
					pstmt.setString(3, text8.getText());
					pstmt.setDate(2, java.sql.Date.valueOf(text9.getText()));
					ResultSet res =pstmt.executeQuery();
					pstmt.close();
				    JOptionPane.showMessageDialog(text8, "�ύ�ɹ�!","��ʾ",JOptionPane.WARNING_MESSAGE);
				} catch (SQLException e1) {
					//e1.printStackTrace();
				}
				
			}
        	
        });
        ά�޼�¼.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
			 try {
					PreparedStatement pstmt = con.prepareStatement("exec ά�޼�¼�ύ   ?,?,?");
					pstmt.setString(1,text10.getText());
					pstmt.setString(3, text11.getText());
					pstmt.setDate(2, java.sql.Date.valueOf(text12.getText()));
					rs=pstmt.executeQuery();
					JOptionPane.showMessageDialog(text11, "�ύ�ɹ�!","��ʾ",JOptionPane.WARNING_MESSAGE);
				} catch (SQLException e1) {
					//e1.printStackTrace();
				}
				
			}
        	
        });
        ��ѯ����.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				  try {
					String output="�豸���"+"\t"+"��������"+"\t"+"������"+"\n";
					 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					aql=con.createStatement();
					 rs=aql.executeQuery("select * from �豸�����");
				      while(rs.next()){
				    	  String id=rs.getString(1);
				    	  String date=sdf.format(rs.getDate(2));
				    	  String name=rs.getString(3);
				    	  output+=id+"\t"+date+"\t"+name+"\n";
				      }
				      area3.setText(output);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
        });
        ��ѯά��.addActionListener(new ActionListener(){

 			@Override
 			public void actionPerformed(ActionEvent e) {
 				  try {
 					String output="�豸���"+"\t"+"ά������"+"\t"+"ά����"+"\n";
 					 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
 					aql=con.createStatement();
 					 rs=aql.executeQuery("select * from �豸ά�ޱ�");
 				      while(rs.next()){
 				    	  String id=rs.getString(1);
 				    	  String date=sdf.format(rs.getDate(2));
 				    	  String name=rs.getString(3);
 				    	  output+=id+"\t"+date+"\t"+name+"\n";
 				      }
 				      area3.setText(output);
 				} catch (SQLException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				}
 			}	
         });
     
    }
    protected void processWindowEvent(WindowEvent e){
    	super.processWindowEvent(e);
    	if(e.getID()==WindowEvent.WINDOW_CLOSING){
    		  try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
    		System.exit(0);
    	}
    }
    void select(){
    	String str1,str2,str3;
    	str1=text1.getText();
    	str2=text2.getText();
    	str3=text3.getText();

   	  try{
   		  
   		  PreparedStatement pstmt = con.prepareStatement("select * from �豸̨�˱�  where �豸���=? or �豸����=? or �豸����=?");
   		  if(!str1.equals("")){
   		  pstmt.setString(1,str1);
   		  pstmt.setString(2, null);
   		  pstmt.setString(3, null);
   		  }
   		  else if(str1.equals("")&&!str2.equals("")){
   			pstmt.setString(2,str2);
  		  pstmt.setString(1, null);
   		  pstmt.setString(3, null);
   		  }
   		  else if(str1.equals("")&&str2.equals("")&&!str3.equals("")){
   			pstmt.setString(3,str3);
   		  pstmt.setString(1, null);
   		  pstmt.setString(2, null);
   		  }
   		  else{
   	   		  pstmt.setString(1,null);
   	   		  pstmt.setString(2, null);
   	   		  pstmt.setString(3, null); 
   		  }
   		  
   		  rs=pstmt.executeQuery();
   		  String id;
   		  String name;
   		  String type,baosun,danjia,changjia,date,peo;
   		  String output="�豸���"+"\t"+"�豸����"+"\t"+"�豸����"+"\t"+"�Ƿ���"+"\t"+"����"+"\t"+"��������"+"\t"+"��������"+"\t"+"������"+"\n";
   		  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
   	     
   		  if(rs.next()){
   		 do{
   			   id=rs.getString(1);
   			   name=rs.getString(2);
   			   type=rs.getString(3); 
   			   baosun=rs.getString(4);
   			   danjia=rs.getString(5);
   			   changjia=rs.getString(6);
   			   if(rs.getDate(7)!=null){
   			   date=sdf.format(rs.getDate(7));
   			   }
   			   else{
   				   date=null;
   			   }
   			   peo=rs.getString(8);
   			   output+=id+"\t"+name+"\t"+type+"\t"+baosun+"\t"+danjia+"\t"+changjia+"\t"+date+"\t"+peo+"\n";
   		       area.setText(output);
   		 }while(rs.next());
   		 }
   		 else{
   			 area.setText("\n"+"�����ڵ�ǰ�豸");
   		 }
//   		  con.close();
   	  }catch(SQLException e){
   		e.printStackTrace();
   		  //System.out.println(e);
   	  }	
    }
    void leiselect(){
    	String str1;
    	str1=text4.getText();
    	t1.setText("");
    	t2.setText("");
    	 try {
			PreparedStatement pstmt = con.prepareStatement("select * from ������ͼ  where �豸����=?;");
			PreparedStatement pstmt1 = con.prepareStatement("select * from �豸���ͱ�  where �豸����=?;");
			if(str1!=null){
			pstmt.setString(1, str1);
			pstmt1.setString(1, str1);
			rs=pstmt.executeQuery();
			while(rs.next()){
				t1.setText(rs.getString(2));
				t2.setText(rs.getString(3));
			}
		    rs=pstmt1.executeQuery();
		    while(rs.next()){
				text5.setText(rs.getString(2));
				area2.setText(rs.getString(3));
		    }
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    void leiinsert(){
    	t1.setText("");
    	t2.setText("");
    	try {
			PreparedStatement pstmt = con.prepareStatement("insert into �豸���ͱ�(�豸����,������,����˵��)  values(?,?,?)");
			pstmt.setString(1,text4.getText());
			pstmt.setString(2, text5.getText());
			pstmt.setString(3, area2.getText());
			ResultSet res =pstmt.executeQuery();
			pstmt.close();
			JOptionPane.showMessageDialog(text5, "��ӳɹ�!","��ʾ",JOptionPane.WARNING_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
    }
}
