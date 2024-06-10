package practice;
import java.util.stream.IntStream;
public class PrintNumbersWithoutUsingLoop {
    public static void main(String[] args){
        System.out.println("Recursion");
        printnumber(1);
        System.out.println("InputStream");
        IntStream.range(1,101).forEach(e -> System.out.println(e));
    }
    public static void printnumber(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            printnumber(num);
        }
    }
    
}
