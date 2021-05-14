package models;

public class xe_thue_theo_thang extends hop_dong{
    //thuộc tính riêng
    private String Sothangthue;
    //hàm khởi tạo
    public xe_thue_theo_thang(String Mahopdong, String Tennguoithue, String Cancuoccongdan, xe Loaixethue, String Trangthai,
                              String nguoichothue, String Sothangthue)
    {
        super(Mahopdong, Tennguoithue, Cancuoccongdan, Loaixethue, Trangthai, nguoichothue);
        this.Sothangthue=Sothangthue;
    }
    //các phương thức get, set
    public String getSothangthue()
    {
        return Sothangthue;
    }
    public void setSothangthue(String Sothangthue)
    {
        this.Sothangthue=Sothangthue;
    }
}
