package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controllers.hop_dong_controller;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu {

	private static JFrame frame;
//	public static hop_dong_controller hopDong = new hop_dong_controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u01B0\u01A1ng tr\u00ECnh qu\u1EA3n l\u00FD thu\u00EA xe");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(134, 11, 299, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1EE3p \u0111\u1ED3ng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(76, 82, 149, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qu\u1EA3n l\u00FD chung");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(305, 79, 211, 49);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JButton btnThemHopDong = new JButton("Th\u00EAm h\u1EE3p \u0111\u1ED3ng");
		btnThemHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new themHopDong();
				hiddenMenu();
			}
		});
		btnThemHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnThemHopDong.setBounds(40, 128, 211, 49);
		frame.getContentPane().add(btnThemHopDong);
		
		JButton btnSuaHopDong = new JButton("S\u1EEDa, x\u00F3a h\u1EE3p \u0111\u1ED3ng");
		btnSuaHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new sua_xoaHopDong();
				hiddenMenu();
			}
		});
		btnSuaHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSuaHopDong.setBounds(40, 188, 211, 49);
		frame.getContentPane().add(btnSuaHopDong);
		JButton btnTimKiemHopDong = new JButton("T\u00ECm v\u00E0 xem h\u1EE3p \u0111\u1ED3ng");
		btnTimKiemHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new timVaXemHopDong();
				hiddenMenu();
			}
		});
		btnTimKiemHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemHopDong.setBounds(305, 128, 221, 49);
		frame.getContentPane().add(btnTimKiemHopDong);
		
		JButton btnChiPhi = new JButton("Chi ph\u00ED b\u00E3i xe");
		btnChiPhi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new xemChiPhi();
			}
		});
		btnChiPhi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnChiPhi.setBounds(305, 191, 221, 42);
		frame.getContentPane().add(btnChiPhi);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnThoat.setBounds(170, 284, 180, 49);
		frame.getContentPane().add(btnThoat);
	}
	
	public static void displayMenu() {
		frame.setVisible(true);
	}
	
	public static void hiddenMenu() {
		frame.setVisible(false);
	}
}
