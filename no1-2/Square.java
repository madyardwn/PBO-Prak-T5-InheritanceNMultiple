class Square extends Rectangle {
  public Square() {
    super();
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() { return getWidth(); }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  public void setWidth(double side) {
    setSide(side);
  }

  public void setLength(double side) {
    setSide(side);
  }
  public double getArea() { return side * side; }

  public double getPerimeter() { return 4 * (side); }

  public String toString() {
    return "side=" + getSide() +"\nSquare[" + super.toString() +  "]\n";
  }
}

