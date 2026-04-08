package long_ntu;

public class dienthoaithongminh {
	public dienthoaithongminh(String string, int i, String string2) {
		
	}

	class dienthoaithongminh extends thietbidientu
    implements CoTheKetNoiInternet, CoTheCamUng {

public dienthoaithongminh(String ten, double gia, String hangSanXuat) {
    super(ten, gia, hangSanXuat);
}

@Override
public void bat() {
    System.out.println("Điện thoại đang bật");
}

@Override
public void tat() {
    System.out.println("Điện thoại đang tắt");
}

@Override
public void ketNoiWifi() {
    System.out.println("Điện thoại kết nối Wifi");
}

@Override
public void ngatKetNoi() {
    System.out.println("Điện thoại ngắt Wifi");
}

@Override
public void cham() {
    System.out.println("Chạm màn hình điện thoại");
}

@Override
public void vuot() {
    System.out.println("Vuốt màn hình điện thoại");
}

public void goiDien() {
    System.out.println("Đang gọi điện...");
}
}

	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		
	}

	public void bat() {
		// TODO Auto-generated method stub
		
	}

	public void ketNoiWifi() {
		// TODO Auto-generated method stub
		
	}

	public void cham() {
		// TODO Auto-generated method stub
		
	}

	public void goiDien() {
		// TODO Auto-generated method stub
		
	}
}
