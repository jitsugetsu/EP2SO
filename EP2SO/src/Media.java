import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Media{
    public static void main(String [] args) throws FileNotFoundException{
        File file = new File("numeros.txt");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();
        int [] medias = new int [100];
        Scanner scLine;
        for(int i = 0; i<50; i++){
            line = scan.nextLine();
            scLine = new Scanner(line);
            for(int j = 0; j<100; j++){
                medias[j] += scLine.nextInt();
            }
        }
        for(int i = 0; i < 100; i++){
            medias[i] /= 50;
            System.out.println(i + " writers: " + medias[i]);
        }
        scan.close();
    }
}