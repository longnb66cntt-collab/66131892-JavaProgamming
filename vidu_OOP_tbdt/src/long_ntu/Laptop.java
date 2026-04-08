package long_ntu;

public class Laptop {
	class Laptop extends ThietBiDienTu implements CoTheKetNoiInternet {

	    public Laptop(String ten, double gia, String hangSanXuat) {
	        super(ten, gia, hangSanXuat);
	    }

	    @Override
	    public void bat() {
	        System.out.println("Laptop bật");
	    }

	    @Override
	    public void tat() {
	        System.out.println("Laptop tắt");
	    }

	    @Override
	    public void ketNoiWifi() {
	        System.out.println("Laptop kết nối Wifi");
	    }

	    @Override
	    public void ngatKetNoi() {
	        System.out.println("Laptop ngắt Wifi");
	    }

	    // Phương thức riêng
	    public void lapTrinh() {
	        System.out.println("Đang lập trình...");
	    }
	}

}
