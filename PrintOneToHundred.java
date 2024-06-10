/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author fathi
 */
public class PrintOneToHundred {
    public static void main(String[] args){
        int one='A'/'A'; //1
        String str=".........."; //10
        System.out.println("First Method");
        for(int i=one;i<=str.length()*str.length();i++){ //
            System.out.println(i);
        }
        System.out.println("Second Method");
        for(int i=one;i<='d';i+=one){ //
            System.out.println(i);
        }
    }
}
