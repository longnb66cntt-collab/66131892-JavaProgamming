package long_ntu;

public class maytinhbang {
	class maytinhbang extends thietbidientu 
    implements CoTheKetNoiInternet, CoTheCamUng {

public MayTinhBang(String ten, double gia, String hangSanXuat) {
    super(ten, gia, hangSanXuat);
}

@Override
public void bat() {
    System.out.println("Máy tính bảng bật");
}

@Override
public void tat() {
    System.out.println("Máy tính bảng tắt");
}

@Override
public void ketNoiWifi() {
    System.out.println("Tablet kết nối Wifi");
}

@Override
public void ngatKetNoi() {
    System.out.println("Tablet ngắt Wifi");
}

@Override
public void cham() {
    System.out.println("Chạm màn hình tablet");
}

@Override
public void vuot() {
    System.out.println("Vuốt màn hình tablet");
}

// Phương thức riêng
public void xemPhim() {
    System.out.println("Đang xem phim...");
}
}

}
