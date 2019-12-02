import java.util.Random;
public class ReaderWriter extends Thread{
    int tipo;       //0 = Reader;   1 = Writer
    String readerVariavel;
    Random rand;
    public ReaderWriter(int tipo){
        this.tipo = tipo;
        rand = new Random();
    }

    public void readerCopy(int pos, String[] texto){
        this.readerVariavel = texto[pos];
    }

    public void writerAlter(int pos, String [] texto){
        texto[pos] = "MODIFICADO";
    }

    public void run() {
        int pos;
        for(int i = 0; i< 100; i++){
            pos = rand.nextInt(36242);
            if(tipo == 0) readerCopy(pos, main.texto);
            else writerAlter(pos, main.texto);
        }
        
    }
}