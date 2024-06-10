/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author fathi
 */
public class PrintHelloWorld {
    public static void main(String[] args){
        System.out.print("First Method");
        if(System.out.printf("Hello World"+"\n")==null){
        }
        System.out.print("Second Method");
        if(System.out.append("Hello World"+"\n")==null){
        }
        System.out.print("Third Method");
        if(System.out.append("Hello World"+"\n").equals(null)){
        }
        System.out.print("Fourth Method");
        for(int i=0;i<1;System.out.println("Hello World")){
            i++;
        }
    }
    
}
