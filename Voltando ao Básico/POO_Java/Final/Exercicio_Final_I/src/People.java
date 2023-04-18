public abstract class People {
  protected String name;
  protected int age;
  protected char gender;
  protected float experience;

  public abstract void gainExperience();

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

  public float getExperience() {
    return experience;
  }

  public void setExperience(float experience) {
    this.experience = experience;
  }

  
}
