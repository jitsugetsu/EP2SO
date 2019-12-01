import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class main {

	
	static String [] texto = new String [36242];
	static ReaderWriter [] writhers = new ReaderWriter [100];
	public static void main(String[] args) throws FileNotFoundException{
		File dir = new File("bd.txt");
		Scanner scan = new Scanner(dir);
		for(int i = 0; i < 36242; i++){
			texto[i] = scan.next();
		}

		Random rand = new Random();
		
		for(int i = 0; i < 100; i++){
			writhers [i] = new ReaderWriter(0);
		}
		for (int i = 0; i < 100; i++){
			if(writhers[i].tipo == 0) writhers[i].readerCopy(rand.nextInt(36242), texto);
			else writhers[i].writerAlter(rand.nextInt(36242), texto);
		}
		System.out.println(writhers[0].readerVariavel);

	}

}

