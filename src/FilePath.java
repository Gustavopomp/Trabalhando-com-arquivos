import java.io.File;
import java.util.Scanner;

public class FilePath {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter a File Path");

		String strpath = ler.nextLine();

		File path = new File(strpath);
		System.out.println("getName : " + path.getName());
		System.out.println("getParent : " + path.getParent());
		System.out.println("getParent : " + path.getPath());
		ler.close();
	}

}
