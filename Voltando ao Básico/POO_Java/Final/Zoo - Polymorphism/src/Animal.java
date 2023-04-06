abstract class Animal{
  protected float weight;
  protected int age;
  protected int member;

  abstract void move();
  abstract void eat();
  abstract void makeSound();

  public float getWeight() {
    return weight;
  }
  public void setWeight(float weight) {
    this.weight = weight;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getMember() {
    return member;
  }
  public void setMember(int member) {
    this.member = member;
  }
  @Override
  public String toString() {
    return "\n^^^^^^^^^^^^^^^^\nAnimal [weight=" + weight + ", age=" + age + ", member=" + member + "]\n--------------------\n";
  }

}