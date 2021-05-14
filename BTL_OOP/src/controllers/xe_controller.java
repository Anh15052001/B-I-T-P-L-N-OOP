package controllers;
import java.util.ArrayList;
import java.util.List;
import models.xe;

public class xe_controller {
	public static List<xe> duLieuXe = new ArrayList<>();
	   public static List<xe> createData(){
		xe x1 = new xe("Honda","18-MD 22021", "123ases","qwqw1");
		duLieuXe.add(x1);
		xe x2 = new xe("Yamaha","29-MD 22021", "1asdfdf","1234");
		duLieuXe.add(x2);
		xe x3 = new xe("air blade","19-MD 22021", "s21e","as");
		duLieuXe.add(x3);
		xe x4 = new xe("rollroyce","20-MD 22021", "12","sdfs");
		duLieuXe.add(x4);
		return duLieuXe;
	}
}
