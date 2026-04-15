import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidu73_1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader iputSR = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(iputSR);
		String str;
		System.out.println("Nhap chuoi:");
		System.out.println("Nhap 'stop' ket thuc chuong trinh.");
		do
		{
		str = buf.readLine();
		System.out.println(str);
		} while(!str.equals("stop")); 

	}

}
