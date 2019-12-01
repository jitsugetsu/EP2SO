import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

	
	static String [] texto = new String [36242];
	static ReaderWriter [] writhers = new ReaderWriter [100];
	public static void main(String[] args) throws Exception{
		File dir = new File("bd.txt");
		Scanner scan = new Scanner(dir);
		for(int i = 0; i < 36242; i++){
			texto[i] = scan.next();
		}

		long tempo = System.currentTimeMillis();

		for(int i = 0; i < 100; i++){
			writhers [i] = new ReaderWriter(0);
		}
		for (int i = 0; i < 100; i++){
			writhers[i].start();
			writhers[i].sleep(1);
		}
		System.out.println(writhers[0].readerVariavel);
		System.out.println(System.currentTimeMillis() - tempo);

		scan.close();
	}

}

