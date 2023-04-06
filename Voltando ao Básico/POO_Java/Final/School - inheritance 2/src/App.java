public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        Visitor v1 = new Visitor();
        ShipStudent ss1 = new ShipStudent();
        Teacher t1 = new Teacher();

        s1.setName("May");
        s1.setAge(24);
        s1.setGender('F');
        s1.setRegistration(414780);
        s1.setCourse("Computer Science");
        s1.payTuition();

        v1.setName("Mary");
        v1.setAge(43);
        v1.setGender('F');
        v1.haveBirthday();

        ss1.setName("Gabe");
        ss1.setAge(23);
        ss1.setGender('F');
        ss1.setCourse("Architecture");
        ss1.setRegistration(879461);
        ss1.setScholarship(45.5f);
        ss1.scholarshipRenew();

        t1.setName("Gilbert");
        t1.setAge(50);
        t1.setGender('M');
        t1.setSalary(7500.80f);
        t1.setSpecialty("Articial Intelligence");
        t1.salaryIncrease(500.00f);

        System.out.println(t1.detailTeacher());
        System.out.println(ss1.detailStudent());
        System.out.println(v1.Detail());
        System.out.println(s1.detailStudent()); 
    }
}