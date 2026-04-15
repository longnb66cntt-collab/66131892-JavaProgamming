package longnb.ntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidudocStream {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ipReader =new InputStreamReader(System.in);
		BufferedReader bufReader = new BufferedReader(ipReader);
		System.out.print("nhập một chuỗi bất kì: ");
		String lineDocDuoc = bufReader.readLine();
		System.out.print(lineDocDuoc);

	}

}
