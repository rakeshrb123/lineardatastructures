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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
private int[] q;
private int size1;
private int r=-1;
private int f=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(162, 11, 394, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE:");
		lblEnterQueueSize.setForeground(Color.BLUE);
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterQueueSize.setBounds(25, 90, 195, 25);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setBounds(239, 78, 132, 37);
		contentPane.add(size);
		size.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size1=Integer.valueOf(size.getText());
				q=new int[size1];
				String message="queue of size "+size1+" created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		create.setBackground(Color.GREEN);
		create.setFont(new Font("Constantia", Font.BOLD, 20));
		create.setBounds(224, 159, 185, 33);
		contentPane.add(create);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterAnElement.setForeground(Color.BLUE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterAnElement.setBounds(25, 239, 204, 25);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(241, 225, 111, 40);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.setBackground(Color.GREEN);
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r==size1-1) {
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");

				}
				else {
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					String message="element "+elem+" inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");

				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 16));
		insert.setBounds(410, 228, 89, 36);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1||f>r) {
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				}
				else {
					String message="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f++;

				}
			}
		});
		delete.setBackground(Color.GREEN);
		delete.setFont(new Font("Constantia", Font.BOLD, 20));
		delete.setBounds(243, 295, 109, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(r==-1||f>r) {
					result.setText("");
				JOptionPane.showMessageDialog(contentPane, "Display not possible");

			}
			else {
				for(int i=f;i<=r;i++) {
					msg=msg+" "+q[i];
				}
				result.setText(msg);
			}
			}
		});
		display.setBackground(Color.GREEN);
		display.setFont(new Font("Constantia", Font.BOLD, 20));
		display.setBounds(239, 353, 117, 33);
		contentPane.add(display);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(190, 401, 246, 37);
		contentPane.add(result);
	}

}
