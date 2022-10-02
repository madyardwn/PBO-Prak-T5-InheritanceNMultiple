public class TestCylinder {
  public static void main(String[] args) {
    Cylinder c1 = new Cylinder();
    System.out.println("Cylinder:"
                       + "\n radius=" + c1.getRadius() + "\n height=" +
                       c1.getHeight() + "\n base area=" + c1.getArea() +
                       "\n volume=" + c1.getVolume() + "\n" + c1.toString());

    Cylinder c2 = new Cylinder(10.0);
    System.out.println("Cylinder:"
                       + "\n radius=" + c2.getRadius() + "\n height=" +
                       c2.getHeight() + "\n base area=" + c2.getArea() +
                       "\n volume=" + c2.getVolume() + "\n" + c2.toString());

    Cylinder c3 = new Cylinder(2.0, 10.0);
    System.out.println("Cylinder:"
                       + "\n radius=" + c3.getRadius() + "\n height=" +
                       c3.getHeight() + "\n base area=" + c3.getArea() +
                       "\n volume=" + c3.getVolume() + "\n" + c3.toString());
    Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
    System.out.println("Cylinder:"
                       + "\n radius=" + c4.getRadius() + "\n height=" +
                       c4.getHeight() + "\n base area=" + c4.getArea() +
                       "\n volume=" + c4.getVolume() + "\n" + c4.toString());

    Square s1 = new Square();
    System.out.println("Square: \n" + s1.toString());
  }
}
