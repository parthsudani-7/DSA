import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = 0; i < n; i++){
          char ch = s.charAt(i);

          if(!st.isEmpty()){
            if(st.peek() == ch){
              count++;
            }
            else{
              st.push(ch);
            }
          }
          else{
            st.push(ch);
          }
        }
        System.out.println(count);
    }
}
