/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Arrays;
import java.util.BitSet;
/**
 *
 * @author fathi
 */
public class PrintNumber {
    public static void main(String[] args){
        Object num[]=new Object[100];
        Arrays.fill(num,new Object(){
            int count=0;
            public String toString(){
                return Integer.toString(++count);
            } 
        });
        System.out.println("ArrayFill");
        System.out.println(Arrays.toString(num));
        System.out.println("Bitset");
        String set=new BitSet(){{set(1,101);}}.toString();
        System.out.append(set,1,set.length());
    }
}
