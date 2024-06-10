/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;
public class FindDuplicateElements {
    public static void main(String[] srgs){
        String infra[]={"A","B","C","A","D"};
        System.out.println("Brute Force");
        for(int i=0;i<infra.length;i++){ //i=0;i<5 
            for(int j=i+1;j<infra.length;j++){ //j=1;j<5
                if(infra[i]==infra[j]){
                    System.out.println(infra[i]);
                }
            }
        }
    }
}
