package long_ntu;

public class  xemay extends phuongtien_java {
	private int dungtichxilanh;
	private String loaixe;
	
	public xemay(String namxansuat, String hangxansuat, int giaban, int dungtichxilanh, String loaixe) {
		super(namxansuat, hangxansuat , giaban);
		this.dungtichxilanh = dungtichxilanh;
		this.loaixe = loaixe;
	}
	@Override
	public double vantoctoida() {
		return dungtichxilanh*2;
	}
	@Override
	public int sochongoi() {
		return 2;
		
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Dung tích của xilanh :" + dungtichxilanh);
		System.out.println("loai xe : " + loaixe);
		System.out.println("vận tốc tối đa : " + this.vantoctoida());
	}

	
	

}
