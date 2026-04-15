package longnb.ntu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidudocStream {

	public static void main(String[] args) throws IOException { 
		FileInputStream fInput = new FileInputStream("baitho.txt");
		InputStreamReader ipReader =new InputStreamReader(fInput);
		BufferedReader bufReader = new BufferedReader(ipReader);
		String line1 = bufReader.readLine();
		System.out.print(line1);
		String line2 = bufReader.readLine();
		System.out.print(line2);
		

	}

}
