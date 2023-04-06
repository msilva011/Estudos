import java.util.Random;

public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta(Lutador l1,Lutador l2){
    if(l1.getCategoria() == l2.getCategoria()){
      if(l1 != l2){
        this.setAprovada(true);
        this.setDesafiado(l1);
        this.setDesafiante(l2);
        System.out.println("----------Luta marcada com sucesso------------");
      }
    }else{
      this.setAprovada(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
      System.out.println("xxxxxxx Luta nao pode ser marcada xxxxxxxxx");
    }
  }
  public void lutar(){
    if(this.isAprovada()){
      desafiado.status();
      desafiante.status();
      Random random = new Random();
      int vencedor = random.nextInt(3);
      System.out.println("\nSorteado= "+vencedor);
      switch (vencedor){
        case 0:
        desafiado.setEmpates(desafiado.getEmpates() + 1);
        desafiante.setEmpates(desafiante.getEmpates() + 1);
        System.out.println("\n**** Empate ****");
        break;
        case 1:
        desafiado.setVitorias(desafiado.getVitorias()+1);
        desafiante.setDerrotas(desafiante.getDerrotas()+1);
        System.out.println("\n**** Desafiado venceu " + desafiado.getNome() + "********");
        break;
        case 2:
        desafiado.setDerrotas(desafiado.getDerrotas()+1);
        desafiante.setVitorias(desafiante.getVitorias()+1);
        System.out.println("\n******* Desafiante venceu " + desafiante.getNome() + " ********");
        break;
      }
    }else{
      System.out.println("xxxxxxxxxx Luta nao pode acontecer xxxxxxxxx");
    }
  }
  public Lutador getDesafiado() {
    return desafiado;
  }
  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }
  public Lutador getDesafiante() {
    return desafiante;
  }
  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }
  public int getRounds() {
    return rounds;
  }
  public void setRounds(int rounds) {
    this.rounds = rounds;
  }
  public boolean isAprovada() {
    return aprovada;
  }
  public void setAprovada(boolean aprovada) {
    this.aprovada = aprovada;
  }
}