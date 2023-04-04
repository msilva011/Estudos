public class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public ControleRemoto(){
    volume = 50;
    ligado = false;
    tocando = false;
  }

  public int getVolume() {
    return volume;
  }
  public void setVolume(int volume) {
    this.volume = volume;
  }
  public boolean isLigado() {
    return ligado;
  }
  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }
  public boolean isTocando() {
    return tocando;
  }
  public void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override //sobescrever metodo abstrato
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    System.out.println("-----------MENU----------");
    System.out.println("Está ligada? " + this.isLigado());
    System.out.println("Está tocando? " + this.isTocando());
    System.out.println(this.getVolume());
    for (int i = 0; i <= this.getVolume(); i += 10){
      System.out.println("[]");
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando Menu...");
  }

  @Override
  public void maisVolume() {
    if(isLigado()){
      this.setVolume(getVolume() + 5);
    }else{
      System.out.println("TV desligada");
    }
  }

  @Override
  public void menosVolume() {
    if (this.isLigado()){
      this.setVolume(getVolume() - 5);
    }else{
      System.out.println("TV desligada");
    }
  }

  @Override
  public void ligarMudo() {
    if (this.isLigado()){
      if(this.getVolume() > 0){
        this.setVolume(0);
        System.out.println("TV está no mudo");
      }
      else{
        System.out.println("Volume está no 0");
      }
    }else{
      System.out.println("TV está desligada");
    }
  }

  @Override
  public void desligarMuda() {
    if (this.isLigado()){
      if(this.getVolume()==0){
        this.setVolume(50);
        System.out.println("Mudo desligado");
      }
      else{
        System.out.println("Volume nao está em 0");
      }
    }else{
      System.out.println("TV desligada");
    }
  }

  @Override
  public void play() {
    if (this.isLigado() && !(this.isTocando())){
      this.setTocando(true);
    }
  }

  @Override
  public void pause() {
    if (this.isLigado() && this.isTocando()){
      this.setTocando(false);
    }
  }
  
}
