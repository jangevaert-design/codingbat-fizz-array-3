public class fizzArray3 {
  public int[] fizzArray3(int start, int end) {
    int[] result = new int[end - start];
    int count = 0;

    for (int i = start; i < end; i++) {
      result[count] = i;
      count++;
    }
    return result;
  }
}
