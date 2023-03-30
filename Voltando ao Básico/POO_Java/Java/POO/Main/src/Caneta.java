class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  //construtor
  public Caneta(String m, String c, float p, boolean t){
    this.modelo = m;
    this.cor = c;
    this.ponta = p;
    this.tampada = t;
  }
  
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public float getPonta() {
	return ponta;
}
public void setPonta(float ponta) {
	this.ponta = ponta;
}
public int getCarga() {
	return carga;
}
public void setCarga(int carga) {
	this.carga = carga;
}
public boolean isTampada() {
	return tampada;
}
public void setTampada(boolean tampada) {
	this.tampada = tampada;
}

public void status(){
  System.out.println("Modelo: " + this.modelo);
  System.out.println("Uma caneta: " + this.cor);
  System.out.println("Ponta: " + this.ponta);
  System.out.println("Está tampada? " + this.tampada);
  System.out.println("Carga: " + this.carga);
}

}