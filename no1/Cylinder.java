class Cylinder extends Circle {
  private double height = 1.0;

  public Cylinder() {
    super();
    height = 1.0;
  }

  public Cylinder(double height) {
    super();
    this.height = height;
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double radius, double height, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() { return height; }

  void setHeight(double height) { this.height = height; }

  public double getVolume() { return getArea() * height; }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return super.getArea();
  }

  @Override
  public String toString(){
    return "Cylinder: subclass of " + super.toString()+"\n";
  }
}

