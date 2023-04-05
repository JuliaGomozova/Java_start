import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Исходный массив:");
        int[] arr = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -1};
        System.out.println(Arrays.toString(arr));
        //printArr(arr);

        System.out.println("Сортировка слиянием:");
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        //printArr(arr);

        System.out.println("----------------------");

        int[] arr2 = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -1};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr2));
        //printArr(arr2);

        arr2 = selectSort(arr2);
        System.out.println("Сортировка выборкой:");
        System.out.println(Arrays.toString(arr2));
        //printArr(arr2); 

    }

    // public static void printArr(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println(); 
    // }
    public static int[] mergeSort(int[] arr) {
        if(arr.length > 1){
            int [] l = new int[arr.length / 2];
            System.arraycopy(arr, 0, l, 0, arr.length / 2);

            int [] R = new int[arr.length - arr.length / 2];
            System.arraycopy(arr, arr.length / 2, R, 0, arr.length - arr.length / 2);

            l = mergeSort(l);
            R = mergeSort(R);

            int n = 0;
            int m = 0;
            int k = 0;

            int[] C = new int [l.length + R.length];
            while(n < l.length && m < R.length){
                if(l[n] <= R[m]){
                    C[k] = l[n];
                    n ++;
                }
                else{
                    C[k] = R[m];
                    m ++;
                }
                k ++;
            }
            while(n < l.length){
                C[k] = l[n];
                n ++;
                k ++;
            }
            while(m < R.length){
                C[k] = R[m];
                m ++;
                k ++;
            }
            for(int i = 0; i < arr.length; i++) arr[i] = C[i];
        }
        return arr;
    }

    public static int[] selectSort(int[] arr){
        if (arr.length > 1) {
            for(int pos = 0; pos < arr.length-1; pos++) {
                int min = arr[pos];
                int index = pos;
                for(int i = 1+pos; i < arr.length; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                        index = i;
                    }
                }
                arr[index] = arr[pos];
                arr[pos] = min;
            }
        }
        return arr;
    }
}