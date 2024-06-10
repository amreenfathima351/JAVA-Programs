/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author fathi
 */
public class Star2 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
