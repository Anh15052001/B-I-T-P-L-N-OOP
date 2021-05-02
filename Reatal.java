import jdk.swing.interop.SwingInterOpUtils;

import java.net.PortUnreachableException;
import java.sql.SQLOutput;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
//import com.mycompany.DTO.TaiKhoan;
//import com.mycompany.BUL.BULTaiKhoan;
import java.util.List;

//lớp Configs là lớp lưu trữ các thuộc tính hằng như giá thuê trong 1 ngày, giá thuê trong 1 tháng, phí bổ sinh
class Configs{
    //khi người dùng bấm 1 nghĩa là chọn thuê xe theo ngày
    public static final int MA_THUE_XE_THEO_NGAY=1;
    //khi người dùng bấm 2 là chọn thuê xe theo tháng
    public static final int MA_THUE_XE_THEO_THANG=2;
    //giá thuê 1 ngày cố định là 150000
    public static final long GIA_THUE_TRONG_1_NGAY=150000;
    public static final long GIA_THUE_TRONG_1_THANG=3000000;
    public static final long PHI_BO_SUNG=1000000;
}


//lớp hợp đồng là lớp abstract do có 1 phương thức abstract
abstract class Hopdong{
    //các thuộc tính của lớp hợp đồng
    private String Mahopdong;
    private String Tennguoithue;
    private long Cancuoccongdan;
    private String Loaixethue;
    private String Trangthai;
    private String nguoichothue;
    //hàm khởi tạo cho hợp đồng
    public Hopdong(){}
    public Hopdong(String Mahopdong, String Tennguoithue, long Cancuoccongdan, String Loaixethue, String Trangthai, String nguoichothue)
    {
        this.Mahopdong=Mahopdong;
        this.Tennguoithue=Tennguoithue;
        this.Cancuoccongdan=Cancuoccongdan;
        this.Loaixethue=Loaixethue;
        this.Trangthai=Trangthai;
        this.nguoichothue=nguoichothue;
    }

    //các phương thức get, set
    //các phương thức get, set cho mã hợp đồng
    public String getMahopdong()
    {
        return Mahopdong;
    }
    public void setMahopdong(String mahopdong)
    {
        this.Mahopdong=Mahopdong;
    }
    //phương thức get, set cho tên người thuê
    public String getTennguoithue()
    {
        return Tennguoithue;
    }
    public void setTennguoithue(String Tennguoithue)
    {
        this.Tennguoithue=Tennguoithue;
    }
    //phương thức get, set cho căn cước công dân
    public long getCancuoccongdan()
    {
        return Cancuoccongdan;
    }
    public void setCancuoccongdan(long Cancuoccongdan)
    {
        this.Cancuoccongdan=Cancuoccongdan;
    }
    //phương thức get, set cho loại xe thuê
    public String getLoaixethue()
    {
        return Loaixethue;
    }
    public void setLoaixethue(String Loaixethue)
    {
        this.Loaixethue=Loaixethue;
    }
    //phương thức get, set cho trạng thái
    public String getTrangthai()
    {
        return Trangthai;
    }
    public void setTrangthai(String Trangthai)
    {
        this.Trangthai=Trangthai;
    }
    //phương thức get, set cho người cho thuê
    public String getNguoichothue()
    {
        return nguoichothue;
    }
    public void setNguoichothue(String nguoichothue)
    {
        this.nguoichothue=nguoichothue;
    }
    //phương thức giá thuê là phương thức trừu tượng tùy thuộc vào thuê theo ngày hay thuê theo tháng
    public abstract long Giathue();
    //chi phí phát sinh nghĩa là có thể khách hàng sẽ trả xe muộn xe chậm hợp đồng
    //hoặc xe gặp một số sự cố gì đó




