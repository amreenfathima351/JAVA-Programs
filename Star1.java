package practice;
import java.util.Scanner;
public class Star1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter N:");
        n=scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
