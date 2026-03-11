import java.util.Scanner;

public class tong2sola {

	public static void main(String[] args) {
		//khai báo
		double num1, num2, sum;
		Scanner banphim = new Scanner(System.in);
		System.out.print("Mời nhập số thứ nhất");
		num1 = banphim.nextDouble();
		System.out.print("Mời nhập số thứ hai");
		num2 = banphim.nextDouble();
		sum = num1+num2;
	//	System.out.print("Tổng của" + a + "và" + b + "là" + sum);
		System.out.print(" Tổng của ");
		System.out.print(num1);
		System.out.print("và");
		System.out.print(num2);
		System.out.print( "là");
		System.out.print(sum);
	}

}
