class IntegerRange {
  public static void main(String[] args) {
    // the variable a is declared with a value outside the range
    int a = 1147483647;
    System.out.println(a);

    // the sum of the following expression is outside the appropriate int range
    int b = 1147483645 + 3;
    System.out.println(b);
  }
}