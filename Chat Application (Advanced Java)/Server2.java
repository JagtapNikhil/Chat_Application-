import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.Font;

import javax.swing.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

class Server2 
{
	static String str="",str1="Hello";
	static String S1="",S2="",d="";
	static JFrame f,f1;
	static JTextArea ta,ta1;
	static JTextField tf;
	static DataOutputStream dos;
	static JSplitPane splitPane ;
	static PrintStream ps;
	static BufferedReader br;
	static Socket s;
	public static Dialog dlg;
	

		public static void main(String args[])
		throws Exception
		{
			
				dis();
				ServerSocket ss=new ServerSocket(1088);//create server socket

				 s=ss.accept();//connecting to client socket

				System.out.println("Connection Esatblished");

				//PrintStream ps=new PrintStream(s.getOutputStream());//to send data to the client

				BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));//to read data coming from client
				//BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));//to read data from keyboard

				while(true)//server execute continuously
				{
					

					while((str1=br.readLine())!=null)
					{
						
						str1=br.readLine();

						ta.append(str1 + "\n");
					}


					//close connection	
					
					
					System.exit(0);//terminate application
				}	

		}
		
		static void dis()
		{

		
		 

			
			f=new JFrame("Chat Application1");
			f.setSize(500,500);
			
			
			splitPane = new JSplitPane();
			splitPane.setDividerLocation(250);
			splitPane.setDividerSize(5);
			f.getContentPane().add(splitPane, BorderLayout.CENTER);


			JMenuBar mb=new JMenuBar();
			mb.setBackground(Color.GREEN);
			JMenu m1=new JMenu("Profile");
			JMenu m2=new JMenu("Settings");
			
			mb.add(m1);
			mb.add(m2);
			
			JMenuItem m7=new JMenuItem("Exit");
			JMenuItem m9=new JMenuItem("My Account");


			JMenu submenu=new JMenu("Theme");
			JMenu submenu1=new JMenu("Font");
			JMenuItem m3=new JMenuItem("Light");
			
			JMenuItem m4=new JMenuItem("Dark");
			JMenuItem m5=new JMenuItem("Italic");
			JMenuItem m6=new JMenuItem("Bold");
			//JMenuItem m8=new JMenuItem("Default");

			m2.add(submenu);
			m2.add(submenu1);
			m1.add(m9);
			m1.add(m7);


			submenu.add(m3);
			submenu.add(m4);
			
			 submenu1.add(m5);
			 submenu1.add(m6);
			 //submenu1.add(m8);

			f1=new JFrame("My Account");
			f1.setSize(220,200);
			JLabel jl=new JLabel("Full Name:");
			JTextField tf1=new JTextField("Nikhil Jagtap",10);
			JLabel jl1=new JLabel("Contact No:");
			JTextField tf2=new JTextField("9373239903",10);
			JButton b6=new JButton("Save");

			f1.add(jl);
			f1.add(tf1);
			f1.add(jl1);
			f1.add(tf2);
			f1.add(b6);
			f1.setLayout(new FlowLayout(FlowLayout.CENTER));
			//JLabel jl2=new JLabel("**Account Saved**");
			f1.setLocationRelativeTo(f);
			


			 m9.addActionListener(new ActionListener()
			 {
			 	public void actionPerformed(ActionEvent w3)
			 	{
			 		
			 		f1.setVisible(true);
			 	}
			 }
			 );

			 b6.addActionListener(new ActionListener()
			 {
			 	public void actionPerformed(ActionEvent w4)
			 	{
			 		//f1.add(jl2);
			 		//jl2.setHorizontalAlignment(JLabel.CENTER);
			 		//jl2.setVerticalAlignment(JLabel.CENTER);

			 	}
			 }
			 );

			 m3.addActionListener(new ActionListener()
			{
				public void actionPerformed( ActionEvent w)
				{
					ta.setBackground(Color.WHITE);
					ta1.setBackground(Color.WHITE);
					ta.setForeground(Color.BLACK);
					ta1.setForeground(Color.BLACK);

				}
			}
			);

			m4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent w1)
				{
					ta.setBackground(Color.BLACK);
					ta1.setBackground(Color.BLACK);
					ta.setForeground(Color.WHITE);
					ta1.setForeground(Color.WHITE);
				}
			}
			);

			 
			 
			JPanel p=new JPanel();
			p.setBackground(Color.GREEN);
			JLabel l=new JLabel("Enter Message");
			JLabel l1=new JLabel("Do you want to exit?");
			tf=new JTextField(10);
			JButton b1=new JButton("Send");

			b1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e1)
			{
				try
				{
					S1=tf.getText();
					ta1.append(S1 + "\n"); 
					ps=new PrintStream(s.getOutputStream());//to send data to the client

				while(!(S1).equals(null))
				{
					
					ps.println(S1);//send to client
					//S1="Exite";
					break;
				}
				
				}
				catch(Exception e)
				{
					e.printStackTrace(); 
				}
			}
			}
			);
		
			JButton b2=new JButton("Clear");
			b2.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e2)
			{
				
				
				tf.setText("");
			}
			}
			);

			
			JButton b4=new JButton("Yes");
			JButton b5=new JButton("No");
				
	
			
					dlg=new Dialog(f,"",true);
					dlg.setLocationRelativeTo(f);
					dlg.setSize(150,150);
					dlg.setLayout(new FlowLayout(FlowLayout.CENTER));
					dlg.add(l1);
					dlg.add(b4);
					dlg.add(b5);	
					l1.setForeground(Color.red);	

			m7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e3)
				{
					
					dlg.setVisible(true);
				}
			}
			);

			b4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e4)
				{
					System.exit(0);
				}
			}
			);

			b5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
				{
					dlg.setVisible(false);
				}
			}
			);
			
			m5.addActionListener(new ActionListener()
			 {
			 	public void actionPerformed(ActionEvent w6)
			 	{
			 		ta.setFont(ta.getFont().deriveFont(Font.ITALIC));
			 		ta1.setFont(ta1.getFont().deriveFont(Font.ITALIC));
			 		m1.setFont(m1.getFont().deriveFont(Font.ITALIC));
			 		m2.setFont(m2.getFont().deriveFont(Font.ITALIC));
			 		m3.setFont(m3.getFont().deriveFont(Font.ITALIC));
			 		m4.setFont(m4.getFont().deriveFont(Font.ITALIC));
			 		m5.setFont(m5.getFont().deriveFont(Font.ITALIC));
			 		m6.setFont(m6.getFont().deriveFont(Font.ITALIC));
			 		m7.setFont(m7.getFont().deriveFont(Font.ITALIC));
			 		//m8.setFont(m8.getFont().deriveFont(Font.ITALIC));
			 		m9.setFont(m9.getFont().deriveFont(Font.ITALIC));
			 		l.setFont(l.getFont().deriveFont(Font.ITALIC));
			 		l1.setFont(l1.getFont().deriveFont(Font.ITALIC));
			 		b1.setFont(b1.getFont().deriveFont(Font.ITALIC));
			 		b2.setFont(b2.getFont().deriveFont(Font.ITALIC));
			 		b4.setFont(b4.getFont().deriveFont(Font.ITALIC));
			 		b5.setFont(b5.getFont().deriveFont(Font.ITALIC));
			 	}
			 }
			 );

			
			m6.addActionListener(new ActionListener()
			 {
			 	public void actionPerformed(ActionEvent w7)
			 	{
			 		ta.setFont(ta.getFont().deriveFont(Font.BOLD));
			 		ta1.setFont(ta1.getFont().deriveFont(Font.BOLD));
			 		m1.setFont(m1.getFont().deriveFont(Font.BOLD));
			 		m2.setFont(m2.getFont().deriveFont(Font.BOLD));
			 		m3.setFont(m3.getFont().deriveFont(Font.BOLD));
			 		m4.setFont(m4.getFont().deriveFont(Font.BOLD));
			 		m5.setFont(m5.getFont().deriveFont(Font.BOLD));
			 		m6.setFont(m6.getFont().deriveFont(Font.BOLD));
			 		m7.setFont(m7.getFont().deriveFont(Font.BOLD));
			 		//m8.setFont(m8.getFont().deriveFont(Font.BOLD));
			 		m9.setFont(m9.getFont().deriveFont(Font.BOLD));
			 		l.setFont(l.getFont().deriveFont(Font.BOLD));
			 		l1.setFont(l1.getFont().deriveFont(Font.BOLD));
			 		b1.setFont(b1.getFont().deriveFont(Font.BOLD));
			 		b2.setFont(b2.getFont().deriveFont(Font.BOLD));
			 		b4.setFont(b4.getFont().deriveFont(Font.BOLD));
			 		b5.setFont(b5.getFont().deriveFont(Font.BOLD));
			 	}
			 }
			 );

			p.add(l);
			p.add(tf);
			p.add(b1);
			p.add(b2);
			//p.add(b3);

			ta=new JTextArea(30,30);
		
			ta1=new JTextArea(30,30);
			ta.setText(S2);
			ta.setBackground(Color.black);
			ta1.setBackground(Color.black);
			ta.setForeground(Color.WHITE);
			ta1.setForeground(Color.WHITE);


			splitPane.setRightComponent(ta1);
			splitPane.setLeftComponent(ta);

			f.getContentPane().add(BorderLayout.SOUTH,p);
			f.getContentPane().add(BorderLayout.NORTH,mb);
			
			f.setVisible(true);
			//settext();
	
		}
}


			