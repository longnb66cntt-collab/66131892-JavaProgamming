package longnb.ntu;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	//hamtao
//	public NhanVien() {
		
//	}
//   public NhanVien( String maNhanVien, String tenNhanVien, double luongCoBan) {
//      maNV = maNhanVien;
//      hoTen = tenNhanVien;
 //     this.luongCoBan = luongCoBan;
//	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public NhanVien() {
		super();
	}
	public double tinhLuong() {
		return luongCoBan;
	}
	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "MÃ NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHọ tên: " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLương cơ bản: " +this.luongCoBan;
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	public void hienthiThongTin() {
       System.out.println("MÃ NV: " + maNV);
       System.out.println("Họ Tên: " + hoTen);
       System.out.println("Lương Cơ bản: " + luongCoBan);
     }
}
