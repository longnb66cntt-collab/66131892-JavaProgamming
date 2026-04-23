package thigk2NguyenBaoLong;

public class bai2 {
	public class SanPham {
	    private String maSP;
	    private String tenSP;
	    private String loaiSP;
	    private double gia;

	    // Constructor
	    public SanPham(String maSP, String tenSP, String loaiSP, double gia) {
	        this.maSP = maSP;
	        this.tenSP = tenSP;
	        this.loaiSP = loaiSP;
	        this.gia = gia;
	    }

	    // Getter
	    public String getLoaiSP() {
	        return loaiSP;
	    }

	    // Hiển thị
	    public void hienThi() {
	        System.out.println(maSP + " | " + tenSP + " | " + loaiSP + " | " + gia);
	    }
	}

}
