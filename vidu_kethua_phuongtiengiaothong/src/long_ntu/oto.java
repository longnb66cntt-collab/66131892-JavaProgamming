package long_ntu;

public class oto extends phuongtien_java {
    private int socho;
    private String dongco;
    
    public oto(String namxansuat, String hangxansuat, int giaban, int socho, String dongco) {
    	super(namxansuat, hangxansuat, giaban);
    	this.socho = socho;
    	this.dongco = dongco;
    	
    }
    public double tinhtheutruocba() {
    	return socho*3000000;
    }
    @Override
    public double vantoctoida() {
    	return socho*20;
    	
    }
    @Override
    public int sochongoi() {
    	return 4;
    }
    @Override
    public void hienthithongtin() {
    	super.hienthithongtin();
    	System.out.println("Số chỗ : " + socho);
    	System.out.println("dong cơ : " + dongco);
    	System.out.println("số thếu : " + this.tinhtheutruocba());
    }
 
}
