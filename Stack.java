package mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
private int[] s;
private int size;
private int top=-1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(212, 11, 258, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE:");
		lblEnterTheStack.setForeground(Color.BLACK);
		lblEnterTheStack.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterTheStack.setBounds(33, 72, 235, 25);
		contentPane.add(lblEnterTheStack);
		
		sizefield = new JTextField();
		sizefield.setBounds(289, 64, 112, 29);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterAnElement.setForeground(Color.BLACK);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterAnElement.setBounds(33, 175, 204, 25);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(247, 161, 96, 35);
		contentPane.add(element);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setBackground(Color.MAGENTA);
		stack.setFont(new Font("Constantia", Font.BOLD, 16));
		stack.setBounds(211, 121, 149, 29);
		contentPane.add(stack);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if(top==size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
					
				}
				else {
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successfull");
element.setText("");
				}
			}
		});
		push.setBackground(Color.MAGENTA);
		push.setFont(new Font("Constantia", Font.BOLD, 20));
		push.setBounds(393, 161, 87, 33);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible ");

				}
				else {
					String message="Element deleted is: "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;

 
				}
			}
		});
		pop.setBackground(Color.MAGENTA);
		pop.setFont(new Font("Constantia", Font.BOLD, 20));
		pop.setBounds(249, 230, 75, 33);
		contentPane.add(pop);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(129, 323, 304, 29);
		contentPane.add(displaybox);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//.display code
				String msg="";
				if(top==-1) {
					displaybox.setText("");  //first one element is showing in order to hide that

					JOptionPane.showMessageDialog(contentPane, "Display not possible");


				}
				else {
					for(int i=top;i>=0;i--) {
						msg=msg+s[i]+" ";
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 20));
		display.setBackground(Color.MAGENTA);
		display.setBounds(249, 279, 117, 33);
		contentPane.add(display);
	}
}