    //hợp đồng mang tính chất chung chung cho việc nhập xuất các thông tin
    //cho cả xe thuê theo ngày và thuê theo tháng
    //ta sẽ xây dựng phương thức xuất thông tin chung để lớp con có thể
    //kế thừa phương thức này và tái sử dụng mã nguồn
    public void Output()
    {
        System.out.println("=====HỢP ĐỒNG=====");
        System.out.println("---MÃ HỢP ĐỒNG: "+getMahopdong());
        System.out.println("---TÊN NGƯỜI THUÊ: "+getTennguoithue());
        System.out.println("---CĂN CƯỚC CÔNG DÂN: "+getCancuoccongdan());
        System.out.println("---LOẠI XE THUÊ: "+getLoaixethue());
        System.out.println("---TRẠNG THÁI: "+getTrangthai());
        System.out.println("---NGƯỜI CHO THUÊ: "+getNguoichothue());
    }

}
class Baixe{
    private String tenbaixe;
    private String diachi;
    private int Tongsoxequanli;
    private String mabaixe;
    //hàm khởi tạo
    public Baixe(){}
    public Baixe(String tenbaixe, String diachi, int Tongsoxequanli, String mabaixe)
    {
        this.tenbaixe=tenbaixe;
        this.diachi=diachi;
        this.Tongsoxequanli=Tongsoxequanli;
        this.mabaixe=mabaixe;
    }

    //các phương thức get, set thể hiện tính đóng gói
    //phương thức get, set cho tên bãi xe

    public String getTenbaixe()
    {
        return tenbaixe;
    }
    public void setTenbaixe(String tenbaixe)
    {
        this.tenbaixe=tenbaixe;
    }
    //các phương thức get, set cho địa chỉ
    public String getDiachi()
    {
        return diachi;
    }
    public void setDiachi(String diachi)
    {
        this.diachi=diachi;
    }
    //phương thức get, set cho tổng số xe được quản lí
    public int getTongsoxequanli()
    {
        return Tongsoxequanli;
    }
    public void setTongsoxequanli(int Tongsoxequanli)
    {
        this.Tongsoxequanli=Tongsoxequanli;
    }
    //phương thức get, set cho người trông xe

    //phương thức get,set cho mã bãi xe
    public String getMabaixe()
    {
        return mabaixe;
    }
    public void setMabaixe(String mabaixe)
    {
        this.mabaixe=mabaixe;
    }
    //phương thức cho chi phí đã thu được
    public long Chiphithuduoc()
    {
        return 0;
    }
    //hàm nhập các thông tin cho bãi xe
    Scanner sc =new Scanner(System.in);
    public void Input()
    {
        System.out.println("Nhập tên bãi xe: ");
        setTenbaixe(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        setDiachi(sc.nextLine());
        System.out.println("Tổng số xe được quản lí: ");
        setTongsoxequanli(Integer.parseInt(sc.nextLine()));
        System.out.println("Mã bãi xe: ");
        setTenbaixe(sc.nextLine());
    }
    //phương thức xuất các thông tin của bãi xe
    public void Out()
    {
        System.out.println("!==!==!~CHÀO MỪNG BẠN ĐẾN VỚI CỬA HÀNG CHO THUÊ XE MÁY DU LICH~!==!==!");
        System.out.println("~~~~TÊN BÃI XE: "+getTenbaixe()+"~~~~");
        System.out.println("~~~~ĐỊA CHỈ: "+getDiachi()+"~~~~");
        System.out.println("~~~~MÃ BÃI XE: "+getMabaixe());

    }
    //phương thức xuất các thông tin về chi phí th
}
class Thuexemaytheongay extends Hopdong{
    //thuộc tính riêng
    private int Songaythue;
    //hàm khởi tạo thuê xe máy theo ngày
    public Thuexemaytheongay(String Mahopdong, String Tennguoithue, long Cancuoccongdan, String Loaixethue, String Trangthai,
                             String nguoichothue ,int Songaythue)
    {
        super(Mahopdong, Tennguoithue, Cancuoccongdan, Loaixethue, Trangthai, nguoichothue);
        this.Songaythue=Songaythue;
    }
    //các phương thức get, set
    public int getSongaythue()
    {
        return Songaythue;
    }
    public void setSongaythue(int Songaythue)
    {
        this.Songaythue=Songaythue;
    }
    //phương thức giá thuê ở lớp thuê xe theo ngày sẽ làm rõ hơn giá thuê ở hợp đồng
    @Override
    public long Giathue() {
        return Configs.GIA_THUE_TRONG_1_NGAY*(long)Songaythue;
    }




