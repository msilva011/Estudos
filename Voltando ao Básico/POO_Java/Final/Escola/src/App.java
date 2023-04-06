public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Mayara");
        p2.setNome("Gabrielle");
        p3.setNome("Giovanna Rosa");
        p4.setNome("Maria");

        p1.setIdade(24);
        p2.setSexo('F');
        p3.setIdade(19);
        p4.setSexo('M');

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
