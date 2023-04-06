public class Student extends People{
  private int registration;
  private String course;

  public void payTuition(){
    System.out.println("Paying Tuition of Studente: " + this.getName());
  }

  public int getRegistration() {
    return registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String detailStudent() {
    return "\n--------------------------\n Student [ name: " + this.getName() + ", Gender: " + this.getGender() + ", Age: "+ this.getAge() +"\nRegistration: " + registration + ", Course: " + course + "]\n";
  }

  

}
