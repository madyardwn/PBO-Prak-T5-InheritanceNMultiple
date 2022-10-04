import java.util.*;

public class Manager extends Employee implements ISortTable {
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
