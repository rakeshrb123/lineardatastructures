package mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SinglyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField irear;
	private JTextField ifront;
	private JTextField result;
	private JTextField imiddle;
class Node{
	int data;
	Node link;
}
private Node first;
	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKEDLIST DATASTRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(228, 28, 377, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1.setBounds(40, 82, 193, 23);
		contentPane.add(lblNewLabel_1);
		
		irear = new JTextField();
		irear.setBounds(248, 73, 325, 38);
		contentPane.add(irear);
		irear.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(irear.getText());
				Node temp;
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at rear");
					irear.setText("");

				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at rear");
					irear.setText("");
				}			
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 18));
		btnNewButton.setBounds(601, 78, 163, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(40, 150, 193, 23);
		contentPane.add(lblNewLabel_1_1);
		
		ifront = new JTextField();
		ifront.setColumns(10);
		ifront.setBounds(248, 138, 325, 38);
		contentPane.add(ifront);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(ifront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at front");
					ifront.setText("");
				}
				else {
					newnode.link=first;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element inserted at front");
				ifront.setText("");
			}
		});
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 18));
		btnInsertFront.setBounds(601, 146, 163, 31);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				if(first.link==null) {
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					String message="Element deleted is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
				  
			}
		});
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDeleteRear.setBounds(317, 276, 167, 31);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else {
					String message="Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.link;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDeleteFront.setBounds(317, 318, 167, 31);
		contentPane.add(btnDeleteFront);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(237, 456, 325, 38);
		contentPane.add(result);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null) {
					result.setText("");
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if( first.link==null)
				{	
					String s=String.valueOf(first.data);
			result.setText(s);
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
					result.setText(msg);
				}
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDisplay.setBounds(360, 402, 109, 31);
		contentPane.add(btnDisplay);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(40, 232, 193, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		imiddle = new JTextField();
		imiddle.setColumns(10);
		imiddle.setBounds(248, 217, 325, 38);
		contentPane.add(imiddle);
		
		JButton midl = new JButton("INSERT MIDDLE");
		midl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count=0;
				int elem=Integer.valueOf(imiddle.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				Node temp1=first;
				while(temp1!=null) {
					count++;
					temp1=temp1.link;
				}
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, " FIrst insert elements");
					imiddle.setText("");
				}
				if(count==1) {
					JOptionPane.showMessageDialog(contentPane, "First Element is inserted");
					newnode.link=first;
					first=newnode;
					imiddle.setText("");
				}
					//for inserting in between 2 elements	and 3 elements
				 if(count==2 || count==3) {
				 temp1=first;
				Node	 temp4=temp1.link;
					temp1.link=newnode;
					newnode.link=temp4;
					JOptionPane.showMessageDialog(contentPane, " Element inserted at middle for 2 elemets");
					imiddle.setText("");
				 }      
          //for more than 3 elements
					if(count>3) {	
					JOptionPane.showMessageDialog(contentPane, "Element inserted at middle for more than 3 elements");
					imiddle.setText("");
					Node temp2=first;
					Node temp4=first;
					temp4=temp4.link;
					for(int i=0;i<(count/2)-1;i++) {
						temp2=temp2.link;
						temp4=temp4.link;
					}
						temp2.link=newnode;
						newnode.link=temp4;
					}
			} 		
		});
		midl.setFont(new Font("Constantia", Font.BOLD, 18));
		midl.setBounds(601, 217, 175, 31);
		contentPane.add(midl);
		
		JButton btnDeleteMiddle = new JButton("DELETE MIDDLE");
		btnDeleteMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count=0;
				Node temp1=first;
				while(temp1!=null) {
					count++;
					temp1=temp1.link;
				}
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, " No elements to delete");
					imiddle.setText("");
				}			
				if(count==1) {
					JOptionPane.showMessageDialog(contentPane, "Only first element deleted"+first.data);
					first=null;
					imiddle.setText("");
				}
					//for deleting  in between 2 elements	
				 if(count==2) {
				 temp1=first;
				first=first.link;
					JOptionPane.showMessageDialog(contentPane, " Only  2 elemets element deleted is "+temp1.data);
					imiddle.setText("");
				 } 
					//for 3 elements
				         Node temp3,temp2;
							Node temp=first;
				         if(count==3) {
				        	int a= first.link.data;
								temp2=	temp.link.link;
                         temp.link=temp2;
						JOptionPane.showMessageDialog(contentPane, "Only 3 elements middle element deleted "+a);
						imiddle.setText("");
					 }	         
          //for more than 3 elements
				if(count>3) {	
					imiddle.setText("");
					 temp2=first;
					Node temp4=first;
					temp4=temp4.link.link;
					for(int i=0;i<(count/2)-1;i++) {
						temp2=temp2.link;
						temp4=temp4.link;
					}
					JOptionPane.showMessageDialog(contentPane, "Middle Element deleted "
							+ "greater than 4 elements is "+temp2.link.data);
					temp2.link=temp4;
					}		
			}			
		});
		btnDeleteMiddle.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDeleteMiddle.setBounds(317, 360, 177, 31);
		contentPane.add(btnDeleteMiddle);
	}
}
