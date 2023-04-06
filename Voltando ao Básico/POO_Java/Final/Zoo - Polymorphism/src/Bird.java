class Bird extends Animal {
  private String featherColor;

  public void makeNest(){
    System.out.println("\nMaking a nest...");
  }

  @Override
  void eat() {
    System.out.println("\nEating fruit...");
    
  }

  @Override
  void makeSound() {
    System.out.println("\nMake bird sound...");    
  }

  @Override
  void move() {
    System.out.println("\nFlying...");
    
  }

  public String getFeatherColor() {
    return featherColor;
  }

  public void setFeatherColor(String featherColor) {
    this.featherColor = featherColor;
  }

  

}
