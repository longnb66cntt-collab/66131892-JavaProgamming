package longnb.ntu;

public class Run {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Mai Cường Thọ", 230000);
		nv1.hienthiThongTin();
		
        NhanVienVanPhong nvVANPhong1 = new NhanVienVanPhong("002","Trần Thị Tươi Thắm",2300000, 3, 200000);
 //       System.out.print(nvVANPhong1.toString());
        nvVANPhong1.hienthiThongTin();
	}

}
