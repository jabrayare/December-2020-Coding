import java.util.*;
public class FindNUniquieIntsSumtoZero {

  public static int[] sumZero(int n) {
    int[] uniqueArr = new int[n];
    for (int i = 0; i < uniqueArr.length - 1; i += 2) {
      uniqueArr[i] = i + 1;
      uniqueArr[i + 1] = -(i + 1);
    }
    return uniqueArr;
  }
  public static void main(String[] args){
    System.out.println(Arrays.toString(sumZero(5)));
  }
}
