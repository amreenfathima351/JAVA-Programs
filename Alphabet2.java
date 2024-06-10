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
public class Alphabet2 {
    public static void main(String[] args){
        int alpha=65,n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alpha+i)+" ");
            }
            System.out.println();
        }
    }
    
}
