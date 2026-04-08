package long_ntu;

public class thietbidientu {
	abstract class Thietbidientu {
	    protected String ten;
	    protected double gia;
	    protected String hangSanXuat;

	    public Thietbidientu(String ten, double gia, String hangSanXuat) {
	        this.ten = ten;
	        this.gia = gia;
	        this.hangSanXuat = hangSanXuat;
	    }

	    public String getTen() {
	        return ten;
	    }

	    public double getGia() {
	        return gia;
	    }

	    public String getHangSanXuat() {
	        return hangSanXuat;
	    }

	    public void setTen(String ten) {
	        this.ten = ten;
	    }

	    public void setGia(double gia) {
	        this.gia = gia;
	    }

	    public void setHangSanXuat(String hangSanXuat) {
	        this.hangSanXuat = hangSanXuat;
	    }

	    public abstract void bat();
	    public abstract void tat();

	    public void hienThiThongTin() {
	        System.out.println("Tên: " + ten);
	        System.out.println("Giá: " + gia);
	        System.out.println("Hãng: " + hangSanXuat);
	    }
	}

}
