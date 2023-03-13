import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FwBw {

	public static void main(String[] args) {
		String[] lines = new String[] { "good morning", "god afternoon", "good night" };
		String path = "X:\\desenv\\Arquvos\\in.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String line : lines) {

				bw.write(line);
				bw.newLine();
			}
		}

		catch (IOException e){
			e.printStackTrace();
		}
	}

}
