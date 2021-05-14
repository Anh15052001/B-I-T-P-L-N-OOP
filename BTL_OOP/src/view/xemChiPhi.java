package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import models.xe_thue_theo_ngay;
import models.xe_thue_theo_thang;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class xemChiPhi {

	private JFrame frame;
	private JTextField textBatDau;
	private JTextField textKetThuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xemChiPhi window = new xemChiPhi();
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
	public xemChiPhi() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp kho\u1EA3ng th\u1EDDi gian (dd-MM-yyyy)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(55, 11, 317, 50);
		frame.getContentPane().add(lblNewLabel);
		
		textBatDau = new JTextField();
		textBatDau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textBatDau.setBounds(10, 98, 180, 36);
		frame.getContentPane().add(textBatDau);
		textBatDau.setColumns(10);
		
		JButton btnXemChiPhi = new JButton("Xem chi ph\u00ED");
		btnXemChiPhi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String thoiGianBatDau = textBatDau.getText();
				String thoiGianKetThuc = textKetThuc.getText();
				boolean check = false;
				long chiPhi=0;
				if(themHopDong.hopDong.hop_dong_theo_ngay == null &&themHopDong.hopDong.hop_dong_theo_thang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				System.out.println(themHopDong.hopDong.hop_dong_theo_ngay.size());
				if(themHopDong.hopDong.hop_dong_theo_ngay != null) {
					for( xe_thue_theo_ngay i : themHopDong.hopDong.hop_dong_theo_ngay ) {
//						System.out.println(themHopDong.hopDong.hop_dong_theo_ngay.size());
						if( i.getNgayThue().compareTo(thoiGianBatDau) > 0 &&  i.getNgayThue().compareTo(thoiGianKetThuc) <0 ) {
							chiPhi += i.getGiaThue();
						}
					}		
				}
				if(themHopDong.hopDong.hop_dong_theo_thang != null) {
					for( xe_thue_theo_thang i : themHopDong.hopDong.hop_dong_theo_thang ) {
						if( i.getNgayThue().compareTo(thoiGianBatDau) > 0 &&  i.getNgayThue().compareTo(thoiGianKetThuc) <0 ) {
							chiPhi += i.getGiaThue();
						}
						
					}
//						
				}
				JOptionPane.showMessageDialog(null,"Số tiền thu được là: " + chiPhi);
				frame.setVisible(false);
				
			}
			
		});
		btnXemChiPhi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXemChiPhi.setBounds(123, 156, 163, 32);
		frame.getContentPane().add(btnXemChiPhi);
		
		textKetThuc = new JTextField();
		textKetThuc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textKetThuc.setColumns(10);
		textKetThuc.setBounds(236, 98, 190, 36);
		frame.getContentPane().add(textKetThuc);
		
		JLabel lblNewLabel_1 = new JLabel("B\u1EAFt \u0111\u1EA7u");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(29, 61, 122, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("K\u1EBFt th\u00FAc");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(275, 61, 97, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
	}

}
