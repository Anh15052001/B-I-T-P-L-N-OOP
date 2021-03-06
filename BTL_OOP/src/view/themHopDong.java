package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controllers.hop_dong_controller;
import controllers.xe_controller;
import models.hop_dong;
import models.xe;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class themHopDong {

	private JFrame frame;
	private JTextField textTenNguoiChoThue;
	private JLabel lblNewLabel_1;
	private JTextField textCanCuocCongDan;
	private JTextField textMaHopDong;
	private JTextField textNguoiChoThue;
	private JTextField textThoiGian;
	private JLabel lblCnCcCng;
	private JLabel lblLoiXe;
	private JLabel lblMHpng;
	private JLabel lblTnNgiCho;
	private JLabel lblSNgyThng;
	private JButton btnThemHopDong;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static List<xe> data = xe_controller.createData();
	public static hop_dong_controller hopDong = new hop_dong_controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					themHopDong window = new themHopDong();
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
	public themHopDong() {
		initialize();
		frame.setVisible(true);
		showComboData();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private javax.swing.JComboBox<String> comboBoxLoaiXe;
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.setBounds(100, 100, 499, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textTenNguoiChoThue = new JTextField();
		textTenNguoiChoThue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textTenNguoiChoThue.setBounds(194, 70, 246, 30);
		frame.getContentPane().add(textTenNguoiChoThue);
		textTenNguoiChoThue.setColumns(10);

		JLabel lblNewLabel = new JLabel("T\u00EAn ng\u01B0\u1EDDi thu\u00EA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 72, 130, 27);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Th\u00EAm h\u1EE3p \u0111\u1ED3ng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(157, 19, 165, 40);
		frame.getContentPane().add(lblNewLabel_1);

		textCanCuocCongDan = new JTextField();
		textCanCuocCongDan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textCanCuocCongDan.setBounds(194, 111, 246, 30);
		frame.getContentPane().add(textCanCuocCongDan);
		textCanCuocCongDan.setColumns(10);

		textMaHopDong = new JTextField();
		textMaHopDong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMaHopDong.setColumns(10);
		textMaHopDong.setBounds(194, 193, 246, 30);
		frame.getContentPane().add(textMaHopDong);

		textNguoiChoThue = new JTextField();
		textNguoiChoThue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNguoiChoThue.setColumns(10);
		textNguoiChoThue.setBounds(194, 234, 246, 30);
		frame.getContentPane().add(textNguoiChoThue);

		textThoiGian = new JTextField();
		textThoiGian.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textThoiGian.setColumns(10);
		textThoiGian.setBounds(194, 279, 246, 30);
		frame.getContentPane().add(textThoiGian);

		lblCnCcCng = new JLabel("C\u0103n C\u01B0\u1EDBc C\u00F4ng D\u00E2n");
		lblCnCcCng.setForeground(new Color(255, 255, 255));
		lblCnCcCng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCnCcCng.setBounds(32, 111, 152, 27);
		frame.getContentPane().add(lblCnCcCng);

		lblLoiXe = new JLabel("Lo\u1EA1i xe");
		lblLoiXe.setForeground(new Color(255, 255, 255));
		lblLoiXe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLoiXe.setBounds(32, 152, 130, 27);
		frame.getContentPane().add(lblLoiXe);

		lblMHpng = new JLabel("M\u00E3 h\u1EE3p \u0111\u1ED3ng");
		lblMHpng.setForeground(new Color(255, 255, 255));
		lblMHpng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMHpng.setBounds(32, 193, 130, 27);
		frame.getContentPane().add(lblMHpng);

		lblTnNgiCho = new JLabel("T\u00EAn ng\u01B0\u1EDDi cho thu\u00EA");
		lblTnNgiCho.setForeground(new Color(255, 255, 255));
		lblTnNgiCho.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTnNgiCho.setBounds(32, 234, 152, 27);
		frame.getContentPane().add(lblTnNgiCho);

		lblSNgyThng = new JLabel("S\u1ED1 ng\u00E0y/ th\u00E1ng thu\u00EA");
		lblSNgyThng.setForeground(new Color(255, 255, 255));
		lblSNgyThng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSNgyThng.setBounds(32, 279, 152, 27);
		frame.getContentPane().add(lblSNgyThng);

		JRadioButton radioTheoNgay = new JRadioButton("Thu\u00EA theo ng\u00E0y");
		buttonGroup.add(radioTheoNgay);
		radioTheoNgay.setSelected(true);
		radioTheoNgay.setFont(new Font("Tahoma", Font.BOLD, 16));
		radioTheoNgay.setBounds(37, 326, 165, 40);
		frame.getContentPane().add(radioTheoNgay);

		JRadioButton radioTheoThang = new JRadioButton("Thu\u00EA theo th\u00E1ng");
		buttonGroup.add(radioTheoThang);
		radioTheoThang.setFont(new Font("Tahoma", Font.BOLD, 16));
		radioTheoThang.setBounds(279, 326, 165, 40);
		frame.getContentPane().add(radioTheoThang);
		
		comboBoxLoaiXe = new JComboBox();
//		comboBoxLoaiXe.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int index= comboBoxLoaiXe.getSelectedIndex();
//				if(index > 0) {
//					String selectedValue = comboBoxLoaiXe.getItemAt(index);
//				}
//			}
//		});
		comboBoxLoaiXe.setMaximumRowCount(20);
		comboBoxLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxLoaiXe.setBounds(194, 152, 246, 30);
		frame.getContentPane().add(comboBoxLoaiXe);
		
		
		btnThemHopDong = new JButton("Th\u00EAm h\u1EE3p \u0111\u1ED3ng");
		btnThemHopDong.setBackground(new Color(0, 255, 0));
		btnThemHopDong.setForeground(new Color(255, 255, 255));
		btnThemHopDong.addMouseListener(new MouseAdapter() {
			// n??t ????? th??m h???p ?????ng v??o danh s??ch
			@Override
			public void mouseClicked(MouseEvent e) {
				// l???y d??? li???u ???? ???????c nh???p
				String thoiGian = textThoiGian.getText();
				String maHopDong = textMaHopDong.getText();
				String tenNguoiThue = textTenNguoiChoThue.getText();
				String canCuocCongDan = textCanCuocCongDan.getText();
				String nguoiChoThue = textNguoiChoThue.getText();
				// get data from comboBox
				int index = comboBoxLoaiXe.getSelectedIndex();
				// ki???m tra ??i???u ki???n d??? li???u
				if(index <= 0 || maHopDong.isEmpty() || thoiGian.isEmpty() || tenNguoiThue.isEmpty() || canCuocCongDan.isEmpty() || nguoiChoThue.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"???? c?? l???i x???y ra!");
				}
				else {
					int t=0;
					try {
			    		t = Integer.valueOf(thoiGian);
					} catch (Exception e1) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null,"???? c?? l???i x???y ra!");
					}
					String loaiXe = (String)comboBoxLoaiXe.getItemAt(index);
//					String loaiXe = textLoaiXeThue.getText();
					index = Integer.valueOf(loaiXe.split(" ")[0]);
					if (radioTheoNgay.isSelected()) {
//						System.out.println(loaiXe);
						hopDong.themHopDong(1, maHopDong, tenNguoiThue, canCuocCongDan, data.get(index), "1",nguoiChoThue, thoiGian);
					
						data.get(index).setTrangThai("1");
						
					} else
					{
						hopDong.themHopDong(2, maHopDong, tenNguoiThue, canCuocCongDan, data.get(index)	, "1",nguoiChoThue, thoiGian);
						
						data.get(index).setTrangThai("1");
					}
				}
				JOptionPane.showMessageDialog(null,"Th??m h???p ?????ng th??nh c??ng!");
				frame.setVisible(false);
				Menu.displayMenu();

			}
		});
		btnThemHopDong.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnThemHopDong.setBounds(171, 380, 183, 40);
		frame.getContentPane().add(btnThemHopDong);

	}
	

	private void showComboData() {
		// TODO Auto-generated method stub
		comboBoxLoaiXe.addItem("-----------------------------");
		for(int i=0; i<data.size() ; i++ ) {
			if(data.get(i).getTrangThai() == "0")
			comboBoxLoaiXe.addItem( String.valueOf(i) + ' '+ data.get(i).getTenxe() + ' ' + data.get(i).getBiensoxe());	
		}
	}

}
