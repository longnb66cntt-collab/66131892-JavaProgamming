package thigk2.NguyenBaoLong;

import java.util.Scanner;

public class bai1 {
	    public static void main(String[] args) {
	    	    /*
	    	     * TÓM TẮT CÁCH GIẢI:
	    	     * 1. Nhập tọa độ 2 điểm của hình chữ nhật: (x1, y1) và (x2, y2)
	    	     * 2. Tính chiều dài = |x2 - x1|
	    	     * 3. Tính chiều rộng = |y1 - y2|
	    	     * 4. Tính chu vi = 2 * (dài + rộng)
	    	     * 5. Tính diện tích = dài * rộng
	    	     * 6. In kết quả ra màn hình
	    	     */

	    	        Scanner sc = new Scanner(System.in);

	    	        double x1, y1, x2, y2;

	    	        System.out.print("Nhap x1: ");
	    	        x1 = sc.nextDouble();

	    	        System.out.print("Nhap y1: ");
	    	        y1 = sc.nextDouble();

	    	        System.out.print("Nhap x2: ");
	    	        x2 = sc.nextDouble();

	    	        System.out.print("Nhap y2: ");
	    	        y2 = sc.nextDouble();

	    	        double dai = Math.abs(x2 - x1);
	    	        double rong = Math.abs(y1 - y2);

	    	        double chuVi = 2 * (dai + rong);
	    	        double dienTich = dai * rong;

	    	        System.out.println("Chu vi = " + chuVi);
	    	        System.out.println("Dien tich = " + dienTich);

	    	        sc.close();
	    	    }
	    	}

