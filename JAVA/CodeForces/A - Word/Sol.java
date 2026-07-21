import java.util.*;

public class Main {
    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int count = 0;
      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(ch >='a' && ch <= 'z'){
          count++;
        }
      }
      int upper = s.length() - count;
      if(upper > count){
        System.out.println(s.toUpperCase());
      }else if(count > upper){
        System.out.println(s.toLowerCase());
      }else{
        System.out.println(s.toLowerCase());
      }
    }
}
