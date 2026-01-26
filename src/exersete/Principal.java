package exersete;

public class Principal {

	public static void main(String[] args) {
      Livrodigital ld = new Livrodigital("Senhor", new Autor("Tolkie", "francês", "Tolkie@gmail"),
    	"aventura", 5, 6000, 5454);
      ld.info();
	}
}
