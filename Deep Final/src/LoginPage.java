import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.sql.*;

import java.awt.Window;
import java.awt.Color;
import java.awt.Font;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection conn=null;
	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(6, 6, 707, 456);
		contentPane.add(desktopPane);
		
		JLabel lblRaiwayReservationSystem = new JLabel("Raiway Reservation System Login");
		lblRaiwayReservationSystem.setBackground(Color.WHITE);
		lblRaiwayReservationSystem.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblRaiwayReservationSystem.setBounds(255, 16, 294, 45);
		desktopPane.add(lblRaiwayReservationSystem);
		
		textField = new JTextField();
		textField.setBounds(419, 119, 130, 26);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(419, 188, 130, 21);
		desktopPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean status=false;
				try {
					 Class.forName("com.mysql.jdbc.Driver");
			         Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");

				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				String q="select * from signup where id=? and pass=?;";
				PreparedStatement ps=con.prepareStatement(q);
				ps.setString(1,name);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				status=rs.next();
				con.close();

							/*Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
*/	
				
				if(name.equals("admin")&&password.equals("admin123")){
					JOptionPane.showMessageDialog(null, "Login successfully");

				   AdminMain ad=new AdminMain();
					ad.setVisible(true);
					setVisible(false);
					
									}
				else if(status==true)
				{
					JOptionPane.showMessageDialog(null, "Login successfully");

					Train_Reservation tr=new Train_Reservation();
					tr.setVisible(true);
					setVisible(false);
				}
				
					else{
				
					JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1);

					
					
				}
			}
		});
		btnLogin.setBounds(153, 291, 117, 29);
		desktopPane.add(btnLogin);
		
		JButton btnSignin = new JButton("Signup");
		btnSignin.setBounds(432, 291, 117, 29);
		desktopPane.add(btnSignin);
		
		JLabel lblNewLabel = new JLabel("User ID");
		lblNewLabel.setBounds(130, 122, 82, 45);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(130, 185, 92, 28);
		desktopPane.add(lblNewLabel_1);
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signup sign=new signup();
				desktopPane.add(sign);
				sign.setVisible(true);
				
			}
		});
		
		
	}
}
