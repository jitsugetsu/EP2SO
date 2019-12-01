public class ReaderWriter{
    int tipo;       //0 = Reader;   1 = Writer
    String readerVariavel;
    public ReaderWriter(int tipo){
        this.tipo = tipo;
    }

    public void readerCopy(int pos, String[] texto){
        this.readerVariavel = texto[pos];
    }

    public void writerAlter(int pos, String [] texto){
        texto[pos] = "MODIFICADO";
    }
}