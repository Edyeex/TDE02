
import java.util.ArrayList;

public class Livraria {
  // Atributos
  private ArrayList<Livro> livros;

  // Construtor
  public Livraria() {
    this.livros = new ArrayList<>();
  }

  // Métodos
  public void inserirLivro(Livro livro) {
    livros.add(livro);
    System.out.println("Livro \"" + livro.getTitulo() + "\" inserido com sucesso.");
  }

  public void listarLivros() {
    if (livros.isEmpty()) {
      System.out.println("Nenhum livro disponível na livraria.");
      return;
    }

    System.out.println("Lista de livros disponíveis na livraria:");
    for (Livro livro : livros) {
      livro.exibirDetalhes();
      System.out.println("----------------------------");
    }
  }

  public void listarDisponiveis() {
    boolean temDisponivel = false;
    System.out.println("Lista de livros disponíveis para empréstimo:");
    for (Livro livro : livros) {
      if (livro.isDisponibilidade()) {
        livro.exibirDetalhes();
        System.out.println("----------------------------");
        temDisponivel = true;
      }
    }

    if (!temDisponivel) {
      System.out.println("Nenhum livro disponível para empréstimo.");
    }
  }
}