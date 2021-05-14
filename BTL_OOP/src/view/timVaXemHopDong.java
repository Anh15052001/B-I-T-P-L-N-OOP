package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import java.util.List;
import java.util.Vector;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controllers.hop_dong_controller;
import controllers.xe_controller;
import models.xe;
import models.xe_thue_theo_ngay;
import models.xe_thue_theo_thang;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class timVaXemHopDong {

	private JFrame frame;
	private JTable table;
	private JTextField textTruyVanHopDong;
	JComboBox comboBoxLoaiXe;
    public static	List<xe_thue_theo_ngay> dataNgay ;
	public static 	List<xe_thue_theo_thang> dataThang ;
	DefaultTableModel  models;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timVaXemHopDong window = new timVaXemHopDong();
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
	public timVaXemHopDong() {
		initialize();
		frame.setVisible(true);
		showComboData();
		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.setBounds(100, 100, 1075, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ch\u1EE9c n\u0103ng t\u00ECm ki\u1EBFm");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(64, 11, 221, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnTimKiemLoaiXe = new JButton("T\u00ECm ki\u1EBFm theo lo\u1EA1i xe");
		
		btnTimKiemLoaiXe.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemLoaiXe.setBounds(29, 311, 294, 33);
		frame.getContentPane().add(btnTimKiemLoaiXe);
		
		JLabel lblNewLabel_1 = new JLabel("Th\u00F4ng tin h\u1EE3p \u0111\u1ED3ng");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(637, 11, 205, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPaneDuLieuHopDong = new JScrollPane();
		scrollPaneDuLieuHopDong.setBounds(362, 50, 689, 348);
		frame.getContentPane().add(scrollPaneDuLieuHopDong);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBackground(new Color(0, 191, 255));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.removeAll();
		models = new DefaultTableModel();
		String[] col = {"Mã hợp đồng","Tên người thuê","Căn cước công dân","Loại xe thuê","Người cho thuê","Thời gian"};
		String[] row = new String[6];
		models.setColumnIdentifiers(col);
		table.setModel(models);
		scrollPaneDuLieuHopDong.setViewportView(table);
		
		
		textTruyVanHopDong = new JTextField();
		textTruyVanHopDong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTruyVanHopDong.setBounds(29, 68, 294, 39);
		frame.getContentPane().add(textTruyVanHopDong);
		textTruyVanHopDong.setColumns(10);
		
		JButton btnTimKiemTheoTen = new JButton("T\u00ECm theo t\u00EAn ng\u01B0\u1EDDi thu\u00EA");
		
		btnTimKiemTheoTen.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemTheoTen.setBounds(29, 118, 294, 39);
		frame.getContentPane().add(btnTimKiemTheoTen);
		
		JButton btnTimKiemTheoBienXe = new JButton("T\u00ECm theo bi\u1EC3n xe");
		
		btnTimKiemTheoBienXe.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemTheoBienXe.setBounds(29, 168, 294, 39);
		frame.getContentPane().add(btnTimKiemTheoBienXe);
		
		comboBoxLoaiXe = new JComboBox();
		comboBoxLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLoaiXe.setBounds(141, 268, 182, 32);
		frame.getContentPane().add(comboBoxLoaiXe);
		
		JLabel lblNewLabel_2 = new JLabel("Lo\u1EA1i xe");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(29, 268, 86, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnTimKiemTheoGia = new JButton("T\u00ECm ki\u1EBFm theo gi\u00E1");
		
		btnTimKiemTheoGia.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTimKiemTheoGia.setBounds(29, 218, 294, 39);
		frame.getContentPane().add(btnTimKiemTheoGia);
		
		JButton btnThoat = new JButton("Tho\u00E1t");
		btnThoat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Menu.displayMenu();
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnThoat.setBounds(105, 407, 127, 43);
		frame.getContentPane().add(btnThoat);
		
		JButton btnXemHopDong = new JButton("Xem tất cả hợp đồng");
		
		btnXemHopDong.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnXemHopDong.setBounds(29, 363, 294, 33);
		frame.getContentPane().add(btnXemHopDong);
		
		btnTimKiemLoaiXe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				models.setRowCount(0);
				int index = comboBoxLoaiXe.getSelectedIndex();
				if(index <= 0)
				{
					JOptionPane.showMessageDialog(null,"Đã có lỗi xảy ra!");
				}
				else {
//					System.out.println(index);
					String loaiXe = (String)comboBoxLoaiXe.getItemAt(index);
//					System.out.println(loaiXe);
//					String loaiXe = textLoaiXeThue.getText();
					index = Integer.valueOf(loaiXe.split(" ")[0]);
				
					dataNgay = themHopDong.hopDong.timKiemHopDongNgayTheoLoaiXe(index);
					dataThang = themHopDong.hopDong.timKiemHopDongThangTheoLoaiXe(index);	
					for( xe_thue_theo_ngay i : dataNgay ) {
						System.out.println(i.getMahopdong());
					}
				}
				
				if(dataNgay == null && dataThang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				if(dataNgay != null) {
					for( xe_thue_theo_ngay i : dataNgay ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSongaythue() + " "+"ngày";
						models.addRow(row);
					}		
				}
				if(dataThang != null) {
					check = true;
					for( xe_thue_theo_thang i : dataThang ) {
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSothangthue() + " " + "tháng";
						models.addRow(row);
					}
//					
				}
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào!");
				}
							
//				
				
			}
		});
	
		
		btnTimKiemTheoTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				models.setRowCount(0);
				String tenNguoiThue = textTruyVanHopDong.getText();
				dataNgay = themHopDong.hopDong.timKiemHopDongNgayTheoTen(tenNguoiThue);
				dataThang = themHopDong.hopDong.timKiemHopDongThangTheoTen(tenNguoiThue);
				if(dataNgay == null && dataThang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				if(dataNgay != null) {
					for( xe_thue_theo_ngay i : dataNgay ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSongaythue() + " "+"ngày";
						models.addRow(row);
					}		
				}
				if(dataThang != null) {
					for( xe_thue_theo_thang i : dataThang ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSothangthue() + " " + "tháng";
						models.addRow(row);
					}
//					
				}
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào!");
				}
			}
		});
	
		btnTimKiemTheoBienXe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				models.setRowCount(0);
				String bienXe = textTruyVanHopDong.getText();
				dataNgay = themHopDong.hopDong.timKiemHopDongNgayTheoBienXe(bienXe);
				dataThang = themHopDong.hopDong.timKiemHopDongThangTheoBienXe(bienXe);
				if(dataNgay == null && dataThang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				if(dataNgay != null) {
					for( xe_thue_theo_ngay i : dataNgay ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSongaythue() + " "+"ngày";
						models.addRow(row);
					}		
				}
				if(dataThang != null) {
					for( xe_thue_theo_thang i : dataThang ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSothangthue() + " " + "tháng";
						models.addRow(row);
					}
//					
				}
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào!");
				}
			}
		});
		
		btnTimKiemTheoGia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				models.setRowCount(0);
				long gia = Long.valueOf(textTruyVanHopDong.getText());
				dataNgay = themHopDong.hopDong.timKiemHopDongNgayTheoGia(gia);
				dataThang = themHopDong.hopDong.timKiemHopDongThangTheoGia(gia);
				if(dataNgay == null && dataThang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				if(dataNgay != null) {
					for( xe_thue_theo_ngay i : dataNgay ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSongaythue() + " "+"ngày";
						models.addRow(row);
					}		
				}
				if(dataThang != null) {
					for( xe_thue_theo_thang i : dataThang ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSothangthue() + " " + "tháng";
						models.addRow(row);
					}
//					
				}
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào!");
				}
			}
		
		});
		
		btnXemHopDong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				models.setRowCount(0);
				if(themHopDong.hopDong.hop_dong_theo_ngay == null &&themHopDong.hopDong.hop_dong_theo_thang == null)
				{
				JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào thỏa mãn!");
				}
				System.out.println(themHopDong.hopDong.hop_dong_theo_ngay.size());
				if(themHopDong.hopDong.hop_dong_theo_ngay != null) {
					for( xe_thue_theo_ngay i : themHopDong.hopDong.hop_dong_theo_ngay ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSongaythue() + " "+"ngày";
						models.addRow(row);
					}		
				}
				if(themHopDong.hopDong.hop_dong_theo_thang != null) {
					for( xe_thue_theo_thang i : themHopDong.hopDong.hop_dong_theo_thang ) {
						check = true;
						row[0] = i.getMahopdong();
						row[1] = i.getTennguoithue();
						row[2] = i.getCancuoccongdan();
						row[3] = i.getLoaixethue().getTenxe() + " "+ i.getLoaixethue().getBiensoxe() ;
						row[4] = i.getNguoichothue();
						row[5] = i.getSothangthue() + " " + "tháng";
						models.addRow(row);
					}
//						
				}
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Không tìm thấy hợp đồng nào!");
				}
			}
		
		});
	}

	private void showComboData() {
		// TODO Auto-generated method stub
		comboBoxLoaiXe.addItem("-----------------------");
		for (int i = 0; i < themHopDong.data.size(); i++) {
			comboBoxLoaiXe.addItem(String.valueOf(i) + ' ' + themHopDong.data.get(i).getTenxe() + ' '
					+ themHopDong.data.get(i).getBiensoxe());
		}
	}
}
