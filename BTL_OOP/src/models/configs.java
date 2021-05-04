package models;
//lớp Configs là lớp lưu trữ các thuộc tính hằng như giá thuê trong 1 ngày, giá thuê trong 1 tháng, phí bổ sinh
public class configs{
    //khi người dùng bấm 1 nghĩa là chọn thuê xe theo ngày
    public static final int MA_THUE_XE_THEO_NGAY=1;
    //khi người dùng bấm 2 là chọn thuê xe theo tháng
    public static final int MA_THUE_XE_THEO_THANG=2;
    //giá thuê 1 ngày cố định là 150000
    public static final long GIA_THUE_TRONG_1_NGAY=150000;
    public static final long GIA_THUE_TRONG_1_THANG=3000000;
    public static final long PHI_BO_SUNG=1000000;
}
