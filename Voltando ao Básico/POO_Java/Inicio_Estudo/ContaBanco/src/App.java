class App {
    public static void main(String[] args) {
      ContaBanco p1 = new ContaBanco();
      p1.abrirConta("Mayara",4147808,"CC");
      
      p1.depositar(250);
  
      p1.sacar(50);
      //p1.fecharConta();
  
      p1.consultarConta();
      
    }
  } 