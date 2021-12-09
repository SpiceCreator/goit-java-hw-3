class ATM {
  public static void main(String[] args) {
  
  }

  public int countBanknotes(int sum) {
    int count = 0;
    int[] buf = new int[2];
    buf = countCurrentBanknotes(sum, 0, 500);
    buf = countCurrentBanknotes(buf[0], buf[1], 200);
    buf = countCurrentBanknotes(buf[0], buf[1], 100);
    buf = countCurrentBanknotes(buf[0], buf[1], 50);
    buf = countCurrentBanknotes(buf[0], buf[1], 20);
    buf = countCurrentBanknotes(buf[0], buf[1], 10);
    buf = countCurrentBanknotes(buf[0], buf[1], 5);
    buf = countCurrentBanknotes(buf[0], buf[1], 2);
    buf = countCurrentBanknotes(buf[0], buf[1], 1);
    return buf[1];
  }

  public int[] countCurrentBanknotes(int sum, int count, int rate) {
      while (sum >= rate) {
          sum -= rate;
          count++;
      }
      return new int[] {sum, count};
  }
}