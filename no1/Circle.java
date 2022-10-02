class Circle extends Shape {
  private double radius = 1.0;
  private String color;

  public Circle() {
    radius = 1.0;
    color = "red";
  }

  public Circle(double r) {
    radius = r;
    color = "red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() { return radius; }

  void setRadius(double radius) { this.radius = radius; }

  public String getColor() { return color; }

  public void setColor(String color) { this.color = color; }

  public double getArea() { return radius * radius * Math.PI; }

  public double getPerimeter() { return 2 * radius * Math.PI; }

  public String toString() {
    return "Circle["+ super.toString() + ", \n\tradius=" + radius +"]\n";
  }
}

