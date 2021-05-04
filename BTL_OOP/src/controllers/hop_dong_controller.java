package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import models.*;
/**
 * @author Thien Phu
 *
 */
public class hop_dong_controller {
	public List<xe_thue_theo_ngay>  hop_dong_theo_ngay;
	public List<xe_thue_theo_thang>  hop_dong_theo_thang;
	// add a hop_dong
	public void themHopDong(int ma_thue_xe, String Mahopdong, String Tennguoithue, long Cancuoccongdan, xe Loaixethue, String Trangthai, String nguoichothue) {
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
		String dateString  = df.format(date);
		if( ma_thue_xe == configs.MA_THUE_XE_THEO_NGAY ) {
	    	int Songaythue = 0;
	    	xe_thue_theo_ngay hop_dong_ngay = new xe_thue_theo_ngay(Mahopdong,  Tennguoithue,  Cancuoccongdan,  Loaixethue,  Trangthai, nguoichothue , Songaythue);
	    	hop_dong_ngay.setGiaThue(hop_dong_ngay.getSongaythue() * configs.GIA_THUE_TRONG_1_NGAY);
	    	hop_dong_ngay.setNgayThue("dateString");
	    	hop_dong_ngay.setTrangthai("1");
	    	hop_dong_theo_ngay.add(hop_dong_ngay);
	    }
	    else if(ma_thue_xe == configs.MA_THUE_XE_THEO_THANG) {
	    	int Sothangthue = 0;
	    	xe_thue_theo_thang hop_dong_thang = new xe_thue_theo_thang(Mahopdong,  Tennguoithue,  Cancuoccongdan,  Loaixethue,  Trangthai, nguoichothue , Sothangthue);
	    	hop_dong_thang.setGiaThue(hop_dong_thang.getSothangthue() * configs.GIA_THUE_TRONG_1_THANG);
	    	hop_dong_thang.setNgayThue("dateString");
	    	hop_dong_thang.setTrangthai("1");
	    	hop_dong_theo_thang.add(hop_dong_thang);
	    }
	}
	// edit a hop_dong
	public void suaHopDong(int ma_thue_xe, int index, String Mahopdong, String Tennguoithue, long Cancuoccongdan, xe Loaixethue, String Trangthai, String nguoichothue, int Thoigian) {
		if( ma_thue_xe == configs.MA_THUE_XE_THEO_NGAY ) {
			xe_thue_theo_ngay hop_dong = hop_dong_theo_ngay.get(index);
			hop_dong.setMahopdong(Mahopdong);
			hop_dong.setTennguoithue(Tennguoithue);
			hop_dong.setCancuoccongdan(Cancuoccongdan);
			hop_dong.setLoaixethue(Loaixethue);
			hop_dong.setTrangthai(Trangthai);
			hop_dong.setNguoichothue(nguoichothue);
			hop_dong.setSongaythue(Thoigian);
			hop_dong.setGiaThue(hop_dong.getSongaythue() * configs.GIA_THUE_TRONG_1_NGAY);
		}
	    else if(ma_thue_xe == configs.MA_THUE_XE_THEO_THANG) {
	    	xe_thue_theo_thang hop_dong = hop_dong_theo_thang.get(index);
			hop_dong.setMahopdong(Mahopdong);
			hop_dong.setTennguoithue(Tennguoithue);
			hop_dong.setCancuoccongdan(Cancuoccongdan);
			hop_dong.setLoaixethue(Loaixethue);
			hop_dong.setTrangthai(Trangthai);
			hop_dong.setNguoichothue(nguoichothue);
			hop_dong.setSothangthue(Thoigian);
			hop_dong.setGiaThue(hop_dong.getSothangthue() * configs.GIA_THUE_TRONG_1_THANG);
	    }
	}
    // delete a hop_dong
	public void xoaHopDong(int ma_thue_xe, int index) {
		if( ma_thue_xe == configs.MA_THUE_XE_THEO_NGAY ) {
			hop_dong_theo_ngay.get(index).setTrangthai("0");
			hop_dong_theo_ngay.remove(index);
		}
	    else if(ma_thue_xe == configs.MA_THUE_XE_THEO_THANG) {
	    	hop_dong_theo_thang.get(index).setTrangthai("0");
	    	hop_dong_theo_thang.remove(index);
	    }
	}
	// find a hop_dong
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoTen(String tenChuXe) {
		List<xe_thue_theo_thang> temp = null;
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) 
			if( i.getTennguoithue() == tenChuXe  ) {
				temp.add(i);
		}
		return temp;		
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoBienXe(String bienSoXe)  {
		List<xe_thue_theo_thang> temp = null;
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if(i.getLoaixethue().getBiensoxe() == bienSoXe ) {
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoTen(String tenChuXe) {
		List<xe_thue_theo_ngay> temp = null;
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) 
			if( i.getTennguoithue() == tenChuXe  ) {
				temp.add(i);
		}
		return temp;		
	}
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoBienXe(String bienSoXe)  {
		List<xe_thue_theo_ngay> temp = null;
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			if(i.getLoaixethue().getBiensoxe() == bienSoXe ) {
				temp.add(i);
			}
		}
		return temp;
	}
	
	// find a hop_dong theo gia
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoGia(long x) {
		List<xe_thue_theo_ngay> temp = null;
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			if( i.getGiaThue() > x) {
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoGia(long x) {
		List<xe_thue_theo_thang> temp = null;
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if( i.getGiaThue() > x) {
				temp.add(i);
			}
		}
		return temp;
	}
	
	// find a hop_dong theo time
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoThoiGian(String s) {
		List<xe_thue_theo_ngay> temp = null;
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			if( i.getNgayThue().compareTo(s) >0) {
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoThoiGian(String s) {
		List<xe_thue_theo_thang> temp = null;
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if(i.getNgayThue().compareTo(s) >0) {
				temp.add(i);
			}
		}
		return temp;
	}
	
	
	// total chi phi
	public long tongChiPhi() {
		long chiPhi=0;
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
				chiPhi += i.getGiaThue();
		}
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			chiPhi += i.getGiaThue();
		}
		return chiPhi;
	}

}
