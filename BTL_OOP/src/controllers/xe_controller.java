package controllers;
import java.util.List;
import models.xe;

public class xe_controller {
	List<xe> taoDuLieuXe(String tenXe, String bienSoXe, String dangKiXe, String baoHiem){
		List<xe> tmp=null;
		xe x1 = new xe("Honda","18-MD 22021", "123ases","qwqw1");
		tmp.add(x1);
		xe x2 = new xe("Yamaha","29-MD 22021", "1asdfdf","1234");
		tmp.add(x2);
		xe x3 = new xe("air blade","19-MD 22021", "s21e","as");
		tmp.add(x3);
		xe x4 = new xe("rollroyce","20-MD 22021", "12","sdfs");
		tmp.add(x4);
		return tmp;
	}
}
