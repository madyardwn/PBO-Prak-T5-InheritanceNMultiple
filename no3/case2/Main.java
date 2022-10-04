class Main {
  public static void main(String[] args) {

    // EMPLOYEE :
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
    staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
    staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

    // Error, dikarenakan tidak tidak mengimplements
    // interface ISortTable

    // ISortTable.sort(staff);

    for (Employee e : staff)
      e.raiseSalary(5);
    for (Employee e : staff)
      e.print();

    System.out.println();

    // MANAGER :
    Manager[] boss = new Manager[3];
    boss[0] = new Manager("Achmadya", 2000000, 1, 10, 1989);
    boss[1] = new Manager("Ridwan", 1500000, 1, 12, 1991);
    boss[2] = new Manager("Ilyawan", 3000000, 1, 11, 1993);

    ISortTable.shell_sort(boss);

    for (Employee e : boss)
      e.raiseSalary(5);
    for (Manager m : boss)
      m.print();
  }
}
