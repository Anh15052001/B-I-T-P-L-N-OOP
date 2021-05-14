package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.*;
/**
 * @author Thien Phu
 *
 */
public class hop_dong_controller {
	public static List<xe_thue_theo_ngay>  hop_dong_theo_ngay = new ArrayList<>();
	public static List<xe_thue_theo_thang>  hop_dong_theo_thang = new ArrayList<>();
	// add a hop_dong
	public void themHopDong(int ma_thue_xe, String Mahopdong, String Tennguoithue, String Cancuoccongdan, xe Loaixethue, String Trangthai, String nguoichothue,String thoiGian) {
		Date date = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy"); 
		String dateString  = df.format(date);
		if( ma_thue_xe == configs.MA_THUE_XE_THEO_NGAY ) {
	    	
	    	xe_thue_theo_ngay hop_dong_ngay = new xe_thue_theo_ngay(Mahopdong,  Tennguoithue,  Cancuoccongdan,  Loaixethue,  Trangthai, nguoichothue , thoiGian);
	    	int t=0;
	    	try {
	    		t = Integer.valueOf(hop_dong_ngay.getSongaythue());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error into time!");
			}
	    	hop_dong_ngay.setGiaThue(t * configs.GIA_THUE_TRONG_1_NGAY);
	    	hop_dong_ngay.setNgayThue(dateString);
//	    	System.out.println("Thoi Gian " + hop_dong_ngay.getNgayThue());
	    	hop_dong_ngay.setTrangthai("1");
	    	hop_dong_theo_ngay.add(hop_dong_ngay);
	    }
	    else if(ma_thue_xe == configs.MA_THUE_XE_THEO_THANG) {
	    
	    	xe_thue_theo_thang hop_dong_thang = new xe_thue_theo_thang(Mahopdong,  Tennguoithue,  Cancuoccongdan,  Loaixethue,  Trangthai, nguoichothue , thoiGian);
	    	int t=0;
	    	try {
	    		t = Integer.valueOf(hop_dong_thang.getSothangthue());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error into time!");
			}
	    	hop_dong_thang.setGiaThue(t * configs.GIA_THUE_TRONG_1_THANG);
	    	hop_dong_thang.setNgayThue("dateString");
	    	hop_dong_thang.setTrangthai("1");
	    	hop_dong_theo_thang.add(hop_dong_thang);
	    }
	}
	// edit a hop_dong
	public void suaHopDong(int ma_thue_xe, int index, String Mahopdong, String Tennguoithue, String Cancuoccongdan, xe Loaixethue, String Trangthai, String nguoichothue, String Thoigian) {
		if( ma_thue_xe == configs.MA_THUE_XE_THEO_NGAY ) {
			xe_thue_theo_ngay hop_dong = hop_dong_theo_ngay.get(index);
			hop_dong.setMahopdong(Mahopdong);
			hop_dong.setTennguoithue(Tennguoithue);
			hop_dong.setCancuoccongdan(Cancuoccongdan);
			hop_dong.setLoaixethue(Loaixethue);
			hop_dong.setTrangthai(Trangthai);
			hop_dong.setNguoichothue(nguoichothue);
			hop_dong.setSongaythue(Thoigian);
			hop_dong.setGiaThue(Integer.valueOf(hop_dong.getSongaythue()) * configs.GIA_THUE_TRONG_1_NGAY);
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
			hop_dong.setGiaThue(Integer.valueOf(hop_dong.getSothangthue()) * configs.GIA_THUE_TRONG_1_THANG);
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
		List<xe_thue_theo_thang> temp = new ArrayList<>();
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) 
			if( i.getTennguoithue().equals(tenChuXe)  ) {
				temp.add(i);
		}
		return temp;		
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoBienXe(String bienSoXe)  {
		List<xe_thue_theo_thang> temp = new ArrayList<>();
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if(i.getLoaixethue().getBiensoxe().equals(bienSoXe) ) {
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoTen(String tenChuXe) {
		List<xe_thue_theo_ngay> temp = new ArrayList<>();
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
				if( i.getTennguoithue().equals(tenChuXe)  ) {
					temp.add(i);
		}
			
		}
		return temp;		
	}
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoBienXe(String bienSoXe)  {
		List<xe_thue_theo_ngay> temp = new ArrayList<>();
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			if(i.getLoaixethue().getBiensoxe().equals(bienSoXe) ) {
				temp.add(i);
			}
		}
		return temp;
	}
	
	// find a hop_dong theo gia
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoGia(long x) {
		List<xe_thue_theo_ngay> temp = new ArrayList<>();
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			if( i.getGiaThue() > x) {
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoGia(long x) {
		List<xe_thue_theo_thang> temp = new ArrayList<>();
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if( i.getGiaThue() > x) {
				temp.add(i);
			}
		}
		return temp;
	}
	
	// find a hop_dong theo time
	public List<xe_thue_theo_ngay> timKiemHopDongNgayTheoLoaiXe(int index) {
		List<xe_thue_theo_ngay> temp = new ArrayList<>();
		for( xe_thue_theo_ngay i : hop_dong_theo_ngay ) {
			
			if( i.getLoaixethue().equals(view.themHopDong.data.get(index)) == true) {
				
				temp.add(i);
			}
		}
		return temp;
	}
	public List<xe_thue_theo_thang> timKiemHopDongThangTheoLoaiXe(int index) {
		List<xe_thue_theo_thang> temp = new ArrayList<>();
		for( xe_thue_theo_thang i : hop_dong_theo_thang ) {
			if( i.getLoaixethue().equals(view.themHopDong.data.get(index)) == true) {
				
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
