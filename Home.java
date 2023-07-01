package mini;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA STRUCTURE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 25));
		lblNewLabel.setBounds(194, 22, 363, 31);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
			//	Array a=new Array();
			//	a.setVisible(true);
				
				new Array().setVisible(true);
			}
		});
		array.setForeground(Color.MAGENTA);
		array.setFont(new Font("Constantia", Font.BOLD, 20));
		array.setBackground(Color.WHITE);
		array.setBounds(286, 60, 99, 33);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
new  Stack().setVisible(true);
			}
		});
		stack.setForeground(Color.MAGENTA);
		stack.setFont(new Font("Constantia", Font.BOLD, 20));
		stack.setBackground(Color.WHITE);
		stack.setBounds(125, 119, 97, 33);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
new Queue().setVisible(true);
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setFont(new Font("Constantia", Font.BOLD, 20));
		queue.setBackground(Color.WHITE);
		queue.setBounds(440, 119, 103, 33);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
new Queue().setVisible(true);
			}
		});
		cqueue.setForeground(Color.MAGENTA);
		cqueue.setFont(new Font("Constantia", Font.BOLD, 20));
		cqueue.setBackground(Color.WHITE);
		cqueue.setBounds(34, 222, 211, 33);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLYLINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLIST WINDOW OPENING CODE HERE
new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(Color.MAGENTA);
		sll.setFont(new Font("Constantia", Font.BOLD, 20));
		sll.setBackground(Color.WHITE);
		sll.setBounds(440, 222, 225, 33);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLYLINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLYLINKEDLIST WINDOW OPENING CODE HERE
new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(Color.MAGENTA);
		dll.setFont(new Font("Constantia", Font.BOLD, 20));
		dll.setBackground(Color.WHITE);
		dll.setBounds(210, 322, 237, 33);
		contentPane.add(dll);
	}
}
