package models;

public class xe_thue_theo_thang extends hop_dong{
    //thuộc tính riêng
    private int Sothangthue;
    //hàm khởi tạo
    public xe_thue_theo_thang(String Mahopdong, String Tennguoithue, long Cancuoccongdan, xe Loaixethue, String Trangthai,
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
}
