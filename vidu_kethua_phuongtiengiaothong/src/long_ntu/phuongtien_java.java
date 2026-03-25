package long_ntu;

public class phuongtien_java {
	private String namxansuat;
	private String hangxansuat;
	private int giaban;
    
	public phuongtien_java(String namxansuat, String hangxansuat, int giaban ){
		this.namxansuat = namxansuat ;
	    this.hangxansuat = hangxansuat;
	    this.giaban = giaban;
	}
	public double vantoctoida() {
		return 0;
	}
	public int sochongoi() {
		return 0;
	}
	public void hienthithongtin() {
		System.out.println("Năm xản suất : " + namxansuat);
		System.out.println("Hãng xản suât : " + hangxansuat);
		System.out.println("Giá Bán : " + giaban);
	}
}


