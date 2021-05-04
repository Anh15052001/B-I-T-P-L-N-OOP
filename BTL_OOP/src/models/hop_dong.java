package models;
import models.xe;
public abstract class hop_dong{
    //các thuộc tính của lớp hợp đồng
    private String Mahopdong;
    private String Tennguoithue;
    private long Cancuoccongdan;
    private xe Loaixethue;
    private String Trangthai;
    private String nguoichothue;
    private long giaThue=0;
    private String ngayThue;
    public long getGiaThue() {
		return giaThue;
	}
	public void setGiaThue(long giaThue) {
		this.giaThue = giaThue;
	}
	//hàm khởi tạo cho hợp đồng
    public hop_dong(){}
    public hop_dong(String Mahopdong, String Tennguoithue, long Cancuoccongdan, xe Loaixethue, String Trangthai, String nguoichothue)
    {
        this.Mahopdong=Mahopdong;
        this.Tennguoithue=Tennguoithue;
        this.Cancuoccongdan=Cancuoccongdan;
        this.Loaixethue=Loaixethue;
        this.Trangthai=Trangthai;
        this.nguoichothue=nguoichothue;
    }

    //các phương thức get, set
	/**
	 * @return the mahopdong
	 */
	public String getMahopdong() {
		return Mahopdong;
	}
	/**
	 * @param mahopdong the mahopdong to set
	 */
	public void setMahopdong(String mahopdong) {
		Mahopdong = mahopdong;
	}
	/**
	 * @return the tennguoithue
	 */
	public String getTennguoithue() {
		return Tennguoithue;
	}
	/**
	 * @param tennguoithue the tennguoithue to set
	 */
	public void setTennguoithue(String tennguoithue) {
		Tennguoithue = tennguoithue;
	}
	/**
	 * @return the cancuoccongdan
	 */
	public long getCancuoccongdan() {
		return Cancuoccongdan;
	}
	/**
	 * @param cancuoccongdan the cancuoccongdan to set
	 */
	public void setCancuoccongdan(long cancuoccongdan) {
		Cancuoccongdan = cancuoccongdan;
	}
	/**
	 * @return the loaixethue
	 */
	public xe getLoaixethue() {
		return Loaixethue;
	}
	/**
	 * @param loaixethue the loaixethue to set
	 */
	public void setLoaixethue(xe loaixethue) {
		Loaixethue = loaixethue;
	}
	/**
	 * @return the trangthai
	 */
	public String getTrangthai() {
		return Trangthai;
	}
	/**
	 * @param trangthai the trangthai to set
	 */
	public void setTrangthai(String trangthai) {
		Trangthai = trangthai;
	}
	/**
	 * @return the nguoichothue
	 */
	public String getNguoichothue() {
		return nguoichothue;
	}
	/**
	 * @param nguoichothue the nguoichothue to set
	 */
	public void setNguoichothue(String nguoichothue) {
		this.nguoichothue = nguoichothue;
	}
	/**
	 * @return the ngayThue
	 */
	public String getNgayThue() {
		return this.ngayThue;
	}
	/**
	 * @param ngayThue the ngayThue to set
	 */
	public void setNgayThue(String ngayThue) {
		this.ngayThue = ngayThue;
	} 
}