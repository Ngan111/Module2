package introductionJava.thuchanh;

public class FindMin {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {11,2,4,6,7,9};
       int min= minValue(arr);
        System.out.printf("Min cua mang"+" "+min);
    }
}

