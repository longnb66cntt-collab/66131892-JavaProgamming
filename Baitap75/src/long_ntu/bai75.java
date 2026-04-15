package long_ntu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai75 {

	public static void main(String[] args) throws IOException {
			FileReader fr = new FileReader("bai75.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null)
			{
			System.out.println(s);
			}
			fr.close();

	}

}
