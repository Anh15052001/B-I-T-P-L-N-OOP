package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;

import models.xe_thue_theo_ngay;
import models.xe_thue_theo_thang;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.hop_dong_controller;

public class sua_xoaHopDong {

	private JFrame frame;
	private JTextField textMaHopDong;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textTenNguoiThue;
	private JTextField textCanCuocCongDan;
	private JTextField textTenNguoiChoThue;
	private JTextField textThoiGian;
	JPanel panelThongTinHopDong = new JPanel();;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sua_xoaHopDong window = new sua_xoaHopDong();
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
	public sua_xoaHopDong() {
		initialize();
		frame.setVisible(true);
		panelThongTinHopDong.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private boolean isContinute() {
		int n = JOptionPane.showConfirmDialog(panelThongTinHopDong, "Bạn có muốn xem thông tin sau khi sửa không ?", "Alert",
				JOptionPane.YES_NO_OPTION);
		return n == JOptionPane.YES_OPTION;

	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tìm hợp đồng theo mã");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(77, 21, 236, 39);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E3 h\u1EE3p \u0111\u1ED3ng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(66, 87, 112, 29);
		frame.getContentPane().add(lblNewLabel_1);

		textMaHopDong = new JTextField();
		textMaHopDong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMaHopDong.setBounds(204, 87, 155, 29);
		frame.getContentPane().add(textMaHopDong);
		textMaHopDong.setColumns(10);

		JRadioButton radioTheoNgay = new JRadioButton("Theo ngày");
		buttonGroup.add(radioTheoNgay);
		radioTheoNgay.setSelected(true);
		radioTheoNgay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioTheoNgay.setBounds(66, 140, 155, 23);
		frame.getContentPane().add(radioTheoNgay);

		JRadioButton radioTheoThang = new JRadioButton("Theo tháng");
		buttonGroup.add(radioTheoThang);
		radioTheoThang.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioTheoThang.setBounds(248, 140, 155, 23);
		frame.getContentPane().add(radioTheoThang);

		JLabel lblLoaiXe = new JLabel("Loại xe");
		lblLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLoaiXe.setBounds(213, 170, 229, 29);
		panelThongTinHopDong.add(lblLoaiXe);

		JButton btnTimKiemHopDong = new JButton("T\u00ECm ki\u1EBFm");
		btnTimKiemHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String maHopDong = textMaHopDong.getText();
				boolean check = false;
				if (!maHopDong.isEmpty()) {
					if (radioTheoNgay.isSelected()) {
						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_ngay.size(); i++) {

							if (themHopDong.hopDong.hop_dong_theo_ngay.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								
								textTenNguoiThue
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getTennguoithue());
								textCanCuocCongDan
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getCancuoccongdan());
								textTenNguoiChoThue
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getNguoichothue());
								textThoiGian.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getSongaythue());
								lblLoaiXe.setText(String.valueOf(i) + " "
										+ themHopDong.hopDong.hop_dong_theo_ngay.get(i).getLoaixethue().getTenxe() + " "
										+ themHopDong.hopDong.hop_dong_theo_ngay.get(i).getLoaixethue().getBiensoxe());
								check=true;
								panelThongTinHopDong.setVisible(true);
								
								break;
							}
						}
						if(check == false) {
							panelThongTinHopDong.setVisible(false);
							JOptionPane.showMessageDialog(null,"Đã có lỗi xảy ra!");
						}
						
					} else {
						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_thang.size(); i++) {
							if (themHopDong.hopDong.hop_dong_theo_thang.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								
								textTenNguoiThue
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getTennguoithue());
								textCanCuocCongDan
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getCancuoccongdan());
								textTenNguoiChoThue
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getNguoichothue());
								textThoiGian.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getSothangthue());
								lblLoaiXe.setText(String.valueOf(i) + " "
										+ themHopDong.hopDong.hop_dong_theo_thang.get(i).getLoaixethue().getTenxe()
										+ " "
										+ themHopDong.hopDong.hop_dong_theo_thang.get(i).getLoaixethue().getBiensoxe());
								check=true;
								panelThongTinHopDong.setVisible(true);
								
								break;
							}
						}
						if(check == false) {
							panelThongTinHopDong.setVisible(false);
							JOptionPane.showMessageDialog(null,"Đã có lỗi xảy ra!");
						}
						
					}
				} else {
					panelThongTinHopDong.setVisible(false);
					JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra!");
				}

			}
		});
		btnTimKiemHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemHopDong.setBounds(147, 181, 124, 39);
		frame.getContentPane().add(btnTimKiemHopDong);

		panelThongTinHopDong.setBounds(409, 21, 452, 379);
		frame.getContentPane().add(panelThongTinHopDong);
		panelThongTinHopDong.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("Tên người thuê");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(44, 84, 135, 33);
		panelThongTinHopDong.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Căn cước công dân");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(44, 128, 152, 30);
		panelThongTinHopDong.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Loại xe\r\n thuê");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(44, 169, 135, 26);
		panelThongTinHopDong.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("Tên người cho thuê");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(44, 216, 163, 31);
		panelThongTinHopDong.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("Số ngày/ tháng thuê");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(44, 258, 152, 33);
		panelThongTinHopDong.add(lblNewLabel_2_5);

		textTenNguoiThue = new JTextField();
		textTenNguoiThue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTenNguoiThue.setBounds(213, 86, 164, 28);
		panelThongTinHopDong.add(textTenNguoiThue);
		textTenNguoiThue.setColumns(10);

		textCanCuocCongDan = new JTextField();
		textCanCuocCongDan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCanCuocCongDan.setColumns(10);
		textCanCuocCongDan.setBounds(213, 129, 164, 28);
		panelThongTinHopDong.add(textCanCuocCongDan);

		textTenNguoiChoThue = new JTextField();
		textTenNguoiChoThue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTenNguoiChoThue.setColumns(10);
		textTenNguoiChoThue.setBounds(213, 217, 164, 28);
		panelThongTinHopDong.add(textTenNguoiChoThue);

		textThoiGian = new JTextField();
		textThoiGian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textThoiGian.setColumns(10);
		textThoiGian.setBounds(213, 255, 164, 28);
		panelThongTinHopDong.add(textThoiGian);

		JButton btnSuaHopDong = new JButton("Sửa hợp đồng");
		btnSuaHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String thoiGian = textThoiGian.getText();
				String tenNguoiThue = textTenNguoiThue.getText();
				String canCuocCongDan = textCanCuocCongDan.getText();
				String nguoiChoThue = textTenNguoiChoThue.getText();
				// get data from comboBox

				if ( thoiGian.isEmpty() || tenNguoiThue.isEmpty() || canCuocCongDan.isEmpty()
						|| nguoiChoThue.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra!");
				} else {
					int t = 0;
					try {
						t = Integer.valueOf(thoiGian);
					} catch (Exception e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra!");
					}

					if (radioTheoNgay.isSelected()) {
//						System.out.println(loaiXe);

						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_ngay.size(); i++) {

							if (themHopDong.hopDong.hop_dong_theo_ngay.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								themHopDong.hopDong.hop_dong_theo_ngay.get(i).setTennguoithue(tenNguoiThue);
								themHopDong.hopDong.hop_dong_theo_ngay.get(i).setCancuoccongdan(canCuocCongDan);
								themHopDong.hopDong.hop_dong_theo_ngay.get(i).setNguoichothue(nguoiChoThue);
								themHopDong.hopDong.hop_dong_theo_ngay.get(i).setSongaythue(thoiGian);
								textTenNguoiThue
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getTennguoithue());
								textCanCuocCongDan
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getCancuoccongdan());
								textTenNguoiChoThue
										.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getNguoichothue());
								textThoiGian.setText(themHopDong.hopDong.hop_dong_theo_ngay.get(i).getSongaythue());
								lblLoaiXe.setText(String.valueOf(i) + " "
										+ themHopDong.hopDong.hop_dong_theo_ngay.get(i).getLoaixethue().getTenxe() + " "
										+ themHopDong.hopDong.hop_dong_theo_ngay.get(i).getLoaixethue().getBiensoxe());
							}
							
						}
						if(isContinute() == true)
							panelThongTinHopDong.setVisible(true);
						else {
							frame.setVisible(false);
							panelThongTinHopDong.setVisible(false);
							Menu.displayMenu();
						}
					} else {

						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_thang.size(); i++) {
							if (themHopDong.hopDong.hop_dong_theo_thang.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								themHopDong.hopDong.hop_dong_theo_thang.get(i).setTennguoithue(tenNguoiThue);
								themHopDong.hopDong.hop_dong_theo_thang.get(i).setCancuoccongdan(canCuocCongDan);
								themHopDong.hopDong.hop_dong_theo_thang.get(i).setNguoichothue(nguoiChoThue);
								themHopDong.hopDong.hop_dong_theo_thang.get(i).setSothangthue(thoiGian);
								textTenNguoiThue
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getTennguoithue());
								textCanCuocCongDan
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getCancuoccongdan());
								textTenNguoiChoThue
										.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getNguoichothue());
								textThoiGian.setText(themHopDong.hopDong.hop_dong_theo_thang.get(i).getSothangthue());
								lblLoaiXe.setText(String.valueOf(i) + " "
										+ themHopDong.hopDong.hop_dong_theo_thang.get(i).getLoaixethue().getTenxe()
										+ " "
										+ themHopDong.hopDong.hop_dong_theo_thang.get(i).getLoaixethue().getBiensoxe());
							}
							
						}
						if(isContinute() == true)
							panelThongTinHopDong.setVisible(true);
						else {
							frame.setVisible(false);
							panelThongTinHopDong.setVisible(false);
							Menu.displayMenu();
						}
						
					}
				}
			}
		});
		btnSuaHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSuaHopDong.setBounds(44, 319, 143, 33);
		panelThongTinHopDong.add(btnSuaHopDong);
		
		JLabel lblNewLabel_2 = new JLabel("Thông tin");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(133, 29, 135, 44);
		panelThongTinHopDong.add(lblNewLabel_2);
		
		JButton btnXoaHopDong = new JButton("Xóa hợp đồng");
		btnXoaHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String maHopDong = textMaHopDong.getText();
				boolean check = false;
				if (!maHopDong.isEmpty()) {
					if (radioTheoNgay.isSelected()) {
						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_ngay.size(); i++) {

							if (themHopDong.hopDong.hop_dong_theo_ngay.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								themHopDong.hopDong.xoaHopDong(1,i);
								JOptionPane.showMessageDialog(null,"Đã xóa thành công");
								frame.setVisible(false);
								panelThongTinHopDong.setVisible(false);
								Menu.displayMenu();
								
								break;
							}
						}
												
					} else {
						for (int i = 0; i < themHopDong.hopDong.hop_dong_theo_thang.size(); i++) {
							if (themHopDong.hopDong.hop_dong_theo_thang.get(i).getMahopdong()
									.equals(textMaHopDong.getText())) {
								themHopDong.hopDong.xoaHopDong(2,i);
								JOptionPane.showMessageDialog(null,"Đã xóa thành công");
								frame.setVisible(false);
								panelThongTinHopDong.setVisible(false);
								Menu.displayMenu();
								
								break;
							}
						}
						
						
					}
				} else {
					panelThongTinHopDong.setVisible(false);
					JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra!");
				}

			}
		});
		btnXoaHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXoaHopDong.setBounds(234, 319, 143, 33);
		panelThongTinHopDong.add(btnXoaHopDong);
		
		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Menu.displayMenu();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(147, 231, 122, 39);
		frame.getContentPane().add(btnNewButton);

	}
}
