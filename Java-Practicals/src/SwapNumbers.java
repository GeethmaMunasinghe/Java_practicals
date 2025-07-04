import java.util.Scanner;

//Swap numbers without using Temp variable
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=10;
        int b=20;

        System.out.println(a+" "+b);
        a=a+b; //30
        b=a-b; //10
        a=a-b; //20

        System.out.println(a+" "+b);

    }
}
