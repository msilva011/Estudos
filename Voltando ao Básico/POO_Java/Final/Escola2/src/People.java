abstract class  People{
  private String name;
  private int age;
  private char gender;

  public final void haveBirthday(){
    this.age++;
    System.out.println("The " + this.getName() + " had a birthday. Your age is " + this.getAge() + " years old.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String Detail() {
    return "\n--------------------------\n Visitor: [ Name:  " + name + ", Age: " + age + ", Gender:  " + gender + " ]\n";
  }

  
}