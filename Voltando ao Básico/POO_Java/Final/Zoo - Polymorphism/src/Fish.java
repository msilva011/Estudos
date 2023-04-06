class Fish extends Animal {
  private String squamaColor;

  public void releaseBubles(){
    System.out.println("\nReleasing burbles...");
  }

  @Override
  void eat() {
    System.out.println("\nEating substances...");
    
  }

  @Override
  void makeSound() {
    System.out.println("\nFish doesn't make sound");    
  }

  @Override
  void move() {
    System.out.println("\nSwimming...");
    
  }

  public String getSquamaColor() {
    return squamaColor;
  }

  public void setSquamaColor(String squamaColor) {
    this.squamaColor = squamaColor;
  }

  
}
