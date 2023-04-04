class ContaBanco{
  
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  /*******************CONSTRUTOR******************/
  public void ContaBanco(){
    saldo = 0;
    status = false;  
  }
  /****************começo getters and setters (ctrl + i)****************/
    public String getDono() {
      return this.dono;
    }
    public float getSaldo() {
      return this.saldo;
    }
    public int getNumConta() {
      return this.numConta;
    }
    public boolean getStatus() {
      return this.status;
    }

    public String getTipo() {
      return this.tipo;
    }
    public void setDono(String dono) {
      this.dono = dono;
    }
    public void setNumConta(int numConta) {
      this.numConta = numConta;
    }
    public void setSaldo(float saldo) {
      this.saldo = saldo;
    }
    public void setStatus(boolean status) {
      this.status = status;
    }
    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
  /****************final getters and setters*************/
  /**************Metodos Especiais****************/
  public void abrirConta(String name, int conta, String t ){
    
    this.setDono(name);
    this.setNumConta(conta);
    this.setTipo(t);
    this.setStatus(true);

    if(t ==  "CC"){
      this.setSaldo(50);
    }else if(t =="CP"){
      this.setSaldo(150);
    }
    System.out.println("Conta Aberta Com Sucesso!");
  }
  
  public void fecharConta(){
    if(this.getSaldo() > 0){
      System.out.println("Voce Possui Saldo!");
    }else if(this.getSaldo() < 0){
      System.out.println("Voce possui Debitos!");
    }else{
      setStatus(false);
      System.out.println("COnta Fechada com Sucesso!");
    }
  }
  public void depositar(float d){
    if(this.getStatus()){
      this.setSaldo(this.getSaldo() + d);
      System.out.println("Deposito Realizado!");
    }else{
      System.out.println("Conta finaliza. Não é Possível Depositar!");
    }
  }
  public void sacar(float d){
    if(this.getStatus()){
      if(this.getSaldo() >= d){
        this.setSaldo(this.getSaldo() - d);
        System.out.println("Saque efetuado");
      }else{
        System.out.println("Saldo insulficiente");
      }
    }else{
      System.out.println("Conta fechada. Não dá pra sacar");
    }
  }
  public void pagarMensal(){
    int m;
    if(this.getStatus()){
      if(this.getTipo() == "CC"){
        m = 12;
        this.setSaldo(this.getSaldo() - m);
        System.out.println("Mensalidade combrada CC");
      }else{
        m = 20;
        this.setSaldo(this.getSaldo() - m);
        System.out.println("Mensalidade combrada CP");
      }
    }else{
      System.out.println("Conta fechada. Nao tem mensalidade");
    }
  }
  public void consultarConta(){
    System.out.println("-------------------------");
    System.out.println("\nNome: "+ this.getDono() + "\nConta: "+this.getNumConta() + "\nTipo: "+this.getTipo() + "\nSaldo: "+this.getSaldo());
    if(this.getStatus()){
      System.out.println("Status: Ativo");
    }else {
      System.out.println("Status: Inativo");
    }
  }

}