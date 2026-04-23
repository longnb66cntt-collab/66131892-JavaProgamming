package thigk2.NguyenBaoLong;

import java.util.Scanner;

public class bai1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Nhập tọa độ góc trên trái
	        System.out.print("Nhập x1: ");
	        double x1 = sc.nextDouble();
	        System.out.print("Nhập y1: ");
	        double y1 = sc.nextDouble();

	        // Nhập tọa độ góc dưới phải
	        System.out.print("Nhập x2: ");
	        double x2 = sc.nextDouble();
	        System.out.print("Nhập y2: ");
	        double y2 = sc.nextDouble();

	        // Tính chiều dài và chiều rộng
	        double chieuDai = Math.abs(x2 - x1);
	        double chieuRong = Math.abs(y1 - y2);

	        // Tính chu vi và diện tích
	        double chuVi = 2 * (chieuDai + chieuRong);
	        double dienTich = chieuDai * chieuRong;

	        // Xuất kết quả
	        System.out.println("Chu vi: " + chuVi);
	        System.out.println("Diện tích: " + dienTich);

	        sc.close();
	    }
	}

