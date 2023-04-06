public class App {
    public static void main(String[] args){
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Mayara", 24, "F");
        p[1] = new Pessoa("Gabrielle", 23, "F");

        l[0] = new Livro("Java para baixinhos", "Xuxa", 300, p[0]);
        l[1] = new Livro("Arquitetura Maxima", "Oscar", 450, p[1]);
        l[2] = new Livro("Livros especiais para Pessoas especiais", "Naldo", 1, p[0]);

        l[0].abrir();
        l[0].voltarPagina();

        System.out.println(l[0].detalhes()); 
        //System.out.println(l[1].detalhes()); 
        //System.out.println(l[2].detalhes()); 
    }
}
