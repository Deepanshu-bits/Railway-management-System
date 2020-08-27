import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
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
	public AdminMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(6, 6, 728, 579);
		contentPane.add(desktopPane);
		
		JButton btnAddTrain = new JButton("Add Train");
		btnAddTrain.setBounds(301, 94, 190, 40);
		btnAddTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADD_Trains tr=new ADD_Trains();
				desktopPane.add(tr);
			     tr.setVisible(true);	
			}
		});
		desktopPane.setLayout(null);
		desktopPane.add(btnAddTrain);
		
		JButton btnDeleteTrain = new JButton("Delete Train");
		btnDeleteTrain.setBounds(301, 159, 190, 44);
		btnDeleteTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_trains tr=new delete_trains();
				desktopPane.add(tr);
			     tr.setVisible(true);	
			}
		});
		desktopPane.add(btnDeleteTrain);
		
		JButton btnViewEmployeeDetails = new JButton("View Employee Details");
		btnViewEmployeeDetails.setBounds(301, 236, 190, 46);
		btnViewEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employees tr=new Employees();
				desktopPane.add(tr);
			     tr.setVisible(true);	
			}
		});
		desktopPane.add(btnViewEmployeeDetails);
		
		JButton btnUpdateEmployeeDetails = new JButton("Update Employee Details");
		btnUpdateEmployeeDetails.setBounds(301, 317, 190, 53);
		btnUpdateEmployeeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeEmployeedetails tr=new changeEmployeedetails();
				desktopPane.add(tr);
			     tr.setVisible(true);	
			}
		});
		desktopPane.add(btnUpdateEmployeeDetails);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				LoginPage lg=new LoginPage();
				lg.setVisible(true);
				setVisible(false);
						
				
			}
		});
		btnNewButton.setBounds(301, 414, 190, 40);
		desktopPane.add(btnNewButton);
		
		JLabel lblAdminPage = new JLabel("Admin Page");
		lblAdminPage.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		lblAdminPage.setBounds(316, 18, 209, 16);
		desktopPane.add(lblAdminPage);
	}
}
