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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField size;
	private JTextField element;
	private JTextField result;
	private int[] q;
	private int size1;
	private int r=-1;
	private int f=0;
	int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(101, 11, 538, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE:");
		lblEnterQueueSize.setForeground(Color.BLUE);
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterQueueSize.setBounds(26, 81, 195, 25);
		contentPane.add(lblEnterQueueSize);
		
		size = new JTextField();
		size.setBackground(Color.WHITE);
		size.setBounds(254, 69, 113, 32);
		contentPane.add(size);
		size.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size1=Integer.valueOf(size.getText());
				q=new int[size1];
				String message="queue of size "+size1+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(Color.MAGENTA);
		queue.setFont(new Font("Constantia", Font.BOLD, 20));
		queue.setBounds(229, 115, 185, 33);
		contentPane.add(queue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT:");
		lblEnterAnElement.setForeground(Color.BLUE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 20));
		lblEnterAnElement.setBounds(23, 166, 204, 25);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(254, 157, 113, 32);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(count==size1) {
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");

				}
				else {
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size1;
					q[r]=elem;
					count++;
					String message="element "+elem+" inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");

				}
			}
		});
		insert.setForeground(Color.MAGENTA);
		insert.setFont(new Font("Constantia", Font.BOLD, 20));
		insert.setBounds(454, 157, 124, 31);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				}
				else {
					String message="Element deleted is "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size1;
					--count;

				}
			}
		});
		delete.setForeground(Color.MAGENTA);
		delete.setFont(new Font("Constantia", Font.BOLD, 20));
		delete.setBounds(258, 211, 109, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int f1=f;
				if(count==0) {
					result.setText("");
				JOptionPane.showMessageDialog(contentPane, "Display not possible");

			}
			else {
				for(int i=1;i<=count;i++) {
					msg=msg+" "+q[f1];
					f1=(f1+1)%size1;
				}
				result.setText(msg);
			}
			}
		});
		display.setForeground(Color.MAGENTA);
		display.setFont(new Font("Constantia", Font.BOLD, 20));
		display.setBounds(254, 265, 117, 33);
		contentPane.add(display);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(159, 309, 312, 43);
		contentPane.add(result);
	}

}
