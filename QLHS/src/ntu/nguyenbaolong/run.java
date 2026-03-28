package ntu.nguyenbaolong;

import java.util.Scanner;

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
 // 1 b nhâp dữ liệu từ bàn phím      
       Scanner banphim = new Scanner(System.in);
       hocsinh hs3 =new hocsinh();
       
       System.out.print("Mời nhặp tên HS3 : ");
       String tenhs3= banphim.nextLine();
       hs3.setTenHS(tenhs3);
       
       System.out.print("Mời nhặp tuổi HS3 : ");
       short tuoihs3= banphim.nextShort();
       hs3.setTuoiHS(tuoihs3);
       
       System.out.println("Mời nhặp lớp HS3 : ");
       String lophs3= banphim.nextLine();
       hs3.setTenHS(lophs3);
       
       System.out.println(hs3.toString());
        

	}

}