    //phương thức xuất các thông tin bổ sung cho thuê xe máy theo ngày
    public void Output1(){
        System.out.println("---SỐ NGÀY THUÊ: "+getSongaythue());
        System.out.println("---GÍA THUÊ "+ Giathue());

    }
}
class Thuexemaytheothang extends Hopdong{
    //thuộc tính riêng
    private int Sothangthue;
    //hàm khởi tạo
    public Thuexemaytheothang(String Mahopdong, String Tennguoithue, long Cancuoccongdan, String Loaixethue, String Trangthai,
                              String nguoichothue, int Sothangthue)
    {
        super(Mahopdong, Tennguoithue, Cancuoccongdan, Loaixethue, Trangthai, nguoichothue);
        this.Sothangthue=Sothangthue;
    }
    //các phương thức get, set
    public int getSothangthue()
    {
        return Sothangthue;
    }
    public void setSothangthue(int Sothangthue)
    {
        this.Sothangthue=Sothangthue;
    }
    //phương thức giá thuê ở lớp thuê xe theo tháng sẽ làm rõ hơn giá thuê ở hợp đồng

    @Override
    public long Giathue() {
        return Configs.GIA_THUE_TRONG_1_THANG*(long) Sothangthue;

    }

    //phương thức xuất các thông tin
    public void Output2(){
        System.out.println("---SỐ THÁNG THUÊ: "+getSothangthue());
        System.out.println("---GÍA THUÊ: "+Giathue());

    }
}
//lớp quản lí thông tin các loại xe như tên xe, biển số xe, đăng kí xe
class Xe{
    //các thuộc tính đặc trưng
    private String Tenxe;
    private String Biensoxe;
    private String Dangkixe;
    private String Baohiem;
    //các phương thức get, set
    //phương thức get, set cho tên xe
    public String getTenxe()
    {
        return Tenxe;
    }
    public void setTenxe(String Tenxe)
    {
        this.Tenxe=Tenxe;
    }
    //phương thức get, set cho biển số xe
    public String getBiensoxe()
    {
        return Biensoxe;
    }
    public void setBiensoxe(String Biensoxe)
    {
        this.Biensoxe=Biensoxe;
    }
    //phương thức get, set cho đăng kí xe
    public String getDangkixe()
    {
        return Dangkixe;
    }
    public void setDangkixe(String Dangkixe)
    {
        this.Dangkixe=Dangkixe;
    }
    //phương thức get, set cho bảo hiểm
    public String getBaohiem()
    {
        return Baohiem;
    }
    public void setBaohiem(String Baohiem)
    {
        this.Baohiem=Baohiem;
    }

}
class DangNhap extends javax.swing.JFrame {

    /** Creates new form DangNhap */
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtUser;
    public DangNhap() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jLabel1.setText("Tên đăng nhập");

        jLabel2.setText("Mật khẩu");

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDangNhap)
                                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(txtMatKhau))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(44, 44, 44))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(btnDangNhap)
                                .addGap(27, 27, 27))
        );

        pack();
    }}// </editor-fold>//GEN-END:initComponents

    /*private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText();
        String pass = new String(txtMatKhau.getPassword());
        String tk=null, mk=null;
        String currUserType = null;
        BULTaiKhoan bul = new BULTaiKhoan();
        List<TaiKhoan> res = bul.getListTaiKhoan();
        for (int i=0; i<res.size(); i++){
            TaiKhoan t = res.get(i);
            if (t.getTenDangNhap().equals(user)){
                tk = t.getTenDangNhap();
                mk = t.getMatKhau();
                currUserType = t.getLoai();
            }
        }
        if (tk == null){
            JOptionPane.showMessageDialog(rootPane, "Tài khoản không tồn tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if (mk.equals(pass)){
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                new MainForm(currUserType, tk).setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnDangNhapActionPerformed

    /**
     * @param args the command line arguments
     */

