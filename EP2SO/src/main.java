import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class main {
	static String [] texto = new String [36242];
	public static void main(String[] args) throws FileNotFoundException{
		File dir = new File("bd.txt");
		Scanner scan = new Scanner(dir);
		for(int i = 0; i < 36242; i++){
			texto[i] = scan.next();
		}
		
		
	}

}
