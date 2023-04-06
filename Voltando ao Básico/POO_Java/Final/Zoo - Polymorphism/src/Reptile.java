class Reptile extends Animal {
  private String squamaColor;

  @Override
  void eat() {
    System.out.println("\nEating vegetables...");
    
  }

  @Override
  void makeSound() {
    System.out.println("\nMaking Reptile sound...");
    
  }

  @Override
  void move() {
    System.out.println("\nCrawling...");
    
  }

  public String getSquamaColor() {
    return squamaColor;
  }

  public void setSquamaColor(String squamaColor) {
    this.squamaColor = squamaColor;
  }


}
