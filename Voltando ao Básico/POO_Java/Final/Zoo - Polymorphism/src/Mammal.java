class Mammal extends Animal{
  private String furColor;

  @Override
  public void move(){
    System.out.println("\nRunning...");
  }

  @Override
  public void eat(){
    System.out.println("\nSuckling...");
  }

  @Override
  public void makeSound(){
    System.out.println("\nMaking mammal sound...");
  }

  public String getFurColor() {
    return furColor;
  }

  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }

}