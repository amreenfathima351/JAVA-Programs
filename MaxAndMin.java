/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author fathi
 */
public class MaxAndMin {
    public static void main(String args[]){
        findMax(10,20,30);
        findMin(10,20,30);
    }
    public static void findMax(int a,int b,int c){
        int max=0;
        while(a>0||b>0||c>0){
            a--;
            b--;
            c--;
            max++;
        }
        System.out.println(max);
    }
    
    public static void findMin(int a,int b,int c){
        int min=0;
        while(a>0&&b>0&&c>0){
            a--;
            b--;
            c--;
            min++;
        }
        System.out.println(min);
    }
    
}
