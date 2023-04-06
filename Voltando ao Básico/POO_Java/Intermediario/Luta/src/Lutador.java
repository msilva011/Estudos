public class Lutador{
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  /***************CONSTRUTOR*************/
  public Lutador(String no, String na, int id, float al, float pe, int vi, int em, int de){
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.empates = em;
    this.derrotas = de; 
  }

/**********getters and stters*********/
  public float getAltura() {
    return altura;
  }
  public String getCategoria() {
    return categoria;
  }
  public int getVitorias() {
    return vitorias;
  }
  public int getDerrotas() {
    return derrotas;
  }
  public int getEmpates() {
    return empates;
  }
  public int getIdade() {
    return idade;
  }
  public String getNacionalidade() {
    return nacionalidade;
  }
  public String getNome() {
    return nome;
  }
  public float getPeso() {
    return peso;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }
  public void setCategoria() {
    if(this.peso < 52.2){
      this.categoria = "Invalido";
    }else if (this.peso <= 70.3){
      this.categoria = "Leve";
    }else if(this.peso <= 83.9){
      this.categoria = "Medio";
    }else if (this.peso <= 120.2){
      this.categoria = "Pesado";
    }else{
      this.categoria = "Invalido";
    }
  }
  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public void setEmpates(int empates) {
    this.empates = empates;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }
  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }
  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
  /******************metodos******************/
  public void apresentar(){
    System.out.println("\n--------Apresentação--------\n");
    System.out.println("Lutador: "+this.getNome() + 
    "\nNacionalidade: " + this.getNacionalidade() + 
    "\nIdade: " + this.getIdade() + 
    "\nAltura: " + this.getAltura() + 
    "\nPeso: " + this.getPeso()+"Kg" + 
    "\nVitorias: " + this.getVitorias() + 
    "\nEmpates: " + this.getEmpates() + 
    "\nDerrotas: " + this.getDerrotas());
  }
  public void status(){
    System.out.println("\n----------------Status-------------\n");
    System.out.println("Nome: " + this.getNome() + ", é um peso "+this.getCategoria()+", possui "+this.getVitorias()+" vitórias, "+this.getEmpates()+" empates, "+this.getDerrotas()+" derrotas.");
  }
  public void ganharLuta(){
    this.setVitorias(this.getVitorias()+1);
  }
  public void perderLuta(){
    this.setDerrotas(this.getDerrotas()+1);
  }
  public void empatarLuta(){
    this.setEmpates(this.getEmpates()+1);
  }
  
}