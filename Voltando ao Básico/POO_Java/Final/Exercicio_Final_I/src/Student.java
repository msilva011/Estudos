public class Student extends People {
  private String login;
  private int totWatched;

  

  public Student(String name, int age, char gender, String login) {
    this.login = login;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.experience = 0;
    this.totWatched = 0;

  }

  private void watchedOneMore(){

  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotWatched() {
    return totWatched;
  }

  public void setTotWatched(int totWatched) {
    this.totWatched = totWatched;
  }

  @Override
  public void gainExperience() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String toString() {
    return "Student [name=" + this.name+ ", age= "+ this.age + ", gender= " + this.gender + ", login=" + login + ", totWatched=" + totWatched + "]";
  }

  
}