public class Reatal {
    public static void showmenu() {
        System.out.println("MỜI BẠN CHỌN LOẠI XE CẦN NHẬP");
        System.out.println("Phím 1, CHO THUÊ XE THEO NGÀY");
        System.out.println("Phím 2, CHO THUÊ XE THEO THÁNG");
        System.out.println("Phím khác, THOÁT");
    }

    public static void main(String[] args) {
        //Tạo ra hai mảng động thuê xe theo ngày và thuê xe theo tháng
        ArrayList<Thuexemaytheongay> thuexemaytheongays = new ArrayList<>();
        ArrayList<Thuexemaytheothang> thuexemaytheothangs = new ArrayList<>();
        // Baixe baixe=new Baixe();
        //nhập các thông tin cho bãi xe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số xe hiện tại của cửa hàng: ");
        int n = Integer.parseInt(scanner.nextLine());
        String Mahopdong;
        String Tennguoithue;
        long Cancuoccongdan;
        String Loaixethue;
        String Trangthai;
        String nguoichothue;
        int songaythue;
        int sothangthue;
        //biến sum tổng chi phí thu được của cửa hàng
        long sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào thông tin hợp đồng thứ: " + (i + 1));
            System.out.println("Nhập vào Mã hợp đồng: ");
            Mahopdong = scanner.nextLine();
            System.out.println("Nhập vào tên người thuê: ");
            Tennguoithue = scanner.nextLine();
            System.out.println("Nhập vào căn cước công dân");
            Cancuoccongdan = Long.parseLong(scanner.nextLine());
            System.out.println("Nhập vào Loại xe thuê: ");
            Loaixethue = scanner.nextLine();
            System.out.println("Nhập vào trạng thái: ");
            Trangthai = scanner.nextLine();
            System.out.println("Nhập vào người cho thuê: ");
            nguoichothue = scanner.nextLine();
            showmenu();
            int k;
            k = Integer.parseInt(scanner.nextLine());
            switch (k) {
                case 1:
                    System.out.println("CHO THUÊ XE THEO NGÀY");
                    System.out.println("Nhập số ngày thuê: ");
                    songaythue = Integer.parseInt(scanner.nextLine());
                    Thuexemaytheongay thuengay = new Thuexemaytheongay(Mahopdong, Tennguoithue, Cancuoccongdan,
                            Loaixethue, Trangthai, nguoichothue, songaythue);
                    sum += thuengay.Giathue();
                    thuexemaytheongays.add(thuengay);
                    break;
                case 2:
                    System.out.println("CHO THUÊ XE THEO THÁNG");
                    System.out.println("Nhập số tháng thuê: ");
                    sothangthue = Integer.parseInt(scanner.nextLine());
                    Thuexemaytheothang thuethang = new Thuexemaytheothang(Mahopdong, Tennguoithue, Cancuoccongdan,
                            Loaixethue, Trangthai, nguoichothue, sothangthue);
                    sum += thuethang.Giathue();
                    thuexemaytheothangs.add(thuethang);

                    break;
                default:
                    break;

            }
            System.out.println("Bạn muốn thoát không nhập nữa: ");
            System.out.println("Nhập 0, YES");
            int m = Integer.parseInt(scanner.nextLine());
            if (m == 0) {
                break;
            }


        }

        for (Thuexemaytheongay i : thuexemaytheongays) {
            i.Output();
            i.Output1();
        }
        for (Thuexemaytheothang j : thuexemaytheothangs) {
            j.Output();
            j.Output2();
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println("Tổng chi phí thu được của cửa hàng: " + sum);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }
}