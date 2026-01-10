import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {2, 2, 1, 5, 2, 6, 2, 1, 2, 4, 7, 2};
      int val = 0, max = 0;
      int n = arr.length;
      int[] ans = new int[101];
      Arrays.fill(ans, -1);
      
      for(int i = 0; i < n; i++){
        if(ans[arr[i]] < 0){
          ans[arr[i]] = i;
        }
        else{
          val = i - ans[arr[i]] + 1;
        }
        if(val > max) max = val;
      }      
      
      System.out.print(max);
  }
}