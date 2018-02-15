import java.io.*;

public class CSVtoFirebaseFeeder {

	public static void main(String[] args) throws Exception {
		File file = new File("Homeless Shelter Database.csv");
  		BufferedReader br = new BufferedReader(new FileReader(file));

  		String line;

  		while ((line = br.readLine()) != null) {
  			String[] items = line.split(",");
  			for (int i = 0; i < items.length; i++) {
  				System.out.print(items[i] + "  --  ");
  			}
  			System.out.println();
  		}
  		
	}
}