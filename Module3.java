public class Module3 {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2; 
            }
            num /= 2; 
            for (int j = i - 1; j >= 1; j--) {
                num /= 2; 
                System.out.print(num + " ");
            }
            
            System.out.println("@");
        }
    }
}
