package models;

public class xe_thue_theo_ngay extends hop_dong{
    //thuộc tính riêng
    private String Songaythue;
    //hàm khởi tạo thuê xe máy theo ngày
    public xe_thue_theo_ngay(String Mahopdong, String Tennguoithue, String Cancuoccongdan, xe Loaixethue, String Trangthai,
                             String nguoichothue ,String Songaythue)
    {
        super(Mahopdong, Tennguoithue, Cancuoccongdan, Loaixethue, Trangthai, nguoichothue);
        this.Songaythue=Songaythue;
    }
    //các phương thức get, set
    public String getSongaythue()
    {
        return Songaythue;
    }
    public void setSongaythue(String Songaythue)
    {
        this.Songaythue=Songaythue;
    }
   
}