public class FibonacciSeries {
    public static void printFibonacci(int count){
        int a=0,b=1;
        System.out.println("a: "+a +" b: "+b);
        for (int i=2;i<count;i++){
            int next=a+b;
            System.out.println(next+" ");
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        int count=10;
        System.out.println("Print fibonacci...");
        printFibonacci(count);
    }
}
