import java.util.*;

abstract class Sortable {
  public abstract int compare(Sortable b);
  public static void shell_sort(Sortable[] a) { // Shell sort body
    int n = a.length;
    int h = 1;
    while (h < n/3) h = 3*h + 1;
    while (h >= 1) {
      for (int i = h; i < n; i++) {
        for (int j = i; j >= h && a[j].compare(a[j-h]) < 0; j -= h) {
          Sortable t = a[j];
          a[j] = a[j-h];
          a[j-h] = t;
        }
      }
      h = h/3;
    }
  }
}

class Employee extends Sortable {
  private String name;
  private double salary;
  private int hireday;
  private int hiremonth;
  private int hireyear;

  public Employee(String n, double s, int day, int month, int year) {
    name = n;
    salary = s;
    hireday = day;
    hiremonth = month;
    hireyear = year;
  }
  public void print() {
    System.out.println(name + " " + salary + " " + hireYear());
  }
  public void raiseSalary(double byPercent) { salary *= 1 + byPercent / 100; }
  public int hireYear() { return hireyear; }

  public int compare(Sortable b) {
    Employee eb = (Employee)b;
    if (salary < eb.salary)
      return -1;
    if (salary > eb.salary)
      return +1;
    return 0;
  }
}

class Manager extends Employee{
  public Manager(String n, double s, int d, int m, int y) {
    super(n, s, d, m, y);
    secretaryName = "";
  }

  public void raiseSalary(double byPercent) {
    // add 1/2% bonus for every year of serviceGregorianCalendar
    GregorianCalendar todaysDate = new GregorianCalendar();
    int currentYear = todaysDate.get(Calendar.YEAR);
    double bonus = 0.5 * (currentYear - hireYear());
    super.raiseSalary(byPercent + bonus);
  }
  public String getSecretaryName() { return secretaryName; }
  private String secretaryName;
}

class Main {
  public static void main(String[] args) {
    // Employee[] staff = new Employee[3];
    // staff[0] = new Employee("Harry", 50000, 1, 1, 2000);
    // staff[1] = new Employee("Carl", 40000, 1, 1, 2001);
    // staff[2] = new Employee("Tony", 45000, 1, 1, 2002);
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
    staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
    staff[2] = new Employee("Isabel Vidal", 1900000, 1, 11, 1993);

    Sortable.shell_sort(staff);
    // for (Employee e : staff)
    //   e.raiseSalary(5);
    for (Employee e : staff)
      e.print();

    System.out.println();

    Employee[] staff2 = new Employee[3];
    staff2[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
    staff2[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
    staff2[2] = new Employee("Isabel Vidal", 1900000, 1, 11, 1993);
    Sortable.shell_sort(staff2);
    int i;
    // for (i = 0; i < 3; i++)
    //   staff2[i].raiseSalary(5);
    for (i = 0; i < 3; i++)
      staff2[i].print();

    System.out.println();

    Manager[] boss = new Manager[3];
    boss[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
    boss[1] = new Manager("Maria Bianchi", 1500000, 1, 12, 1991);
    boss[2] = new Manager("Isabel Vidal", 1900000, 1, 11, 1993);

    Sortable.shell_sort(boss);

    for (Manager m : boss)
      m.print();

  }
}
