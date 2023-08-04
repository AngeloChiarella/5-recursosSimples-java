package recursos.records;

public class Records {

	public static void main(String[] args) {
		Livro livro = new Livro("Aventuras Java", 200);
		LivroRecord record = new LivroRecord("Aventuras Java 2", 200);
		
		System.out.println(livro);
		System.out.println(record);
	}

}
