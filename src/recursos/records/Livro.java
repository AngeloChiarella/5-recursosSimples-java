package recursos.records;

import java.util.Objects;

record LivroRecord(String titulo, int numPaginas) {}

public class Livro {
	
	private String titulo;
	private int numPaginas;

	public Livro(String titulo, int numPaginas) {
		this.titulo = titulo;
		this.numPaginas = numPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", numPaginas=" + numPaginas + "]";
	}

}
