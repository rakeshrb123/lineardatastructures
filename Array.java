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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
private int[] arr;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER ARRAY LENGTH:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
		lblNewLabel.setBounds(163, 79, 207, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(261, 11, 300, 29);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBackground(Color.WHITE);
		length.setForeground(Color.BLACK);
		length.setBounds(399, 75, 101, 29);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
//				String len=	length.getText();
				//	int l=Integer.valueOf(len);
						int len=Integer.valueOf(length.getText());
					arr=	new int[len];
					String message="array of length "+len+" created";
					JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 18));
		create.setBounds(283, 125, 167, 31);
		contentPane.add(create);
		
		JLabel J1 = new JLabel("ENTER AN INTEGER ELEMENT:");
		J1.setForeground(Color.RED);
		J1.setFont(new Font("Constantia", Font.BOLD, 18));
		J1.setBounds(10, 193, 265, 23);
		contentPane.add(J1);
		
		element = new JTextField();
		element.setForeground(Color.BLACK);
		element.setColumns(10);
		element.setBounds(283, 184, 96, 29);
		contentPane.add(element);
		
		JLabel J2 = new JLabel("POSITION:");
		J2.setForeground(Color.RED);
		J2.setFont(new Font("Constantia", Font.BOLD, 18));
		J2.setBounds(389, 193, 95, 23);
		contentPane.add(J2);
		
		insertposition = new JTextField();
		insertposition.setForeground(Color.BLACK);
		insertposition.setColumns(10);
		insertposition.setBounds(505, 184, 101, 27);
		contentPane.add(insertposition);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
		int elem=Integer.valueOf(element.getText());
		int pos=Integer.valueOf(insertposition.getText());
		arr[pos]=elem;
		String message="Element"+elem+" Inserted @ position "+pos;
		JOptionPane.showMessageDialog(contentPane,message);
element.setText("");
insertposition.setText("");

			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 18));
		insert.setBounds(628, 185, 97, 31);
		contentPane.add(insert);
		
		JLabel lblEnterThePosition = new JLabel("DELETE POSITION:");
		lblEnterThePosition.setForeground(Color.RED);
		lblEnterThePosition.setFont(new Font("Constantia", Font.BOLD, 18));
		lblEnterThePosition.setBounds(107, 257, 167, 23);
		contentPane.add(lblEnterThePosition);
		
		deleteposition = new JTextField();
		deleteposition.setForeground(Color.BLACK);
		deleteposition.setColumns(10);
		deleteposition.setBounds(289, 252, 96, 25);
		contentPane.add(deleteposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane,message);
deleteposition.setText("");
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 18));
		delete.setBounds(413, 253, 101, 31);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 18));
		display.setBounds(294, 307, 109, 31);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(Color.ORANGE);
		displaybox.setForeground(Color.WHITE);
		displaybox.setColumns(10);
		displaybox.setBounds(194, 359, 326, 53);
		contentPane.add(displaybox);
	}
}
