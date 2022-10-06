import java.lang.String;
import java.util.*;
interface Add {
    int add(int a, int b);
}
interface subtract {
    int subtract(int a, int b);
}
interface multiply {
    int multiply(int a, int b);
}
public class Q2
{
public static void main( String[] args)
{
    Add addinterface=new Methodreference()::add;
    System.out.println(addinterface.add(2,6));
    subtract  subtractinterface=new Methodreference()::subtract;
    System.out.println(subtractinterface.subtract(8,2));
    multiply multiplyinterface=new Methodreference()::add;
    System.out.println(multiplyinterface.multiply(12,6));

}
    }

