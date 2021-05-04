package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Dimension;

public class main_ui extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_ui frame = new main_ui();
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
	public main_ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu QL_Bai_Xe = new JMenu("Qu\u1EA3n L\u00ED B\u00E3i Xe");
		QL_Bai_Xe.setBackground(Color.WHITE);
		menuBar.add(QL_Bai_Xe);
		
		JMenuItem findHopDongByName = new JMenuItem("T\u00ECm Ki\u1EBFm H\u1EE3p \u0110\u1ED3ng Theo T\u00EAn Ch\u1EE7 Thu\u00EA");
		findHopDongByName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		QL_Bai_Xe.add(findHopDongByName);
		
		JMenuItem findHopDongByBienXe = new JMenuItem("T\u00ECm Ki\u1EBFm H\u1EE3p \u0110\u1ED3ng Theo Bi\u1EC3n S\u1ED1 Xe");
		findHopDongByBienXe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		QL_Bai_Xe.add(findHopDongByBienXe);
		
		JMenuItem findHopDongBiggerNum = new JMenuItem("T\u00ECm Ki\u1EBFm H\u1EE3p \u0110\u1ED3ng C\u00F3 Gi\u00E1 Tr\u1ECB L\u1EDBn H\u01A1n 1 S\u1ED1");
		QL_Bai_Xe.add(findHopDongBiggerNum);
		
		JMenuItem findHopDongByDate = new JMenuItem("T\u00ECm Ki\u1EBFm H\u1EE3p \u0110\u1ED3ng Theo Th\u1EDDi Gian ");
		QL_Bai_Xe.add(findHopDongByDate);
		
		JMenu chucNangHopDong = new JMenu("Ch\u1EE9c N\u0103ng Thu\u00EA Xe");
		QL_Bai_Xe.add(chucNangHopDong);
		
		JMenuItem addHopDong = new JMenuItem("Th\u00EAm H\u1EE3p \u0110\u1ED3ng M\u1EDBi");
		addHopDong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		chucNangHopDong.add(addHopDong);
		
		JMenuItem editHopDong = new JMenuItem("S\u1EEDa H\u1EE3p \u0110\u1ED3ng");
		chucNangHopDong.add(editHopDong);
		
		JMenuItem delHopDong = new JMenuItem("X\u00F3a H\u1EE3p \u0110\u1ED3ng");
		chucNangHopDong.add(delHopDong);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
