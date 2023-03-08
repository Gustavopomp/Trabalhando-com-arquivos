import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	

		File file =  new File("X:\\desenv\\Arquvos\\in.txt");
		Scanner ler = null;
		try {
			ler = new Scanner(file);
			while(ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
			
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			if (ler!= null)
				ler.close();
		}
	}

}
