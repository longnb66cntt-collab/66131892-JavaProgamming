
public class run {

	public static void main(String[] args) {
		
		ChuNhat cn1 = new ChuNhat();
		ChuNhat cn2 = new ChuNhat(20,15);
		ChuNhat hv = new ChuNhat(20,20);
		 double cn1_dai=  cn1.getDai();
		 double cn1_rong= cn1.getRong();
		 
		 System.out.print("Hinh CN1 co chieu dai la :");
		 System.out.print(cn1_dai);
		 System.out.print("\nHinh CN! co chieu rong la : " + cn1_rong);
		 
		 cn1.setDai(50);
		 System.out.print("Sau khi thay doi chieu dai \n");
		 System.out.print("Hinh CN1 co chieu dai la :");
		 System.out.print(cn1_dai);
		 System.out.print("\nHinh CN! co chieu rong la : " + cn1_rong);
		 System.out.print( cn1.toString());
		
	}

}
