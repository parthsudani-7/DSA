class Main {
    public static void main(String[] args) {

        int n = 6;                 
        int k = n ;             
        int spaces = 0;
        
        for(int i = 0; i < n; i++){
            System.out.print("  ".repeat(n - i));
            System.out.println("* ".repeat(i));
            
        }
    }
}
