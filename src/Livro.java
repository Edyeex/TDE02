public class Livro {
  private String titulo;
  private String autor;
  private int numerPaginas;
  private boolean disponibilidade;

  public Livro(String titulo, String autor, int numerPaginas){

    this.titulo = titulo;
    this.autor = autor;
    this.numerPaginas = numerPaginas;
    this.disponibilidade = true; // deixar disponivel por padrão

  }

  public void exibirDetalhes(){

    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Numero de páginas: " + numerPaginas);
    System.out.println("Disponibilidade: " + (disponibilidade ? "Disponivel" : "Indisponivel"));

  }

  public void reservar(){

    if (disponibilidade){
      disponibilidade = false;
    System.out.println("O livro \"" +titulo+"\" foi reservado com sucesso.");
    }else {
      System.out.println("O livro |" + titulo + "| já foi reservado!");
    }

  }

  public void devolver() {

    disponibilidade = true;
    System.out.println("O livro \"" + titulo + "\" foi devolvido com sucesso.");

  }
  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getNumerPaginas() {
    return numerPaginas;
  }

  public boolean isDisponibilidade() {
    return disponibilidade;
  }

  public void setDisponibilidade(boolean disponibilidade) {
    this.disponibilidade = disponibilidade;
  }
}

