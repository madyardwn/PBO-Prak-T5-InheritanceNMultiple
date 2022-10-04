public interface ISortTable {
  public abstract int compare(ISortTable b);
  public static void shell_sort(ISortTable[] a) { // Shell sort body
    int n = a.length;
    int h = 1;
    while (h < n / 3)
      h = 3 * h + 1;
    while (h >= 1) {
      for (int i = h; i < n; i++) {
        for (int j = i; j >= h && a[j].compare(a[j - h]) < 0; j -= h) {
          ISortTable t = a[j];
          a[j] = a[j - h];
          a[j - h] = t;
        }
      }
      h = h / 3;
    }
  }
}

