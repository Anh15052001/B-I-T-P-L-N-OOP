package controllers;
import java.util.ArrayList;
import java.util.List;
import models.xe;

public class xe_controller {
	// Tạo dữ liệu của xe
	public static List<xe> duLieuXe = new ArrayList<>();
	   public static List<xe> createData(){
		xe x1 = new xe("Honda","BXE1", "DK-XE1","BH-XE1");
		duLieuXe.add(x1);
		xe x2 = new xe("Yamaha","BXE2", "DK-XE2","BH-XE2");
		duLieuXe.add(x2);
		xe x3 = new xe("Tesla","BXE3", "DK-XE2","BH-XE3");
		duLieuXe.add(x3);
		xe x4 = new xe("Volvo","BXE4", "DK-XE2","BH-XE4");
		duLieuXe.add(x4);
		xe x5 = new xe("BMW","BXE1", "DK-XE1","BH-XE1");
		duLieuXe.add(x5);
		xe x6 = new xe("Bugatti","BXE2", "DK-XE2","BH-XE2");
		duLieuXe.add(x6);
		xe x7 = new xe("Ferrari","BXE3", "DK-XE2","BH-XE3");
		duLieuXe.add(x7);
		xe x8 = new xe("Ford","BXE4", "DK-XE2","BH-XE4");
		duLieuXe.add(x8);
		return duLieuXe;
	}
}
