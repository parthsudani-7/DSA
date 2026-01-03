public class Main {
    public static void main(String[] args) {

        int[] arr = {2 , 9, 2, 5, 7, 6, 5, 4};
        int prev = -1;       
        int min = 100000;     
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                count++;
                if (prev != -1) {
                    int dist = i - prev;
                    if (dist < min) {
                        min = dist;
                    }
                }
                prev = i;
            }
        }

        if (count < 2) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
