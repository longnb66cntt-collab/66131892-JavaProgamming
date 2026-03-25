package long_ntu;

public class oto extends phuongtien_java {
    private int socho;
    private String dongco;
    
    public oto(String namxansuat, String hangxansuat, int giaban, int socho, String dongco) {
    	super(namxansuat, hangxansuat, giaban);
    	this.socho = socho;
    	this.dongco = dongco;
    	
    }
    public 
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
    	System.out.println("Số chỗ" + so cho)
    	System.out.println("dong cơ")
    }
 
}
