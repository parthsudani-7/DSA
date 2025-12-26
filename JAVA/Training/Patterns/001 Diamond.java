
class Main {
    public static void main(String[] args) {
        int n = 3;
        int k = n - 1;
        int j = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(" ".repeat(k));
            k--;
            System.out.print("* ".repeat(j));
            j++;
            System.out.println();
        }
        k = 0;
        j = n;
        for(int i = n; i > 0; i--){
            System.out.print(" ".repeat(k));
            k++;
            System.out.print("* ".repeat(j));
            j--;
            System.out.println();
        }
    }
}