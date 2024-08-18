public class Main {
  public static void main(String[] args) {
	// Criando a livraria
	Livraria livraria = new Livraria();

	// Criando livros
	Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", 1500);
	Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 464);
	Livro livro3 = new Livro("Design Patterns", "Erich Gamma et al.", 395);


	livraria.inserirLivro(livro1);
	livraria.inserirLivro(livro2);
	livraria.inserirLivro(livro3);

	livraria.listarLivros();

	livro1.reservar();

	livro1.reservar();

	livraria.listarDisponiveis();

	livro1.devolver();

	livraria.listarDisponiveis();
  }
}
