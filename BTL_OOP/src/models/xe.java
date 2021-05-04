package models;

//lớp quản lí thông tin các loại xe như tên xe, biển số xe, đăng kí xe
public class xe{
  //các thuộc tính đặc trưng
  private String Tenxe;
  private String Biensoxe;
  private String Dangkixe;
  private String Baohiem;
  // 0 tức là xe chưa được thuê, 1 là xe đã được thuê. còn có các trạng thái khác
  private String trangThai;
  
  public xe() {};
  public xe(String tenXe, String bienSoXe, String dangKiXe, String baoHiem) {
	  this.Tenxe = tenXe;
	  this.Biensoxe = bienSoXe;
	  this.Dangkixe = dangKiXe;
	  this.Baohiem = baoHiem;
	  this.trangThai = "0";
  }
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
/**
 * @return the trangThai
 */
public String getTrangThai() {
	return trangThai;
}
/**
 * @param trangThai the trangThai to set
 */
public void setTrangThai(String trangThai) {
	this.trangThai = trangThai;
}
}