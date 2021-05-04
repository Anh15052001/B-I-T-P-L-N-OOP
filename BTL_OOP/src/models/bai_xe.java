package models;

public class bai_xe{
    private String tenbaixe;
    private String diachi;
    private int Tongsoxequanli;
    private String mabaixe;
    //hàm khởi tạo
    public bai_xe(){}
    public bai_xe(String tenbaixe, String diachi, int Tongsoxequanli, String mabaixe)
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
    public long Chiphithuduoc(long x)
    {
        return x;
    }
}
