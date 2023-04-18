public class App {
    public static void main(String[] args) throws Exception {
        Student s[] = new Student[3];
        Video v[] = new Video[3];

        s[0] = new Student("May",24,'F',"rosa.may");
        v[0] = new Video("About Java");
        s[1] = new Student ("Jo", 19,'F', "gigirosinha1");
        v[1] = new Video("Moda no século XV");

        ToView tv[] = new ToView[3]; //visualização

        tv[0] = new ToView(s[1], v[1]);
        tv[0].avaliar();
        tv[1] = new ToView(s[0], v[0]);
        tv[1].avaliar(55.5f);
        tv[2] = new ToView(s[0], v[1]);
        tv[2].avaliar();


        System.out.println(tv[1].toString());
        System.out.println(tv[0].toString());
        System.out.println(tv[2].toString());

    }
}
