public class MaxNumInArray {
    public static int findMax(int [] arr){
        int max=arr[0];
        for (int num:arr){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers={10,20,90,56,32};
        System.out.println("Maximum number is: "+findMax(numbers));
    }
}
