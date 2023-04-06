class Teacher extends People {
  private String specialty;
  private float salary;

  public void salaryIncrease(float increasy){
    this.setSalary(this.getSalary()+increasy);
    System.out.println("Your new salary is "+ this.getSalary());
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public String detailTeacher() {
    return "\n--------------------------\n Teacher [ Name:  " + this.getName() + ", Age: " + this.getAge() + ", Gender:  " + this.getGender() + "\nSpecialty: " + specialty + ", Salary: " + salary + " ]\n";
  }

  

  
}
