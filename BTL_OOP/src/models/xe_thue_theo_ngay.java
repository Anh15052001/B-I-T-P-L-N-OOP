package models;

public class xe_thue_theo_ngay extends hop_dong{
    //thuộc tính riêng
    private int Songaythue;
    //hàm khởi tạo thuê xe máy theo ngày
    public xe_thue_theo_ngay(String Mahopdong, String Tennguoithue, long Cancuoccongdan, xe Loaixethue, String Trangthai,
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
   
}