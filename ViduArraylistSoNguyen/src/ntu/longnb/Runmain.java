package ntu.longnb;


import java.util.ArrayList;
import java.util.Scanner;

public class Runmain {

	public static void main(String[] args) {
	      ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
	      Scanner banPhim = new Scanner(System.in);
	      for ( int i=0; i<10; i++) {
	      System.out.print("Mời nhập phần tử số " + i + ": ");
	      Integer tam = banPhim.nextInt();
	      dsSoNguyen.add(tam);
	      }
	}

}
