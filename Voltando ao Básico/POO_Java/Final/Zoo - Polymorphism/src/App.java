public class App {
    public static void main(String[] args) throws Exception {
        
       
        Fish f1 = new Fish();

        Dog d1 = new Dog();
        Kangaroo k1 = new Kangaroo();
        Turtle t1 = new Turtle();
        Bird b1 = new Bird();
        Snake s1 = new Snake();

        f1.setAge(12);
        f1.setSquamaColor("Red");
        f1.setMember(4);
        f1.setWeight(12.8f);
        f1.releaseBubles();
        f1.getSquamaColor();
        f1.makeSound();
        System.out.println(f1.toString());

        d1.setFurColor("Caramel");
        d1.eat();
        System.out.println(d1.getFurColor()); 
        d1.buryBone();
        d1.moveTail();
        d1.move();
        d1.makeSound();
        System.out.println(d1.toString());


        k1.setMember(2);
        k1.makeSound();
        k1.usePurse();
        k1.move();
        System.out.println(k1.toString());


        t1.move();
        t1.makeSound();
        System.out.println(t1.toString());

        b1.setFeatherColor("Blue");
        System.out.println(b1.getFeatherColor());
        b1.makeNest();
        b1.makeSound();
        System.out.println(b1.toString());


        s1.setMember(0);
        s1.setSquamaColor("Grenn");
        System.out.println(s1.getSquamaColor());
        s1.move();
        System.out.println(s1.toString()); 

    }
}
