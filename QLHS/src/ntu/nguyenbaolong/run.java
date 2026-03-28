package ntu.nguyenbaolong;

public class run {
	public static void main(String[] args) {
       hocsinh hs1 = new hocsinh();
       
       String tenHS1 = "Trần văn A";
       hs1.setTenHS(tenHS1);
       
       short tuoiHS1 =10;
       hs1.setTuoiHS(tuoiHS1);
       
       String lopHS1 = "8A-12";
       hs1.setLopHS(lopHS1);
       
       hocsinh hs2 = new hocsinh("Nguyễn Bảo Long", (short)12, "6A");
       System.out.println(hs1.toString());
       System.out.println("Tên HS2 : " + hs2.getTenHS());
       System.out.println("Tuổi HS2 : " + hs2.getTuoiHS());
       System.out.println("Lớp HS2 : " + hs2.getLopHS());

	}

}