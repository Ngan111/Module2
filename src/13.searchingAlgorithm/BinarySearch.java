package searchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {6,10,18,19,20,24,205,267,680};
    static int binarySearch(int[] list, int key) {
        int low = 0; //điểm bắt đầu là phần tử 6, có index là 0.
        int high = list.length - 1; // điểm cuối cùng là 680, có index là 8.
        while (high >= low) {
            int mid = (low + high)/2; // mid là phần tử 20,có index = 4.
            if (key < list[mid])
                high = mid - 1;
            //Nếu key cần tìm nhỏ hơn 20, thuật toán sẽ duyệt về phía bên trái của list cho đến khi tìm dc giá trị.
            else if (key == list[mid])
                return mid;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,24));
        System.out.println(binarySearch(list,10));
    }
}
