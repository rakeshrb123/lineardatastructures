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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField irear;
	private JTextField ifront;
	private JTextField result;
	private JTextField imiddle;
class Node{
	int data;
	Node nextlink=null;
	Node prevlink=null;
}
private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKEDLIST DATASTRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(217, 21, 390, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 81, 217, 25);
		contentPane.add(lblNewLabel_1);
		
		irear = new JTextField();
		irear.setBounds(237, 71, 293, 31);
		contentPane.add(irear);
		irear.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(irear.getText());
				Node newnode=new Node();
				Node temp;
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prevlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at rear");
					irear.setText("");
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prevlink=temp;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at rear");
					irear.setText("");
				}
			}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 20));
		btnNewButton.setBounds(594, 71, 179, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 157, 217, 25);
		contentPane.add(lblNewLabel_1_1);
		
		ifront = new JTextField();
		ifront.setColumns(10);
		ifront.setBounds(237, 153, 293, 31);
		contentPane.add(ifront);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(ifront.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prevlink=null;
				if(first==null) {
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at front");
					ifront.setText("");

				}
				else {
					newnode.nextlink=first;
					first.prevlink=newnode;
					first=newnode;
					JOptionPane.showMessageDialog(contentPane, "Element inserted at front");
					ifront.setText("");


				}
			}
		});
		btnInsertFront.setForeground(Color.GREEN);
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 20));
		btnInsertFront.setBounds(594, 140, 179, 33);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				 if(first==null) {
						JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				 }
				 else if(first.nextlink==null) {
						JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
						first=null;
				 }
				 else {
					 temp=first;
					 while(temp.nextlink.nextlink!=null) {
						 temp=temp.nextlink;
					 }
						JOptionPane.showMessageDialog(contentPane, "Element deleted is "+temp.nextlink.data);
						temp.nextlink=null;

				 }
			}
		});
		btnDeleteRear.setForeground(Color.GREEN);
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 20));
		btnDeleteRear.setBounds(317, 268, 181, 33);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(first==null) {
						JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				 }
				 else if(first.nextlink==null) {
						JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
						first=null;
				 }
				 else {
					 JOptionPane.showMessageDialog(contentPane, "Element deleted is "+first.data);
					 first=first.nextlink;
					 first.prevlink=null;
				 }
			}
		});
		btnDeleteFront.setForeground(Color.GREEN);
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 20));
		btnDeleteFront.setBounds(315, 312, 183, 33);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayForward = new JButton("DISPLAY FORWARD");
		btnDisplayForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null) {
					result.setText("");
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					String a=""+first.data;
	result.setText(a);
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
					result.setText(msg);
				}
			}
		});
		btnDisplayForward.setForeground(Color.GREEN);
		btnDisplayForward.setFont(new Font("Constantia", Font.BOLD, 20));
		btnDisplayForward.setBounds(68, 433, 227, 33);
		contentPane.add(btnDisplayForward);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				Node temp;
				if(first==null) {
					result.setText("");
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					String a=""+first.data;
	result.setText(a);
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
                        temp=temp.prevlink;
					}
					result.setText(msg);
				}
			}
		});
		btnDisplayReverse.setForeground(Color.GREEN);
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 20));
		btnDisplayReverse.setBounds(485, 433, 209, 33);
		contentPane.add(btnDisplayReverse);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(237, 495, 293, 31);
		contentPane.add(result);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 219, 217, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		imiddle = new JTextField();
		imiddle.setColumns(10);
		imiddle.setBounds(237, 215, 293, 31);
		contentPane.add(imiddle);
		
		JButton btnInsertMiddle = new JButton("INSERT MIDDLE");
		btnInsertMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(imiddle.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prevlink=null;
				int count=0;
				Node temp=first;
				while(temp!=null) {
					count++;
					temp=temp.nextlink;
				}
				//if no number is there
				if(count==0) {
					 JOptionPane.showMessageDialog(contentPane, "No elements to insert first insert element");
						imiddle.setText("");
				}
				//if only one number is there
				if(count==1) {
					 JOptionPane.showMessageDialog(contentPane, "First element is inserted"+newnode.data);
						newnode.nextlink=first;
						first.prevlink=newnode;
					first=	newnode;
					imiddle.setText("");
				}
				//if it is 2 numbers
				if(count==2 || count==3) {
	           Node temp1=first;
	           temp=first;
				 JOptionPane.showMessageDialog(contentPane, "Element  inserted is "+newnode.data);
	           temp1=temp1.nextlink;
	           temp.nextlink=newnode;
	           newnode.nextlink=temp1;
	           temp1.prevlink=newnode;
	           newnode.prevlink=temp;
				imiddle.setText("");
				}
				//if more than 3 numbers
				if(count>3) {
					Node temp2=first;
					Node temp3=first;
				    temp3=temp3.nextlink;
				    for(int i=0;i<(count/2)-1;i++) {
				    	temp2=temp2.nextlink;
				    	temp3=temp3.nextlink;	    	
				    }
				    temp2.nextlink=newnode;
				    newnode.nextlink=temp3;
				    temp3.prevlink=newnode;
				    newnode.prevlink=temp2;
					 JOptionPane.showMessageDialog(contentPane, "Element  inserted is "+newnode.data);
						imiddle.setText("");
				}		
			}
		});
		btnInsertMiddle.setForeground(Color.GREEN);
		btnInsertMiddle.setFont(new Font("Constantia", Font.BOLD, 20));
		btnInsertMiddle.setBounds(594, 215, 191, 33);
		contentPane.add(btnInsertMiddle);
		
		JButton btnDeleteMiddle = new JButton("DELETE MIDDLE");
		btnDeleteMiddle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count=0;
				Node temp=first;
				while(temp!=null) {
					count++;
					temp=temp.nextlink;
				}
				//if no number is there
				if(count==0) {
					 JOptionPane.showMessageDialog(contentPane, "No elements to delete");
				}
				//if only one number
				if(count==1) {
					 JOptionPane.showMessageDialog(contentPane, "One element is also deleted "+first.data);
               first=null;
				}
				//if 2 number is there
				if(count==2) {
					 JOptionPane.showMessageDialog(contentPane, "First element is deleted "+first.data);
					first=first.nextlink;
					first.prevlink=null;
				}
				//if 3 number is there
				Node temp1=first;
			     temp=first;
				if(count==3) {
					temp1=temp1.nextlink.nextlink;
					 JOptionPane.showMessageDialog(contentPane, "Middle  element is deleted "+temp.nextlink.data);
					temp.nextlink=temp1;
					temp1.prevlink=temp;
				}
				//if more than 3 numbers
				if(count>3) {
					Node temp2=first;
					Node temp3=first;
				    temp3=temp3.nextlink.nextlink; 				    
				    for(int i=0;i<(count/2)-1;i++) {
				    	temp3=temp3.nextlink;
				    	temp2=temp2.nextlink;
				    }
					 JOptionPane.showMessageDialog(contentPane, "Element  deleted is "+temp2.nextlink.data);
				    temp2.nextlink=temp3;
				    temp3.prevlink=temp2;	    
				}
			}
		});
		btnDeleteMiddle.setForeground(Color.GREEN);
		btnDeleteMiddle.setFont(new Font("Constantia", Font.BOLD, 20));
		btnDeleteMiddle.setBounds(317, 363, 183, 33);
		contentPane.add(btnDeleteMiddle);
	}

}
