import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {

	
	static String [] texto = new String [36242];
	static ReaderWriter [] writhers = new ReaderWriter [100];
	public static void main(String[] args) throws Exception{
		File dir = new File("bd.txt");
		Scanner scan = new Scanner(dir);
		for(int i = 0; i < 36242; i++){
			texto[i] = scan.next();
		}
		FileWriter filer = new FileWriter("numeros.txt", true);
		BufferedWriter printer = new BufferedWriter(filer);
		// for(int i = 0; i<10; i++){
		// 	printer.write(i + "   ");
		// }
		// for(int i = 10; i<100; i++){
		// 	printer.write(i + "  ");
		// }
    	// printer.write("\n");
    	

		for(int x = 0; x < 100; x++){
			for(int i = 0; i < x; i++){
				writhers [i] = new ReaderWriter(1);
			}
			for(int i = x; i < 100; i++){
				writhers [i] = new ReaderWriter(0);
						
			}
			List<ReaderWriter> list = Arrays.asList(writhers);
			Collections.shuffle(list);
			list.toArray(writhers);

			long tempoFinal;
			long tempoInicial;
			long tempoMedia = 0;
			tempoInicial = System.currentTimeMillis();

			for(int i = 0; i < 100; i++){
				writhers[i].start();
				writhers[i].sleep(1);
			}
			
			tempoFinal = System.currentTimeMillis() - tempoInicial;
			// System.out.println(x + " writers: " + tempoFinal);
			printer.write(tempoFinal + " ");
		}
		printer.write("\n");
		
		/*
		for(int x = 0; x<50; x++){
			tempoInicial = System.currentTimeMillis();

			for(int i = 0; i < 100; i++){
				writhers[i].start();
				writhers[i].sleep(1);
			}
			
			tempoFinal = System.currentTimeMillis() - tempoInicial;
			tempoMedia += tempoFinal;
		}
		tempoMedia /= 50;
		System.out.println(tempoMedia);
		*/
		printer.close();
		scan.close();
	}


}

