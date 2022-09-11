import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Code Lickage.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i  = 1; i<=num; i++){
            for(int j = 1; i<=num-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}