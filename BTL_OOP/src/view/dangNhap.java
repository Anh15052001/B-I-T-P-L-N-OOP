package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dangNhap {

	private JFrame frame;
	private JTextField textTaiKhoan;
	private JTextField textMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangNhap window = new dangNhap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dangNhap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0103ng nh\u1EADp");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 29, 109, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(52, 71, 121, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u1EADt kh\u1EA9u");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(57, 129, 79, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		textTaiKhoan = new JTextField();
		textTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTaiKhoan.setBounds(183, 68, 178, 35);
		frame.getContentPane().add(textTaiKhoan);
		textTaiKhoan.setColumns(10);
		
		textMatKhau = new JTextField();
		textMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMatKhau.setBounds(183, 125, 178, 37);
		frame.getContentPane().add(textMatKhau);
		textMatKhau.setColumns(10);
		
		JButton btnDangNhap = new JButton("\u0110\u0103ng nh\u1EADp");
		btnDangNhap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tenDangNhap = textTaiKhoan.getText();
				String matKhau = textMatKhau.getText();
				if(tenDangNhap.equals("Admin") == true && matKhau.equals("Admin") == true) {
					frame.setVisible(false);
					new Menu();
				}
				else {
					JOptionPane.showMessageDialog(null,"Tên đăng nhập hoặc mật khẩu không đúng!");
				}
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDangNhap.setBounds(120, 189, 144, 37);
		frame.getContentPane().add(btnDangNhap);
	}
}
