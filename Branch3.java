class Branch3 {
  public static void main (String[] args) {
    int num = Integer.parseInt(args[0]);
    switch (num) {
      case 1:
        System.out.println("入園料金：8,400円");
        break;
      case 2:
        System.out.println("入園料金：7,000円");
        break;
      case 3:
        System.out.println("入園料金：5,000円");
        break;
      default:
        System.out.println("１：一般, ２：中・高校生, ３：小学生・幼児");
    }
  }
}