
public class main {


	public static void main(String[] args) throws FileNotFoundException {
		String[] memo = new String[36242];
	    int i = 0;
	    
	    Scanner scanner = new Scanner(new FileReader("bd.txt")).useDelimiter("\n");
        while (scanner.hasNext()){
     	  
        memo[i] = scanner.next();
        i++;
        }
       System.out.println(memo);
       scanner.close();
}

}
