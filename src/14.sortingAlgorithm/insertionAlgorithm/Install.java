package sortingAlgorithm.insertionAlgorithm;

public class Install {
static int[] list = {24, 6, 94, 18, 20, 19, 10};//length:7
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i -1;k >= 0 && list[k] > currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i =0; i < list.length; i++)
            System.out.print(list[i]+"\t");
    }
}
