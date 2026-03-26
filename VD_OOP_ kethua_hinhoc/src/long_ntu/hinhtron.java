package long_ntu;

public class hinhtron extends hinhhoc {
	private double bankinh;
	
	public hinhtron(String ten, String mausac, double bankinh) {
		super(ten, mausac);
		this.bankinh = bankinh;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double dientich() {
		return bankinh*bankinh*3.14;
	}
	@Override
	public double chuvi() {
		return bankinh*2*3.14;
	}
	@Override
	public void hienthithongtin() {
		super.hienthithongtin();
		System.out.println("Bán kính hình tròn " + bankinh);
		System.out.println("Chu vi hình tròn" + this.chuvi());
		System.out.println("Diện tích hình tròn"+ this.dientich());
		
		
	}

  

}
