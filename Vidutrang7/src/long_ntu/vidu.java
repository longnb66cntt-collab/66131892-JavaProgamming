package long_ntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		InputStreamReader iputSR = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(iputSR);
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		do
		{
		c = (char) buf.read();
		System.out.print(c);
		} while(c != '.'); 

		

	}

}
