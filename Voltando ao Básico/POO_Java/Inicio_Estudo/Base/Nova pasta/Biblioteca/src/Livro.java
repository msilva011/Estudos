public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String t, String a, int tp, Pessoa l ){
    this.titulo = t;
    this.autor = a;
    this.totPaginas = tp;
    this.leitor = l;
    this.pagAtual = 0;
    this.aberto=false;
  }

  public String detalhes() {
    // TODO Auto-generated method stub
    System.out.println("---------------------");
    return "Detalhes Livro:\n" + "\nTitulo:" + titulo + " // Autor:" + autor + "\nTotal de Pag: " + totPaginas +
    " // Pagina Atual: " + pagAtual + " // Aberto? " + aberto + "\nLeitor: " + leitor.getNome() + " // Sexo: " + leitor.getSexo();
  }
  
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public Pessoa getLeitor() {
    return leitor;
  }
  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }
  public int getPagAtual() {
    return pagAtual;
  }
  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public int getTotPaginas() {
    return totPaginas;
  }
  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }
  public boolean isAberto() {
    return aberto;
  }
  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int p) {
    if(p > this.totPaginas){
      this.setPagAtual(0);
    }else{
      this.setPagAtual(p);
    }
    
  }

  @Override
  public void avançarPagina() {
    if(this.getPagAtual() == this.getTotPaginas()){
      this.setPagAtual(0);
    }else{
      this.setPagAtual(this.getPagAtual()+1);
    }
  }

  @Override
  public void voltarPagina() {
    if(this.getPagAtual() == 0){
      this.setPagAtual(0);
    }else{
      this.setPagAtual(this.getPagAtual()-1);
    }
    
  }
}
