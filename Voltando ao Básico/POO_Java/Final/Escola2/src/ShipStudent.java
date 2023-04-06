class ShipStudent extends Student {
  private float scholarship;

  public void scholarshipRenew(){
    System.out.println("\nRenewed Scholarship of Student: " + this.getName());
  }

  @Override
  public void payTuition(){
    System.out.println("\nThis student is scholarship! Easy payment...");
  }

  @Override
  public String detailStudent() {
    return "\n--------------------------\n Student Scholarship [ Name: " + this.getName() + ", Gender: " + this.getGender() + ", Age: "+ this.getAge() +"\nRegistration: " + this.getRegistration() + ", Course: " + this.getCourse() + ", Scholarship: " + this.getScholarship()+"% ]\n";
  }

  public float getScholarship() {
    return scholarship;
  }

  public void setScholarship(float scholarship) {
    this.scholarship = scholarship;
  }


}
