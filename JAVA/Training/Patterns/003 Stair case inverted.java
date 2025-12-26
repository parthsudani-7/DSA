class Main {
    public static void main(String[] args) {

        int n = 60;                 
        int k = n ;             
        int spaces = 0;

        for (int i = 0; i < n / 2; i++) {

            System.out.print("  ".repeat(spaces));
            System.out.println("* ".repeat(k));
            System.out.print("  ".repeat(spaces));
            System.out.println("* ".repeat(k));

            spaces++;           
            k -= 2;             
        }
    }
}
