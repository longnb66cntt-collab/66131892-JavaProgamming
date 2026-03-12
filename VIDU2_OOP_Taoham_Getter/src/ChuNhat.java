
public class ChuNhat {
    private double dai;
    private double rong;
    
    public ChuNhat() {
    	dai =10;
    	rong =5;
    }
    public ChuNhat(double dai, double rong) {
    this.dai = dai;
    this.rong = rong;
    }
    double getDai() {
    	return dai;
    }
    double getRong() {
    	return rong;
    }
    void setDai(double daiM) {
    	dai= daiM;
    }
    void setRong(double rongM) {
    	rong= rongM;
    }
    public String toString() {
    	String s = "Hinh nay , co chieu dai =";
    	s =s+dai;
    	s= s + "va chieu rong =" + rong;
    	return s;
    }
}
